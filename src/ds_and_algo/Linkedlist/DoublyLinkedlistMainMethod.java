package ds_and_algo.Linkedlist;

public class DoublyLinkedlistMainMethod {
    public static void main(String[] args) {
        DoublyLinkedlistADT d1 = new DoublyLinkedlistADT();
//        d1.insertAtBeggingOfList(2);
//        d1.insertAtBeggingOfList(4);
//        d1.insertAtBeggingOfList(6);
//        d1.insertAtBeggingOfList(8);
//        d1.insertAtSpecificPoss(2,1);
//        d1.insertAtSpecificPoss(4,2);
//        d1.insertAtSpecificPoss(6,3);
//        d1.insertAtSpecificPoss(8,4);
//        d1.display();
//        d1.insertAtEndOffList(2);
//        d1.insertAtEndOffList(4);
//        d1.insertAtEndOffList(6);
//        d1.insertAtEndOffList(8);
//        d1.insertAtEndOffList(10);
//        DoublyLinkedlistADT.displayRec(d1.headNode);
        d1.display();
//        d1.deleteFirstNodeOfList();
//        System.out.println("After delete first node");
//        System.out.println("delete value="+d1.deleteNodeAtGivePoss(10));
//        System.out.println("After delete at give poss");
        System.out.println("Delete value="+d1.deleteNodeAtEndOfList());
        d1.display();
    }
}
