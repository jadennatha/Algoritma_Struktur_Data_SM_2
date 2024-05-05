package Praktikum6BruteForceDivideAndConquer;
import java.util.Scanner;
public class Faktorial {
    public int nilai;

    public int faktorialBF(int n){
        int faktor = 1;
        for (int i = 1; i <= n; i++){
            faktor = faktor * i;
            
        }

        return faktor;
    }

    public int faktorialDC(int n){
        if (n == 1){
            return 1;
        } else {
            int faktor = n * faktorialDC(n-1);
            return faktor;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int element = sc.nextInt();

        Faktorial [] fk = new Faktorial[element];
        for (int i = 0 ; i < element ; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i+1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("=================================================");
        System.out.println("Hasil faktorial Brute Force :");
        for (int i = 0; i < element; i++){
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai) + 
            " dengan iterasi sebanyak : " + fk[i].nilai);
        }
        
        System.out.println("=================================================");
        System.out.println("Hasil faktorial Divide and Conquer :");
        for (int i = 0; i < element; i++){
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai) + 
            " dengan iterasi sebanyak : " + fk[i].nilai); 
        }

        System.out.println("=================================================");
    }
}