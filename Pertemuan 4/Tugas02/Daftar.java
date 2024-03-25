package Tugas02;
import java.util.Scanner;
public class Daftar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String konfirmasi;
        Hotel penginapan[] = new Hotel[5];
        penginapan[0] = new Hotel("Hotel Mawar", 250000, 4.5);
        penginapan[1] = new Hotel("Hotel Melati",500000, 4.2);
        penginapan[2] = new Hotel("Hotel Kamboja", 350000, 4.7);
        penginapan[3] = new Hotel("Hotel Tulip", 600000, 4.9);
        penginapan[4] = new Hotel("Hotel Lavender", 400000, 4.4);

        System.out.println("Daftar Hotel :");
        for (Hotel hotel : penginapan) {
            hotel.cetakDaftar();;
        }
        System.out.print("Urutkan Berdasarkan Harga? (ya/tidak): ");
        konfirmasi = sc.next();
        System.out.println("Daftar Hotel Berdasarkan Harga :");
        if (konfirmasi.equalsIgnoreCase("ya")){
            for (int i = 0 ; i < penginapan.length; i++){
                penginapan[i].bubleSortByPrice(penginapan);
                penginapan[i].cetakDaftar();
            }
        } else if (konfirmasi.equalsIgnoreCase("tidak")){
            konfirmasi = null;
        }

        System.out.print("Urutkan Berdasarkan Rating? (ya/tidak): ");
        konfirmasi = sc.next();
        System.out.println("Daftar Hotel Berdasarkan Rating :");
        if (konfirmasi.equalsIgnoreCase("ya")){
            for (int i = 0 ; i < penginapan.length; i++){
                penginapan[i].selectionSortByRating(penginapan);
                penginapan[i].cetakDaftar();
            }
        } else if (konfirmasi.equalsIgnoreCase("tidak")){
            konfirmasi = null;
        }
        
    }   
}
