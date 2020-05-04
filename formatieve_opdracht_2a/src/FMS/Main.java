package FMS;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create four nodes
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");

        // get user input
        String code = "";
        System.out.println("Enter a string with only A's and B's");
        Scanner input = new Scanner(System.in);
        String user_input = input.next();

        if(user_input.matches("^[a-bA-B]+$")) {
            code = user_input;
        }
        else {
            System.out.println("String contains more than just A & B");
        }
    }
}
