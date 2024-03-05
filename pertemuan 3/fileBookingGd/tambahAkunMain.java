package fileBookingGd;
import java.util.Scanner;
public class tambahAkunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tambahAkun[] customers = new tambahAkun[1];
        int i = 0;
        do {
            customers[i] = new tambahAkun();
            System.out.println("Tambah Akun user ke-" + (i+1));
            System.out.print("Masukkan username :");
            customers[i].username = sc.next();
            System.out.print("Masukkan Password :");
            customers[i].password = sc.next();
            i++;
        }while (i < 1);
        
        customers[0].login();
        customers[0].pesanGedung();
       
        }
    }

