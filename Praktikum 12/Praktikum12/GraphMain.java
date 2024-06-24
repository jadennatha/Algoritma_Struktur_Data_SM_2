package Praktikum12;

public class GraphMain {
    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEgde(0, 1 , 2);
        g.addEgde(0, 2, 8);
        g.addEgde(1, 2, 4);
        g.addEgde(2, 3, 3);
        g.print();
        g.getEdge(0, 3);
        g.getDegree(0);
    }
}
