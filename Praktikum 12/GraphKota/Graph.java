package GraphKota;

public class Graph {
    public int[][] graphJarak;
    public int totalKota;
    public boolean gagal;

    public Graph(int totalKota) {
        this.totalKota = totalKota;
        this.graphJarak = new int[totalKota][totalKota];
    }

    public void addEgde(int i, int j, int jarak){
        if (i > totalKota - 1 || j > totalKota - 1){
            gagal = true;
        } else {
        graphJarak[i][j] = jarak;
        graphJarak[j][i] = jarak;
        }
    }

    public void removeEdge(int i, int j){
        graphJarak[i][j] = 0;
        graphJarak[j][i] = 0;
    }

    public void printMatriks(String[] kota){
        if (gagal == true){
            System.out.println("Graph melebihi jumlah verticel yang tersedia");
        } else {
            System.out.println("Berikut gambaran Graph berupa matriks : ");
            for (int i = 0; i < totalKota; i++){
                System.out.printf("%-15s%s", kota[i], ":");

                for (int jarak : graphJarak[i]){
                    System.out.print(jarak + " ");
                }

                System.out.println();
            }
        }
    }

    public void printJarak(String[] kota){
        if (gagal == true){
            System.out.println("Graph melebihi jumlah verticel yang tersedia");
        } else {
            System.out.println("Berikut list jarak antar kota :");
            for (int i = 0 ; i < totalKota; i++){
                System.out.println(kota[i] + " : ");
                for (int j = 0 ; j < totalKota ; j++){
                    if (graphJarak[i][j] != 0){
                        System.out.println("-  Jarak kota " + kota[i] + " ke kota " + kota[j] + " adalah " + graphJarak[i][j]);
                    }
                }
            }
        }
    }
}