package ScavengerHunt;
import java.util.Scanner;

class DoubleLinkedList {
    Node head;
    Node tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(String question, String answer) {
        Node newNode = new Node(question, answer);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public int hitungData(){
        Node currentNode = head;
        int jumlahData = 0;

        while (currentNode != null){
            currentNode = currentNode.next;
            jumlahData++;
        }

        return jumlahData;
    }

    public void cekJawaban(String[] userAnswer){
        Scanner sc = new Scanner(System.in);
        Node currentNode = head;
        boolean jikaBenar = false;
        for (int i = 0; i < hitungData(); i++){
            if (currentNode.answer.equalsIgnoreCase(userAnswer[i])){
                currentNode = currentNode.next;                    
                jikaBenar = true;
            } else {
                break;
            }            
        }
        if (jikaBenar == true){
            System.out.println("Anda Berhasil, Anda memperoleh harta karun");
        } else {
            System.out.println("Anda gagal, terdapat jawaban salah");
            System.out.println("mulai ulang (y/n)?");
            char ulang;
            ulang = sc.next().charAt(0);
            if (ulang == 'y'){
                playGame();
            } 
        }
    }

    public void playGame() {
        String userAnswer[] = new String[4];
        char kembali;
        Scanner scanner = new Scanner(System.in);
        Node currentNode = head;
        
        for (int i = 0; i < hitungData() ; i++){
            System.out.println(currentNode.question);
            userAnswer[i] = scanner.next();
            if (i > 0) {
                System.out.println("Ingin Kembali (y/n) ?");
                kembali = scanner.next().charAt(0);
                if (kembali == 'y'){
                    currentNode = currentNode.prev;
                    i = i - 2;
                } else {
                    currentNode = currentNode.next;
                }
            } else {
                currentNode = currentNode.next;
            }
        }
        cekJawaban(userAnswer);
    }
}