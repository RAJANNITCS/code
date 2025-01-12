package ds_and_algo.Linkedlist;

class DNode {
    DNode prev;
    Integer data;
    DNode next;

    public DNode(Integer data) {
        this.prev = null;
        this.data = data;
        this.next = null;
    }
}

public class DoublyLinkedlistADT {
    DNode headNode = null;

    public void insertAtBeggingOfList(Integer data) {
        DNode tempNode = new DNode(data);
        if (this.headNode == null) {
            this.headNode = tempNode;
        } else {
            tempNode.next = this.headNode;
            this.headNode.prev = tempNode;
            this.headNode = tempNode;
        }
    }

    public void insertAtSpecificPoss(Integer data,Integer poss) {
        DNode temp = new DNode(data);
        DNode curr = this.headNode;
        if (poss <= 0) {
            System.out.println("poss is not valid!!!");
        }
        if (poss == 1) {
            this.headNode = temp;
        } else {
            for (int i = 0; (i < poss - 1 && curr.next != null); i++) {
                curr = curr.next;
            }
            temp.next = curr.next;
            temp.prev = curr;
            if (curr.next != null) {
                curr.next.prev = temp;
            }
            curr.next = temp;
        }
    }

    public void insertAtEndOffList(Integer data) {
        DNode temp = new DNode(data);
        if (this.headNode == null) {
            this.headNode = temp;
        } else {
            DNode curr = this.headNode;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
            temp.prev = curr;
        }
    }

    public void display() {
        if (this.headNode != null) {
            DNode curr = this.headNode;
            while (curr != null) {
                System.out.println(curr.data);
                curr = curr.next;
            }
        }
    }

    public static void displayRec(DNode curr) {
        if (curr != null) {
            System.out.println(curr.data);
            displayRec(curr.next);
        }
    }

    public Integer deleteFirstNodeOfList() {
        if (this.headNode == null) {
            System.out.println("List is empty !!");
            return 0;
        } else {
            DNode curr = this.headNode;
            headNode = headNode.next;
            headNode.prev.next = null;
            return curr.data;
        }
    }

    public Integer deleteNodeAtGivePoss(Integer poss) {
        if (poss <= 0) {
            System.out.println("List is empty !!!");
            return 0;
        }
        DNode curr = this.headNode;
        if (poss == 1) {
            headNode = headNode.next;
            headNode.prev.next = null;
        } else {
            for (int i = 0; i < poss - 1; i++) {
                curr = curr.next;
                if (curr == null) {
                    break;
                }
            }
            if (curr != null) {
                curr.prev.next = curr.next;
                if (curr.next != null) {
                    curr.next.prev = curr.prev;
                }
            } else {
                System.out.println("Provide wrong possion !!!");
                return 0;
            }

        }
        return curr.data;
    }

    public Integer deleteNodeAtEndOfList() {
        if (this.headNode == null) {
            System.out.println("List is empty !!!");
            return 0;
        }
        DNode curr = this.headNode;
        if (curr.prev == null && curr.next == null) {
            this.headNode = null;
            return curr.data;
        } else {
            while (curr.next != null) {
                curr = curr.next;
            }
            if (curr.prev != null) {
                curr.prev.next = null;
                return curr.data;
            }
        }
        return 0;
    }

}
