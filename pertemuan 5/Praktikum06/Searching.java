package Praktikum06;
public class Searching{
    public static int sequentalSearch(int[] arr, int key){
        boolean dataDitemukan = false;
        int indeks = 0;
        for (int i = 0; i < arr.length ; i++){
            if (arr[i]==key){
                dataDitemukan = true;
                return indeks = i;
            }
        }
        if (!dataDitemukan){
            return indeks = -1;
        }
        return indeks;

    }

    public static int binarySearchAsc(int [] arr, int key){
        int start = 0, end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid] < key){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static int binarySearchDes(int [] arr, int key){
        int start = 0, end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid] > key){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static int binarySearch(int [] arr, int key, boolean ascending){
        int left = 0;
        int right = arr.length - 1;

        if (ascending){
            while (left <= right) {
                int mid = left + (right - left) / 2;
                
                if (arr[mid] == key) {
                    return mid;
                }
                
                if (arr[mid] < key) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1;
        } else {
            while (left <= right) {
                int mid = left + (right - left) / 2;
                
                if (arr[mid] == key) {
                    return mid;
                }
                
                if (arr[mid] > key) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1;
        }
    }
}

    