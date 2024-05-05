package GerbangTol;

import java.util.Scanner;

public class Kendaraan {
    public String noPlat;
    public String noKartu;
    public double saldo;

    public Kendaraan(String noPlat, String noKartu, double saldo){
        this.noPlat = noPlat;
        this.noKartu = noKartu;
        this.saldo = saldo;
    }

    //public String toString(){
    //    return "No Plat :" + noPlat + ", No Kartu :" + noKartu + ", Saldo :" + saldo;
    //}

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan kapasitas queue: ");
        int kapasitas = sc.nextInt();
        int menu;

        Queue myQueue = new Queue(kapasitas);
        
        do {
            System.out.println("\n Masukkan operasi yang diinginkan");
            System.out.println("1. enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. Clear");
            System.out.println("6. Exit");
            System.out.println("---------------------------------------");

            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1 :
                    System.out.println("Masukkan nomor plat : ");
                    String noPlat = sc.nextLine();
                    System.out.println("Masukkan nomor kartu : ");
                    String noKartu = sc.nextLine();
                    System.out.println("Masukkan saldo : ");
                    double saldo = sc.nextDouble();

                    Kendaraan newKendaraan = new Kendaraan(noPlat, noKartu, saldo);
                    myQueue.enqueue(newKendaraan);
                    break;
                case 2 :
                    Kendaraan deletedData = myQueue.dequeue();

                    if (deletedData != null){
                        System.out.println("Data yang dikeluarkan: " );
                        System.out.println(deletedData);
                    }

                    break;
                case 3 :
                    myQueue.print();
                    break;
                case 4 : 
                    myQueue.peek();
                    break;
                case 5 :
                    myQueue.clear();
                    break;
            } 
        } while (menu >= 1 && menu <=5);
    }
}




