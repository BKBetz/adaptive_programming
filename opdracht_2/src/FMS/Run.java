package FMS;

public class Run {
    // U can try making several connections but this one follows the design I made
    static void runWithCode() {

        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");
        Node s4 = new Node("s4");
        Node s5 = new Node("s5");
        Node endNode = new Node("end");

        Node[] a ={s3, s5, s4};
        Node[] b ={s2, s5, s1, s3};
        Node[] c ={s1, s4};
        Node[] x ={s1, s2};
        Node[] y ={s0, s2, endNode};
        Node[] z ={s0, s4};
        s0.setConnections(x);
        s1.setConnections(y);
        s2.setConnections(z);
        s3.setConnections(a);
        s4.setConnections(b);
        s5.setConnections(c);

        // the code is an array. this way it can also uses numbers above 10
        // the numbers can't be higher than the amounts of connections
        // for example out of all the nodes s4 has the most connections (4 in total) if u give a number higher than this
        // it will return a node None
        String[] code ={"1", "2", "2", "3"};
        String[] code_2 ={"2", "2", "4", "2", "1", "3"};

        System.out.println("The following path has been generated:");
        System.out.println(s0.Next(s0, code));
        System.out.println("The following path has been generated:");
        System.out.println(s0.Next(s0, code_2));
    }

    static void runWithChance() {

        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");
        Node s4 = new Node("s4");
        Node s5 = new Node("s5");
        Node endNode = new Node("end");

        Node[] a ={s3, s5, s4};
        Node[] b ={s2, s5, s1, endNode};
        Node[] c ={s1, s4};
        Node[] x ={s1, s2};
        Node[] y ={s0, s2, endNode};
        Node[] z ={s0, s4};
        s0.setConnections(x);
        s1.setConnections(y);
        s2.setConnections(z);
        s3.setConnections(a);
        s4.setConnections(b);
        s5.setConnections(c);
        // if u remove the endnodes from the connections it becomes infinite..Be carefull
        System.out.println("The following path has been generated:");
        System.out.println(s0.Next(s0, null));
    }
}
