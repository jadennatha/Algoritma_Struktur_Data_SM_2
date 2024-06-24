package Praktikum12;

public class Graph {
    public int numVertices;
    public int[][] adjMatrix;
    public boolean gagal = false;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        this.adjMatrix = new int[numVertices][numVertices];
    }

    public void addEgde(int i, int j, int weight){
        if (i > numVertices - 1 || j > numVertices - 1){
            gagal = true;
        } else {
        adjMatrix[i][j] = weight;
        adjMatrix[j][i] = weight;
        }
    }

    public void removeEdge(int i, int j){
        adjMatrix[i][j] = 0;
        adjMatrix[j][i] = 0;
    }

    public void print(){
        if (gagal == true){
            System.out.println("Graph melebihi jumlah verticel yang tersedia");
        } else {
            for (int i = 0; i < numVertices; i++){
                System.out.print(i + ": ");

                for (int weight : adjMatrix[i]){
                    System.out.print(weight + " ");
                }

                System.out.println();
            }
        }
    }

    public void getEdge(int i, int j){
        if (adjMatrix[i][j] != 0){
            System.out.println("terdapat edge");
        } else {
            System.out.println("tidak ada edge");
        }
    }

    public void getDegree(int vertex){
        int degree = 0;
        for (int i = 0 ; i < numVertices; i++){
            if(adjMatrix[vertex][i] != 0){
                degree++;
            }
        }
        System.out.println("jumlah edge pada vertex " + vertex + " : " + degree );
    }
}