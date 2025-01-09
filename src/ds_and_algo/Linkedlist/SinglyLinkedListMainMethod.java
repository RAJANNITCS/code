package ds_and_algo.Linkedlist;

public class SinglyLinkedListMainMethod {

    public static void main(String[] args) {
        SinglyLinkedlistADT sl1 = new SinglyLinkedlistADT();
        sl1.addNode(2);
        sl1.addNode(4);
        sl1.addNode(6);
        sl1.addNode(8);
        sl1.addNode(10);
        sl1.addNode(12);
        sl1.display();
//        System.out.println("Display list");
//        SinglyLinkedlistADT.displayV1(sl1.headNode);
//        SinglyLinkedlistADT.displayV2(sl1.headNode);
//        System.out.println("Node count = "+SinglyLinkedlistADT.count(sl1.headNode));
//        System.out.println("Node count = "+SinglyLinkedlistADT.countV1(sl1.headNode));
//        System.out.println("Sum of all Node elements = "+SinglyLinkedlistADT.sum(sl1.headNode));
//        System.out.println("Sum of all Node elements = "+SinglyLinkedlistADT.sumV2(sl1.headNode));
//        System.out.println("Max element of the list ="+SinglyLinkedlistADT.max(sl1.headNode));
//        System.out.println("Find max element from list "+SinglyLinkedlistADT.maxV2(sl1.headNode));
//        System.out.println("Find min elements "+SinglyLinkedlistADT.min(sl1.headNode));
//        System.out.println("Find key ="+SinglyLinkedlistADT.search(sl1.headNode,6));
//        System.out.println("find key = "+SinglyLinkedlistADT.searchV1(sl1.headNode,6));
//        SinglyLinkedlistADT.insert(sl1.headNode,6,55);
//        System.out.println("After Add Node");
//        SinglyLinkedlistADT.displayV1(sl1.headNode);
//        System.out.println("Insert at beginning of the list");
//        sl1.insertAtBeginning(55);
//        System.out.println("Insert at end of list");
//        sl1.insertAtEndOfList(55);
//        System.out.println("Delete at beginning....");
//        sl1.deleteAtBeginning();
//        System.out.println("Delete at end of list");
//        sl1.deleteAtEndOfList();
//        sl1.deleteAtEndOfList();
//        sl1.deleteAtEndOfList();
//        sl1.deleteAtEndOfList();
//        sl1.deleteAtEndOfList();
//        sl1.deleteAtEndOfList();
//        sl1.deleteAtEndOfList();
//        sl1.deleteAtEndOfList();
//        sl1.deleteAtEndOfList();
        System.out.println("Delete at positions");
        sl1.deleteAtPos(7);
        SinglyLinkedlistADT.displayV1(sl1.headNode);
    }

}
