package ScavengerHunt;
import java.util.Scanner;
public class ScavengerHuntGame {
    public static void main(String[] args) {
        String answer;
        boolean hasil = false;
        Scanner sc = new Scanner(System.in);
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.insertAt(0, "1. Apa Nama Gunung tertinggi di Jawa timur?");
        myLinkedList.insertAt(1, "2. Apa Makanan Khas Kota Malang?");
        myLinkedList.insertAt(2, "4. Apa nama pulau terbesar di indonesia?");
        myLinkedList.insertBefore("4. Apa nama pulau terbesar di indonesia?", "3. Apa Nama Sungai Terpanjang Di Jawa Timur?");
        myLinkedList.insertAt(4, "contoh linked list yang akan dihapus");
        myLinkedList.removeAt(4);

        System.out.println("------------------------------------------------------------------");
        System.out.println("           Selamat Datang Di Game Scavenger Hunt");
        System.out.println("Jawab Semua Pertanyaan dengan Benar untuk memperoleh harta karun");
        System.out.println("------------------------------------------------------------------");
        
        myLinkedList.printPertanyaan(0);
        do {
        answer = sc.next();
        myLinkedList.jawabPertanyaan(answer, 0);
        hasil = myLinkedList.cekJawaban(answer, 0);
        if (!hasil){
            System.out.println("Jawaban Salah Coba Lagi");
        }
        } while (!hasil);

        myLinkedList.printPertanyaan(1);
        do {
        answer = sc.next();
        myLinkedList.jawabPertanyaan(answer, 1);
        hasil = myLinkedList.cekJawaban(answer, 1);
        if (!hasil){
            System.out.println("Jawaban Salah Coba Lagi");
        }
        } while (!hasil);
        
        myLinkedList.printPertanyaan(2);
        do {
        answer = sc.next();
        myLinkedList.jawabPertanyaan(answer, 2);
        hasil = myLinkedList.cekJawaban(answer, 2);
        if (!hasil){
            System.out.println("Jawaban Salah Coba Lagi");
        }
        } while (!hasil);

        myLinkedList.printPertanyaan(3);
        do {
        answer = sc.next();
        myLinkedList.jawabPertanyaan(answer, 3);
        hasil = myLinkedList.cekJawaban(answer, 3);
        if (!hasil){
            System.out.println("Jawaban Salah Coba Lagi");
        }
        } while (!hasil);

        System.out.println("Selamat Anda Memperoleh Harta Karun");
        System.out.println("Berikut Hasil Jawaban Anda");
        myLinkedList.printIsiLinkedList();


    }
}