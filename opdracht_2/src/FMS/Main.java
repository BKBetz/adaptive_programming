package FMS;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");
        Node[] x ={s1, s2};
        Node[] y ={s0, s2, s3};
        Node[] z ={s0, s1};
        s0.setConnections(x);
        s1.setConnections(y);
        s2.setConnections(z);

        String code = "14";
        ArrayList path = new ArrayList();

        Node first_s = s0;

        int i = 0;
        while(i <= code.length() - 1) {
            char code_value = code.charAt(i);
            first_s = first_s.machinePath(Character.toString(code_value));
            path.add(first_s.getName());
            i++;
        }

        System.out.println(path);
    }
}
