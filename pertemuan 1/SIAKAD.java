import java.util.Scanner;

public class SIAKAD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String matkul[] = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan kerja"};
        int sks[] = {2,2,2,2,2,2,3,2};
        int nilaiAngka[] = new int[8];
        String nilaiHuruf[] = new String[8];
        double bobotnilai[] = new double[8];
        double totalsks = 0;
        double totalbobotsks = 0;
        double ip = 0;

        System.out.println("================================");
        System.out.println("Program Penghitung IP Semester");
        System.out.println("================================");
        for (int i = 0; i < 8; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + matkul[i] + ": ");
            nilaiAngka[i] = input.nextInt();
        }
        System.out.println("================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("================================");

        for (int i = 0; i < 8; i++) {
            if (nilaiAngka[i] >= 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotnilai[i] = 4;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                bobotnilai[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                bobotnilai[i] = 3;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobotnilai[i] = 2.5;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                bobotnilai[i] = 2;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                bobotnilai[i] = 1;
            } else if (nilaiAngka[i] >= 0) {
                nilaiHuruf[i] = "E";
                bobotnilai[i] = 0;
            }
        }
        System.out.printf("%-40s%-20s%-20s%-20s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < 8; i++) {
            System.out.printf("%-40s%-20d%-20s%-20.2f\n", matkul[i], nilaiAngka[i], nilaiHuruf[i], bobotnilai[i]);
            totalbobotsks += bobotnilai[i] * sks[i];
            totalsks += sks[i];
        }
        ip = totalbobotsks / totalsks ;
        System.out.println("================================");
        System.out.printf("%s%.2f\n", "IP : ", ip);
    }
}
