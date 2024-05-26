import java.util.Scanner;
public class Rumus {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double jarak;
        double Kecepatan;
        double waktu;
        byte menu;
        byte keluar = 0;
        do{
            System.out.println("===============================================");
            System.out.println("  Program mencari Jarak, Kecepatan, dan Waktu");
            System.out.println("===============================================");
            System.out.println("1. Mencari Kecepatan");
            System.out.println("2. Mencari Jarak");
            System.out.println("3. Mencari Waktu");
            System.out.println("4. Keluar");
            System.out.print("Pilih rumus yang akan digunakan :");
            menu = input.nextByte();
            System.out.println("==============================================");

            switch (menu) {
                case 1:
                    System.out.print("Masukkan jarak yang ditempuh (km):");
                    jarak = input.nextDouble();
                    System.out.print("Masukkan waktu yang diperlukan (jam):");
                    waktu = input.nextDouble();
                    MencariKecepatan(jarak, waktu);
                    continue;
                case 2:
                    System.out.print("Masukkan kecepatan yang ditempuh (Km/jam) :");
                    Kecepatan = input.nextDouble();
                    System.out.print("Masukkan waktu yang diperlukan (Jam) :");
                    waktu = input.nextDouble();
                    MencariJarak(Kecepatan, waktu);
                    continue;
                case 3:
                    System.out.print("Masukkan jarak yang ditempuh (Km) :");
                    jarak = input.nextDouble();
                    System.out.print("Masukkan kecepatan yang diperlukan (Km/jam) :");
                    Kecepatan = input.nextDouble();
                    MencariWaktu(Kecepatan, jarak);
                    continue;
                case 4:
                    keluar++;
                    break;
            }
        }while (keluar < 1);
    }
    static void MencariKecepatan(double jarak, double waktu){
        System.out.println("=================================================");
        double hasil = jarak / waktu;
        System.out.println("Kecepatan yang dibutuhkan adalah : " + hasil + " Km/jam");
        System.out.println();

    }
    static void MencariJarak(double Kecepatan, double waktu){
        System.out.println("=================================================");
        double hasil = Kecepatan * waktu;
        System.out.println("Jarak yang ditempuh adalah : " + hasil + " Km");
        System.out.println();
    }
    static void MencariWaktu(double Kecepatan, double jarak){
        System.out.println("=================================================");
        double hasil = jarak / Kecepatan;
        System.out.println("Waktu yang diperlukan adalah : " + hasil + " jam");
        System.out.println();
    }
}