package Praktikum05;

public class MainSortAngka {
    public static void main(String[] args) {
        int my1stNumbers[] = {8, 6, 10, 2, 4};
        my1stNumbers = SortingAngka.bubbleSort(my1stNumbers);
        SortingAngka.printArray(my1stNumbers);

        int my2ndNumbers[] = {7, 9, 3, 11, 1};
        my2ndNumbers = SortingAngka.selectionSort(my2ndNumbers);
        SortingAngka.printArray(my2ndNumbers);

        int my3rdNumbers[] = { 4, 1, 12, 6, 5};
        my3rdNumbers = SortingAngka.selectionSort(my3rdNumbers);
        SortingAngka.printArray(my3rdNumbers);
    }
}
