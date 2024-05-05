package Klinik;
import java.util.Scanner;
public class Pasien {
    public String nama;
    public String noID;
    public char jenisKelamin;

    public Pasien(String nama, String noID, char jenisKelamin){
        this.nama = nama;
        this.noID = noID;
        this.jenisKelamin = jenisKelamin;
    }

    public String toString(){
        return "Nama Pasien: " + nama + ", Nomor ID: " + noID + ", Jenis Kelamin: " + jenisKelamin;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan kapasitas queue: ");
        int kapasitas = sc.nextInt();
        int menu;

        Queue myQueue = new Queue(kapasitas);
        
        do {
            System.out.println("\n Masukkan operasi yang diinginkan");
            System.out.println("1. Input data antrian");
            System.out.println("2. Hapus antrian pertama");
            System.out.println("3. Lihat daftar antrian");
            System.out.println("4. Lihat Pasien antrian pertama");
            System.out.println("5. Hapus semua antrian");
            System.out.println("6. Lihat Pasien antrian terakhir");
            System.out.println("7. Cari Data Pasien");
            System.out.println("8. Exit");
            System.out.println("---------------------------------------");

            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1 :
                    System.out.println("Masukkan nama pasien : ");
                    String namaPasien = sc.nextLine();
                    System.out.println("Masukkan nomor ID pasien : ");
                    String noID = sc.nextLine();
                    System.out.println("Masukkan jenis kelamin pasien : ");
                    char jenisKelamin = sc.next().charAt(0);

                    Pasien newPasien = new Pasien(namaPasien, noID, jenisKelamin);
                    myQueue.enqueue(newPasien);
                    break;
                case 2 :
                    Pasien deletedData = myQueue.dequeue();

                    if (deletedData != null){
                        System.out.println("Data yang dikeluarkan: " );
                        System.out.println(deletedData);
                    }

                    break;
                case 3 :
                    myQueue.print();
                    break;
                case 4 : 
                    myQueue.peek();
                    break;
                case 5 :
                    myQueue.clear();
                    break;
                case 6 :
                    myQueue.peekRear();
                    break;
                case 7 : 
                    System.out.println("Masukkan nama pasien : ");
                    String keyNama = sc.nextLine();
                    myQueue.peekPosition(keyNama);
            } 
        } while (menu >= 1 && menu <=7);
    }
}
