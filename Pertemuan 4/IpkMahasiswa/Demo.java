package IpkMahasiswa;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kelas kelas1A = new Kelas(5);
        Mahasiswa mhs1 = new Mahasiswa("Ani", 18, 4.00);
        Mahasiswa mhs2 = new Mahasiswa("Budi", 19, 3.50);
        Mahasiswa mhs3 = new Mahasiswa("Cica", 17, 3.75);
        Mahasiswa mhs4 = new Mahasiswa("Deni", 20, 3.15);
        Mahasiswa mhs5 = new Mahasiswa("Eka", 18, 3.00);

        kelas1A.add(mhs1);
        kelas1A.add(mhs2);
        kelas1A.add(mhs3);
        kelas1A.add(mhs4);
        kelas1A.add(mhs5);

        System.out.println("Pilih nomor untuk tipe urutan : ");
        System.out.println("1. Berdasarkan IPK (ascending)");
        System.out.println("2. Berdasarkan IPK (descending)");
        System.out.println("3. Berdasarkan Umur");
        System.out.println("Masukkan nomor :");
        int menu = sc.nextInt();
        
        if (menu == 1){
            System.out.println("Berdasarkan IPK (ascending) :");
            kelas1A.bubbleSortByIPK();
            kelas1A.displayinfo();
        } else if(menu == 2 ){
            System.out.println("Berdasarkan IPK (descending) :");
            kelas1A.insertionSortByIPKDes();
            kelas1A.displayinfo();
        } else if(menu == 3){
            System.out.println("Berdasarkan Umur :");
            kelas1A.selectionSortByUmur();
            kelas1A.displayinfo();
        }
        sc.close();
    }
}
