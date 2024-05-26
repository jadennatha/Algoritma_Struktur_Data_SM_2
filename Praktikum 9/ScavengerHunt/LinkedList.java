package ScavengerHunt;

public class LinkedList {
    Node head;
    String[] kunciJawaban = {"Semeru", "Bakso", "Brantas", "Kalimantan"};
    
    public boolean isEmpty(){
        return (head == null);
    }

    public void insertBefore(String key, String question) {
        Node newNode = new Node(question, null, null);
        
        if (head == null) {
            System.out.println("List kosong, tidak bisa memasukkan sebelum kata kunci.");
            return;
        }
        
        if (head.question == key) {
            newNode.next = head;
            head = newNode;
            return;
        }
        
        Node current = head;
        while (current.next != null && current.next.question != key) {
            current = current.next;
        }
        
        if (current.next == null) {
            System.out.println("Kata kunci tidak ditemukan dalam linked list.");
            return;
        }
        
        newNode.next = current.next;
        current.next = newNode;
    }

    public void insertAt(int index, String question) {
        Node newNode = new Node(question, null, null);
        
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

    public void removeAt(int index) {
        if (isEmpty()){
            System.out.println("Linked list kosong");
        } else if (index == 0) {
            head = head.next;
        } else {
            Node currentNode = head;
            int currentIndex = 0;

            while (currentNode != null && currentIndex < index - 1){
                currentNode = currentNode.next;
                currentIndex++;
            }

            currentNode.next = currentNode.next.next;
        }
    }
    
    public void addFirst(String question){
        Node newNode = new Node(question,null, null);

        if (isEmpty()){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void printPertanyaan(int index){
        Node currentNode = head;
        
        for (int i = 0; i < index; i++){
            currentNode = currentNode.next;
        }

        System.out.println(currentNode.question);
    }

    public void jawabPertanyaan(String answer, int index){
        Node currentNode = head;

        for (int i = 0; i < index; i++){
            currentNode = currentNode.next;
        }

        currentNode.answer = answer;
    }

    public boolean cekJawaban(String answer, int index){
        Node currentNode = head;

        for (int i = 0; i < index; i++){
            currentNode = currentNode.next;
        }

        return currentNode.answer.equalsIgnoreCase(kunciJawaban[index]);
    }

    public void printIsiLinkedList(){
        Node currentNode = head;

            while (currentNode != null){
                System.out.println(currentNode.question + " : "  + currentNode.answer);
                currentNode = currentNode.next;
            }
    }
}
