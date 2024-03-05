package FileMahasiswa;
import java.util.Scanner;
public class DataMahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahMahasiswa;
        float nilaiTotal = 0;
        float rata2Ipk;
        System.out.print("Masukkan banyaknya mahasiswa :");
        jumlahMahasiswa = sc.nextInt();

        DataMahasiswa[] mahasiswa = new DataMahasiswa[jumlahMahasiswa];

        for (int i = 0 ; i < mahasiswa.length; i++  ){
            mahasiswa[i] = new DataMahasiswa();
            System.out.println("Masukkan Nama Mahasiswa ke-" + (i+1));
            System.out.print("Masukkan Nama : ");
            mahasiswa[i].nama = sc.next();
            System.out.print("Masukkan NIM :");
            mahasiswa[i].Nim = sc.nextInt();
            System.out.print("Masukkan Jenis Kelamin : ");
            mahasiswa[i].JenisKelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK : " );
            mahasiswa[i].ipk = sc.nextFloat();
        }
        int i = 1;
        for (DataMahasiswa mhs : mahasiswa) {
            System.out.println("Data Mahasiswa ke-" + i++);
            System.out.println("Nama          : " + mhs.nama);
            System.out.println("NIM           : " + mhs.Nim);
            System.out.println("Jenis Kelamin : " + mhs.JenisKelamin);
            System.out.println("IPK           : " + mhs.ipk);
            nilaiTotal += mhs.ipk;
        }

        rata2Ipk = nilaiTotal/jumlahMahasiswa;
        System.out.println("Rata-rata IPK : " + rata2Ipk);
        

    }   
}
