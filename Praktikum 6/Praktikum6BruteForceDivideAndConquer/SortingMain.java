package Praktikum6BruteForceDivideAndConquer;
public class SortingMain {
    public static void main(String[] args) {
        int data[] = {10,40,30,50,70,20,100,90};
        System.out.println("Sorting dengan merge sort");
        MergeSorting msort = new MergeSorting();
        System.out.println("data awal");
        msort.printArray(data);
        msort.MergeSort(data);
        System.out.println("setelah diurutkan");
        msort.printArray(data);
    }
}
