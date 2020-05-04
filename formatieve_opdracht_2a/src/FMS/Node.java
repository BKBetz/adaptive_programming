package FMS;
import java.util.HashMap;

public class Node {
    private String name;

    public Node(String nm) {
        this.name = nm;
    }

    public void setConnections(String con_1, String con_2) {
        HashMap<String, String> connections = new HashMap<String, String>();
        connections.put(con_1, con_2);
    }
}
