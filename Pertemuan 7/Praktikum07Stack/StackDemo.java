package Praktikum07Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack myStack = new Stack(10);

        myStack.push("Basis Data");
        myStack.push("Algoritma Struktur Data");
        myStack.push("Matematika");

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
    
}
