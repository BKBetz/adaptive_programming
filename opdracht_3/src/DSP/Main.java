package DSP;

public class Main {
    public static void main(String[] args) {
        // shows 3 paths with the 3 classes for different outcomes
        Node a = new Node("A", true);
        Node b = new Node("B", true);
        Node c = new Node("C", true);
        Node d = new Node("D", true);
        Node e = new Node("E", true);
        Node f = new Node("F", true);

        // Shortest path should be A,C,E
        a.setConnection(new Vlucht(100, b));
        a.setConnection(new Vlucht(200, c));
        b.setConnection(new Vlucht(150, d));
        b.setConnection(new Vlucht(150, f));
        c.setConnection(new Vlucht(100, e));
        d.setConnection(new Vlucht(100, f));
        d.setConnection(new Vlucht(220, e));
        f.setConnection(new Vlucht(300, e));

        Graph g1 = new Graph();

        g1.addNode(a);
        g1.addNode(b);
        g1.addNode(c);
        g1.addNode(d);
        g1.addNode(e);
        g1.addNode(f);

        g1.calculateShortestPathFromSource(g1, a);


        Reis v = new Reis(e, e.getShortestPath());
        v.createRoute();

        Node g = new Node("G", true);
        Node h = new Node("H", true);
        Node i = new Node("I", true);
        Node j = new Node("J", true);
        Node k = new Node("K", true);
        Node l = new Node("L", true);

        // Shortest path should be G,H,J.L
        g.setConnection(new Rit(10, h));
        g.setConnection(new Rit(15, i));
        h.setConnection(new Rit(5, j));
        h.setConnection(new Rit(10, k));
        i.setConnection(new Rit(15, l));
        j.setConnection(new Rit(1, k));
        j.setConnection(new Rit(2 , l));
        k.setConnection(new Rit(5, l));

        Graph g2 = new Graph();

        g2.addNode(g);
        g2.addNode(h);
        g2.addNode(i);
        g2.addNode(j);
        g2.addNode(k);
        g2.addNode(l);

        g2.calculateShortestPathFromSource(g2, g);

        Reis r = new Reis(l, l.getShortestPath());
        r.createRoute();

        Node m = new Node("M", true);
        Node n = new Node("N", true);
        Node o = new Node("O", true);
        Node p = new Node("P", false);
        Node q = new Node("Q", true);
        Node s = new Node("S", true);

        // Shortest path should be M,N,P,S
        m.setConnection(new Treinrit(15, n));
        m.setConnection(new Treinrit(15, o));
        n.setConnection(new Treinrit(30, s));
        n.setConnection(new Treinrit(10, p));
        o.setConnection(new Treinrit(15, q));
        p.setConnection(new Treinrit(10, q));
        p.setConnection(new Treinrit(5 , s));
        q.setConnection(new Treinrit(10, s));

        Graph g3 = new Graph();

        g3.addNode(m);
        g3.addNode(n);
        g3.addNode(o);
        g3.addNode(p);
        g3.addNode(q);
        g3.addNode(s);

        g3.calculateShortestPathFromSource(g3, m);

        Reis tr = new Reis(s, s.getShortestPath());
        tr.createRoute();
    }
}
