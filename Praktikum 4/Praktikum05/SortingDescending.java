package Praktikum05;

public class SortingDescending {
    public static int[] bubbleSortDescending(int[] angka) {
        int n = angka.length;
        for (int i = 0 ; i < n- 1; i++){
            for (int j = 0; j < n - 1; j++){
                if (angka[j] < angka[j+1]){
                    int temp = angka[j];
                    angka[j] = angka[j+1];
                    angka[j+1] = temp;
                }
            }
        }
        return angka;
    }

    public static int[] selectionSortDescending(int [] angka){
        int n = angka.length;
        for (int i=0; i<n-1;i++) {
            int minIndex = i;

            for (int j=i+1;j<n;j++){
                if (angka[j] > angka[minIndex]){
                    minIndex=j;
                }
            }

            int temp = angka[minIndex];
            angka[minIndex] = angka[i];
            angka[i] = temp;
        }
        return angka;
    }

    public static int[] insertionSortDescending(int[] angka){
        int n = angka.length;
        for (int i = 1; i<n; i++){
            int key = angka[i];
            int j = i - 1;

            while (j >= 0 && angka[j] < key){
                angka[j+1] = angka[j];
                j=j - i;
            }

            angka[j+1]=key;
        }
        return angka;
    }

    public static void tampilkanDescending(int[] angka) {
        for (int i= 0; i < angka.length ; i++){
            System.out.print(angka[i] + " ");
        }

        System.out.println("\n");
    }

    public static void main(String[] args) {
        int DaftarAngka[] = { 4, 2, 6, 7, 11};
        DaftarAngka = bubbleSortDescending(DaftarAngka); 
        tampilkanDescending(DaftarAngka);

        DaftarAngka = selectionSortDescending(DaftarAngka);
        tampilkanDescending(DaftarAngka);

        DaftarAngka = insertionSortDescending(DaftarAngka);
        tampilkanDescending(DaftarAngka);

    }
}
