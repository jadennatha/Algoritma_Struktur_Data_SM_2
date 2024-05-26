package Praktikum10;

public class DLLDemo {
    public static void main(String[] args) {
        DoubleLinkedList myDDL = new DoubleLinkedList();
        myDDL.print();
        myDDL.addFirst(800);
        myDDL.print();
        myDDL.addFirst(700);
        myDDL.print();
        myDDL.addLast(500);
        myDDL.print();
        System.out.println("Data Pada index ke-1 : "+ myDDL.getData(1));
        System.out.println("Data 800 berada pada index ke: " + myDDL.indexOf(800));
        myDDL.insertAfter(500, 750);
        myDDL.print();
        myDDL.printReverse();
        myDDL.removeFirst();
        myDDL.print();
        myDDL.removeLast();
        myDDL.print();
    }
}
