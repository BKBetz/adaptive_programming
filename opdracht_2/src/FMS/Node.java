package FMS;
import java.util.HashMap;

public class Node {
    private String name;
    private HashMap<String, Node> connections = new HashMap<String, Node>();


    public Node(String nm) {
        this.name = nm;
    }

    public void setConnections(Node[] links) {
        for(int i = 1; i < links.length + 1; i++) {
            connections.put(Integer.toString(i), links[i -1]);
        }
    }

    public String getName() {
        return this.name;
    }

    public Node machinePath(String code) {
        if(code == "") {
            Node end = new Node("stop");
            return end;
        }

        else {
            System.out.println(code);
            if (Integer.parseInt(code) <= connections.size()) {
                return connections.get(code);
            } else {
                Node end = new Node("stop");
                return end;
            }
        }
    }
}
