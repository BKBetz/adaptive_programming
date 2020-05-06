package FMS;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // create four nodes
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");

        //set connections
        s0.setConnections("s1", "s2");
        s1.setConnections("s1", "s2");
        s2.setConnections("none", "s3");
        s3.setConnections("s3", "s0");

        // get user input
        String code = "";
        System.out.println("Enter a string with only A's and B's");
        Scanner input = new Scanner(System.in);
        String user_input = input.next();

        if(user_input.matches("^[a-bA-B]+$")) {
            // machine
            ArrayList<String> path = new ArrayList<String>();
            String path_step = "s0";
            path.add(path_step);
            code = user_input;
            for(String s : code.split("")) {
                switch (path_step) {
                    case "s0":
                        path_step = s0.machinePath(s.toUpperCase());
                        path.add(path_step);
                        break;
                    case "s1":
                        path_step = s1.machinePath(s.toUpperCase());
                        path.add(path_step);
                        break;
                    case "s2":
                        path_step = s2.machinePath(s.toUpperCase());
                        path.add(path_step);
                        break;
                    case "s3":
                        path_step = s3.machinePath(s.toUpperCase());
                        path.add(path_step);
                        break;
                }
            }

            System.out.println(path);
        }
        else {
            System.out.println("String contains more than just A & B");
        }
    }
}
