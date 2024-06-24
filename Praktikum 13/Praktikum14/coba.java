package Praktikum14;

public class coba {
    static int mymethod(int i, int j){
        if (i == 0){
            return 0;
        } else {
            return mymethod(i/j, j);
        }
    }

    public static void main(String[] args) {
        System.out.println(mymethod(6, 3));
    }
}
