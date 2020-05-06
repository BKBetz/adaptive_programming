package FMS;
import java.util.HashMap;

public class Node {
    private String name;
    private HashMap<String, String> connections = new HashMap<String, String>();

    public Node(String nm) {
        this.name = nm;
    }

    public void setConnections(String con_1, String con_2) {
        this.connections.put("A", con_1);
        this.connections.put("B", con_2);
    }

    public String machinePath(String code) {
        if(code.equals("A")) {
            return connections.get("A");
        }

        else if(code.equals("B")) {
            return connections.get("B");
        }
        else {
            return "none";
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", connections=" + connections +
                '}';
    }
}
