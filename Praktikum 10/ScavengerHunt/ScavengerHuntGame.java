package ScavengerHunt;
public class ScavengerHuntGame {
    public static void main(String[] args) {
       
        DoubleLinkedList myDDL = new DoubleLinkedList();
        myDDL.add("1. Apa Nama Gunung tertinggi di Jawa timur?", "Semeru");
        myDDL.add("2. Apa Makanan Khas Kota Malang?", "Bakso");
        myDDL.add("3. Apa Nama Sungai Terpanjang Di Jawa Timur?", "Brantas");
        myDDL.add("4. Apa nama pulau terbesar di indonesia?", "Kalimantan");

        System.out.println("------------------------------------------------------------------");
        System.out.println("           Selamat Datang Di Game Scavenger Hunt");
        System.out.println("Jawab Semua Pertanyaan dengan Benar untuk memperoleh harta karun");
        System.out.println("------------------------------------------------------------------");
        myDDL.playGame();
    }
}