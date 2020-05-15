package FMS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Node {

    /*
    * This class makes a path with all the nodes it passes by
    * I decided to make a "hybrid node" that can work with both a code and with probabilities
    * */
    private String name;
    private HashMap<String, Node> connections = new HashMap<String, Node>();

    public Node(String nm) {
        this.name = nm;
    }

    public void setConnections(Node[] links) {
        // This function makes an hashmap nodes
        // the keys are generated with the for loop and the values are the nodes
        for(int i = 1; i < links.length + 1; i++) {
            connections.put(Integer.toString(i), links[i -1]);
        }
    }

    public HashMap<String, Node> getConnections() {
        return connections;
    }

    public void setName(String nm) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Node machinePathCode(String code) {
        // Check if code is smaller or equal to the size of the connections
        // It can't be bigger then the size of connections and can't be smaller than 0
        if (Integer.parseInt(code) <= connections.size() && Integer.parseInt(code) > 0) {
            // with the code it receives it returns the correct node in the hashmap
            return connections.get(code);
        } else {
            // if the node is not found it returns an apart node with value None
            return new Node("None");
        }
    }

    public Node machinePathChance() {
        // functions works with the keys of the hashmap
        ArrayList conns = new ArrayList();
        Random rand = new Random();
        int randNum = rand.nextInt((connections.size() - 1) + 1) + 1;

        // add each key to the arraylist
        for(String i : connections.keySet()) {
            conns.add(i);
        }

        // chose one of the keys with the random num.
        // the num has to be in the list since it can only be between 1 and the size of the hashmap
        Node theChosenOne = connections.get(Integer.toString(randNum));

        return theChosenOne;
    }

    public ArrayList Next(Node n, String[] code) {
        ArrayList path = new ArrayList();
        Node first_s = n;

        // if there is a code. it uses the machinepath with a code. if there isn't a code it works with probability
        if(code != null) {
            int i = 0;
            while (i <= code.length - 1) {
                // get a singular number from the code
                String code_value = code[i];
                first_s = first_s.machinePathCode(code_value);
                path.add(first_s.getName());
                // if the next node is None or end it breaks the loop
                if(first_s.name == "None" || first_s.name == "end") {
                    break;
                }
                i++;
            }
        }

        else {
            // This loop keeps adding nodes until it hits an endNode
            while(first_s.name != "end") {
                first_s = first_s.machinePathChance();
                path.add(first_s.getName());
            }
        }

        return path;
    }
}
