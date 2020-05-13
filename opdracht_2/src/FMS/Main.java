package FMS;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Node hoi = new Node("hoi", "tekst");
        String[] x ={"x", "y"};
        hoi.setConnections(x);
        System.out.println(hoi.toString());

        String code = "3";

        System.out.println(hoi.machinePath(code));
    }
}
