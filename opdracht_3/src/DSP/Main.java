package DSP;

public class Main {
    public static void main(String[] args) {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");

        a.setConnection(new Treinrit(10, b));
        a.setConnection(new Treinrit(15, c));
        b.setConnection(new Treinrit(12, d));
        b.setConnection(new Treinrit(15, f));
        c.setConnection(new Treinrit(10, e));
        d.setConnection(new Treinrit(1, f));
        d.setConnection(new Treinrit(2, e));
        f.setConnection(new Treinrit(5, e));

        Graph g1 = new Graph();

        g1.addNode(a);
        g1.addNode(b);
        g1.addNode(c);
        g1.addNode(d);
        g1.addNode(e);
        g1.addNode(f);
        g1.calculateShortestPathFromSource(g1, a);


        Reis r = new Reis(e, e.getShortestPath());
        r.createRoute();
    }
}
