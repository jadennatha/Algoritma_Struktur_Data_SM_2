package LatihanPertemuan6;
import java.util.Scanner;

public class NilaiAkar {
    public int nilai;

    public int nilaiAkarBF(int n){
        int hasil = 1;
        if (n == 0 || n == 1){
            return n;
        }

        while (hasil * hasil <= n){
            hasil++;
        }
        
        return hasil - 1;
    }

    public int nilaiAkarDC(int n){
        int hasil = 0;
        int start = 1;
        int end = n;
        if (n == 0 || n == 1){
            return n;
        }
        
        while(start <= end){
            int mid = (start + end) / 2;
            if (mid * mid == n){
                return mid;
            }

            if (mid * mid < n){
                start = mid + 1;
                hasil = mid;
            } else {
                end = mid - 1;
            }
        }

        return hasil;
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int element = sc.nextInt();

        NilaiAkar [] akar = new NilaiAkar[element];
        for (int i = 0 ; i < element ; i++){
            akar[i] = new NilaiAkar();
            System.out.print("Masukkan nilai data ke-" + (i+1) + " : ");
            akar[i].nilai = sc.nextInt();
        }

        System.out.println("=================================================");
        System.out.println("Hasil faktorial Brute Force :");
        for (int i = 0; i < element; i++){
            System.out.println("Faktorial dari nilai " + akar[i].nilai + " adalah : " + akar[i].nilaiAkarBF(akar[i].nilai) );
        }
        
        System.out.println("=================================================");
        System.out.println("Hasil faktorial Divide and Conquer :");
        for (int i = 0; i < element; i++){
            System.out.println("Faktorial dari nilai " + akar[i].nilai + " adalah : " + akar[i].nilaiAkarDC(akar[i].nilai) );
        }

        System.out.println("=================================================");
    }
}
