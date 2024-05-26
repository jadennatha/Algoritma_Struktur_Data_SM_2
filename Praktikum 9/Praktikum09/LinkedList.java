package Praktikum09;

public class LinkedList {
    Node head;

    public boolean isEmpty(){
        return (head == null);
    }

    public void print(){
        if (!isEmpty()){
            System.out.print("isi linked list: ");
            Node currentNode = head;

            while (currentNode != null){
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }

            System.out.println("");
        } else {
            System.out.println("linked list kosong");
        }
    }
    
    
    public void addFirst(int input){
        Node newNode = new Node(input, null);

        if (isEmpty()){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAfter(int key, int input) {
        Node newNode = new Node(input, null);

        if (!isEmpty()){
            Node currentNode = head;

            do {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.println("Linked list Kosong");
        }
    }
    
    public void insertAt(int index, int key) {
        Node newNode = new Node(key, null);
        
        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }
        
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        
        Node current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }
        
        if (current == null) {
            System.out.println("Indeks melebihi panjang linked list.");
            return;
        }
        
        newNode.next = current.next;
        current.next = newNode;
    }

    public void addLast (int input){
        Node newNode = new Node(input, null);

        if (isEmpty()){
            head = newNode;
        } else {
            Node currentNode = head;

            while (currentNode.next != null){
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }
    }

    public int HitungData(){
        Node currentNode = head;
        int index = 0;
        
        while (currentNode != null){
            currentNode = currentNode.next;
            index++;
        }

        return index;
    }

    public void getData(int index){
        Node currentNode = head;

        if (HitungData() < index){
            System.out.println("index lebih besar dari data yang ada");
            return;
        } else {
            for (int i = 0; i < index; i++){
                currentNode = currentNode.next;
            }
        }

        System.out.println("Data Pada index ke-" + index + ": "+ currentNode.data);
    }

    public int indexOf(int key){
        Node currentNode = head;
        int index = 0;

        while (currentNode != null && currentNode.data != key){
            currentNode = currentNode.next;
            index++;
        }

        if (currentNode == null){
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst(){
        if (!isEmpty()){
            head = head.next;
        } else {
            System.out.println("Linked List kosong");
        }
    }

    public void removeLast(){
        if (isEmpty()){
            System.out.println("Linked list kosong");
        } else if (head.next == null) {
            head = null;
        } else {
            Node currentNode = head;

            while (currentNode != null){
                if (currentNode.next.next == null){
                    currentNode.next = null;
                    break;
                }

                currentNode = currentNode.next;
            }
        }
    }

    public void remove(int key) {
        if (isEmpty()){
            System.out.println("Linked list kosong");
        } else if (head.data == key) {
            removeFirst();
        } else {
            Node currentNode = head;

            while (currentNode.next != null){
                if (currentNode.next.data == key){
                    currentNode.next = currentNode.next.next;
                    break;
                }

                currentNode = currentNode.next;
            }
        }
    }
}
