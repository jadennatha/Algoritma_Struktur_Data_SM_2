package fileBookingGd;
import java.util.Scanner;

public class tambahAkun {
    Scanner sc = new Scanner(System.in);
    String username;
    String password;

    public void login(){
        System.out.println("==============================");
        System.out.println("selamat datang " + username);
        System.out.println("==============================");
       }
    
    public void pesanGedung(){
        String gedung;
        System.out.println("Pilih gedung :");
        System.out.println("1. Gedung pernikahan ");
        System.out.println("2. Gedung olahraga");
        System.out.print("Masukkan nama gedung :");
        gedung = sc.nextLine();
        if (gedung.equalsIgnoreCase("gedung pernikahan")){
            cetakinfo(gedung);
        }else if (gedung.equalsIgnoreCase("gedung olahraga")){
            cetakinfo(gedung);
        }
        System.out.println("==============================");
    }

    public void cetakinfo(String jenisGedung){
        System.out.println("==============================");
        System.out.println("Gedung yang dipesan : " + jenisGedung);
        System.out.println("Atas Nama           : " + username);
        System.out.println("TELAH DIPESAN");
        System.out.println("==============================");
        System.out.println("TERIMA KASIH");

    }
}




