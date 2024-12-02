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

    public static Integer count(Node current) {
        Integer count = 0;
        while(current != null) {
            count++;
            current = current.next;
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
}
