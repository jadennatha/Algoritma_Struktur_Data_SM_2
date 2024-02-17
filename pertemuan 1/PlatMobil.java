import java.util.Scanner;
public class PlatMobil {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        char inputKode;
        char KODE[] = {'A','B','C','D','E','F','G','H','L','N','T'};
        char KOTA[][] = {{'B','A','N','T','E','N'},
                        {'J','A','K','A','R','T','A'},
                        {'B','A','N','D','U','N','G'},
                        {'C','I','R','E','B','O','N'},
                        {'B','O','G','O','R'},
                        {'P','E','K','A','L','O','N','G','A','N'},
                        {'S','E','M','A','R','A','N','G'},
                        {'S','U','R','A','B','A','Y','A'},
                        {'M','A','L','A','N','G'},
                        {'T','E','G','G','A','L'}
                        };
        System.out.print("Masukkan Kode Daerah Kendaraan :");
        inputKode = input.next().charAt(0);
        if (inputKode == KODE[0]){
            for (int i = 0; i<6 ; i++){
                System.out.print(KOTA[0][i]);
            }
        }else if(inputKode == KODE[1]){
            for (int i = 0; i<7 ; i++){
                System.out.print(KOTA[1][i]);
            }
        }else if(inputKode == KODE[2]){
            for (int i = 0; i<7 ; i++){
                System.out.print(KOTA[2][i]);
            }
        }else if(inputKode == KODE[3]){
            for (int i = 0; i<7 ; i++){
                System.out.print(KOTA[3][i]);
            }
        }else if(inputKode == KODE[4]){
            for (int i = 0; i<5 ; i++){
                System.out.print(KOTA[4][i]);
            }
        }else if(inputKode == KODE[5]){
            for (int i = 0; i<10 ; i++){
                System.out.print(KOTA[5][i]);
            }
        }else if(inputKode == KODE[6]){
            for (int i = 0; i<8 ; i++){
                System.out.print(KOTA[6][i]);
            }
        }else if(inputKode == KODE[7]){
            for (int i = 0; i<8 ; i++){
                System.out.print(KOTA[7][i]);
            }
        }else if(inputKode == KODE[8]){
            for (int i = 0; i<6 ; i++){
                System.out.print(KOTA[8][i]);
            }
        }else if(inputKode == KODE[9]){
            for (int i = 0; i<6 ; i++){
                System.out.print(KOTA[9][i]);
            }
        }
    }
}