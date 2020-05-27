package DSP;

import java.util.HashMap;

public class Node {
    private String name;
    private HashMap<Node, Integer> connections = new HashMap<Node, Integer>();
    private int value;

    public Node(String nm) {
        name = nm;
    }

    public void setConnection(Stap r) {
        Node n = r.returnEndNode();
        value = r.returnValue();

        connections.put(n, value);
    }

    public HashMap getConnection() {
        return connections;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", connections=" + connections +
                '}';
    }
}
