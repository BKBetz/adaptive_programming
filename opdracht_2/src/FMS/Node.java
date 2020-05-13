package FMS;
import java.util.HashMap;
import java.util.ArrayList;

public class Node {
    private String name;
    private HashMap<String, Object> connections = new HashMap<String, Object>();
    private String type;

    public Node(String nm, String tp) {
        this.name = nm;
        this.type = tp;
    }

    public void setConnections(String[] links) {
        for(int i = 1; i < links.length + 1; i++) {
            connections.put(Integer.toString(i), links[i -1]);
        }
    }

    public Object machinePath(String code) {
        if(Integer.parseInt(code) < connections.size()) {
            return connections.get(code);
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
