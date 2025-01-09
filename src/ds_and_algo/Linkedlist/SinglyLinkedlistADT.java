package ds_and_algo.Linkedlist;

import java.util.Objects;

class Node {
    Integer data;
    Node next;

    public Node(Integer data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedlistADT {
    Node headNode = null;
    Node tailNode = null;

    public void addNode(Integer data) {
        Node newNode = new Node(data);
        if (this.headNode == null) {
            this.headNode = newNode;
            this.tailNode = newNode;
        }else {
            this.tailNode.next = newNode;
            this.tailNode = newNode;
        }
    }

    public void display() {
        Node currentNode = this.headNode;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static void displayV1(Node currentNode) {
        if (currentNode != null) {
            System.out.println(currentNode.data);
            displayV1(currentNode.next);
        }
    }

    public static void displayV2(Node currentNode) {
        if (currentNode != null) {
            displayV2(currentNode.next);
            System.out.println(currentNode.data);
        }
    }

    public Integer count(Node headNode) {
        Node curr = headNode;
        Integer count = 0;
        while(curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    public static Integer countV1(Node current) {
        if (current == null) {
            return 0;
        } else {
            return (countV1(current.next) + 1);
        }
    }

    public static Integer sum(Node curr) {
        Integer sum = 0;
        while (curr != null) {
            sum += curr.data;
            curr = curr.next;
        }
        return sum;
    }

    public static Integer sumV2(Node curr) {
        if (curr == null) {
            return 0;
        }else {
            return sumV2(curr.next) + curr.data;
        }
    }

    public static Integer max(Node curr) {
        Integer max = 0;
        if (curr != null) {
            max = curr.data;
            while (curr != null) {
                if (curr.data > max) {
                    max = curr.data;
                }
                curr = curr.next;
            }
        }
        return max;
    }

    public static Integer maxV2(Node curr) {
        Integer max = 0;
        if (curr == null) {
            return 0;
        } else {
            max = maxV2(curr.next);
            if (max > curr.data) {
                return max;
            }else {
                return curr.data;
            }
        }
    }

    public static Integer min(Node curr) {
        Integer min = 0;
        if (curr != null) {
            min = curr.data;
            while(curr != null) {
                if (curr.data < min) {
                    min = curr.data;
                }
                curr = curr.next;
            }
        }
        return min;
    }

    public static Integer search(Node curr,Integer key) {
        Integer count = 0;
        while (curr != null) {
            count++;
            if (Objects.equals(curr.data, key)) {
                return count;
            }
            curr = curr.next;
        }
        return -1;
    }

    public static Node searchV1(Node curr,Integer key) {
        if (curr == null) {
            return null;
        }
        if (key == curr.data) {
            return curr;
        }
        return searchV1(curr.next, key);
    }

    public void insertAtBeginning(Integer value) {
        Node tailNode = new Node(value);
        tailNode.next = this.headNode;
        this.headNode = tailNode;
    }

    public void insertAtEndOfList(Integer value) {
        Node curr = this.headNode;
        Node newNode = new Node(value);
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void insert(Integer poss, Integer value) {
        Node tailNode,curr;
        if (poss == 0) {
            tailNode = new Node(value);
            tailNode.next = this.headNode;
            this.headNode = tailNode;
        } else {
            curr = headNode;
            for (int i = 0; i < poss - 1 && curr != null; i++) {
                curr = curr.next;
            }
            if (curr != null) {
                tailNode = new Node(value);
                tailNode.next = curr.next;
                curr.next = tailNode;
                curr = null;
            } else {
                System.out.println("Possition is not valid !!");
            }
        }
    }

    public Integer deleteAtBeginning() {
        Integer value = 0;
        if (this.headNode != null) {
            Node curr = this.headNode;
            this.headNode = this.headNode.next;
            value = curr.data;
            curr = null;
        } else {
            System.out.println("List is Empty !!!");
        }
        return value;
    }

    public Integer deleteAtEndOfList() {
        Integer value = 0;
        if (this.headNode != null) {
            Node curr = this.headNode;
            Node tail = null;

            if (this.headNode.next == null) {
                value = this.headNode.data;
                this.headNode = null;
            }else {
                while (curr.next != null) {
                    tail = curr;
                    curr = curr.next;
                }
                value = curr.data;
                tail.next = curr.next;
                curr = null;
            }
        } else {
            System.out.println("List is Empty !!!");
        }
        return value;
    }

    public Integer deleteAtPos(Integer poss) {
        Integer value = -1;
        if (this.headNode != null) {
            Node curr = this.headNode;
            Node tail = null;
            if (poss == 1) {
                this.headNode = this.headNode.next;
                value = curr.data;
                curr = null;
            } else {
                for (int i = 0; i < poss -1 && curr != null; i++) {
                    tail = curr;
                    curr = curr.next;
                }
                if (tail != null && curr != null) {
                    tail.next = curr.next;
                    value = curr.data;
                    curr = null;
                }else {
                    System.out.println("Positions is not valid !!");
                }
            }
        } else {
            System.out.println("List is Empty !!");
        }
        return value;
    }

}
