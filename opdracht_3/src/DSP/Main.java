package DSP;

public class Main {
    public static void main(String[] args) {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");

        Graph g1 = new Graph();

        a.setConnection(new Treinrit(80, b));
        a.setConnection(new Treinrit(20, c));
        b.setConnection(new Treinrit(20, d));
        b.setConnection(new Treinrit(30, f));
        c.setConnection(new Treinrit(15, e));
        d.setConnection(new Treinrit(25, f));
        d.setConnection(new Treinrit(40, e));
        f.setConnection(new Treinrit(15, e));



        g1.addRoute(a);
        g1.addRoute(b);
        g1.addRoute(c);
        g1.addRoute(d);
        g1.addRoute(e);
        g1.addRoute(f);

        System.out.println(g1.toString());
    }
}
