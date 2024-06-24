package GraphKota;
import java.util.Scanner;

public class JarakKotaMain {
    public static void main(String[] args) {
        int jumlahKota;
        int jalan;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya kota : ");
        jumlahKota = sc.nextInt();
        Graph jarakKota = new Graph(jumlahKota);
        String []kota = new String[jumlahKota];

        for (int i = 0; i < jumlahKota; i++){
            System.out.print("Nama Kota ke-" + (i+1) + " : ");
            kota[i] = sc.next();
        }

        System.out.print("\nMasukkan banyak nya jalan : ");
        jalan = sc.nextInt();

        System.out.println("\nList Kota : ");
        for(int i = 0 ; i < jumlahKota ; i++) {
            System.out.println((i+1) + " " + kota[i]);
        }
        System.out.println("");
        for (int i=0 ; i < jalan; i++){
            System.out.println("Jalan ke-" + (i+1));
            System.out.print("Masukkan nama kota 1 : ");
            String kotaAwal = sc.next();
            int kota1 = 0;
            for (int j = 0 ; j < jumlahKota; j++){
                if (kotaAwal.equalsIgnoreCase(kota[j]))
                kota1 = j;
            }
            System.out.print("Masukkan nama kota 2 : ");
            String kotaTujuan = sc.next();
            int kota2 = 0;
            for (int k = 0 ; k < jumlahKota; k++){
                if (kotaTujuan.equalsIgnoreCase(kota[k]))
                kota2 = k;
            }
            System.out.print("Masukkan Jarak : ");
            int jarak = sc.nextInt();

            jarakKota.addEgde(kota1, kota2, jarak);
            System.out.println("");
        }
        
        jarakKota.printMatriks(kota);
        System.out.println("");
        jarakKota.printJarak(kota);
        sc.close();

    }
}
