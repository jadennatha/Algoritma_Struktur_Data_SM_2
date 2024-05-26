package Praktikum06;
public class programMain {
    public static void main(String[] args) {
        int[] daftarNilai = {10, 5, 20, 15, 5, 45};
        int indeks = Searching.sequentalSearch(daftarNilai, 5);
        if (indeks == -1){
            System.out.println("Data tidak ditemukan");
        } else {
            System.out.println("data ditemukan pada indeks ke-" + indeks);
        }

        int[] sortedNilai = {5, 5, 10, 20, 30, 40, 50};
        int index = Searching.binarySearchAsc(sortedNilai, 5);

        if (index != -1){
            System.out.println("Data ditemukan pada indeks ke-" + index);
        } else {
            System.out.println("Data tidak ditemukan");
        }
        
        int[] sortedDes = {50, 40 , 30, 20, 10, 5, 1};
        int urutan = Searching.binarySearchDes(sortedDes, 5);

        if (urutan != -1){
            System.out.println("Data ditemukan pada indeks ke-" + urutan);
        } else {
            System.out.println("Data tidak ditemukan");
        }
        
        int [] sortedValue = {23, 20, 14, 11, 10, 7, 3};
        boolean ascending;
        if (sortedValue[(sortedValue.length - 1)/2] < sortedValue[((sortedValue.length - 1)/2) + 1] ){
            ascending = true;
        } else {
            ascending = false;
        }
        int letak = Searching.binarySearch(sortedValue,20,ascending);

        if (letak != -1){
            System.out.println("data ditemukan pada indeks ke-" + letak);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
