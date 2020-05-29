package DSP;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Node {
    private String name;
    private HashMap<Node, Integer> connections = new HashMap<>();
    private Integer value = Integer.MAX_VALUE;
    private String type;
    private List<Node> shortestPath = new LinkedList<>();
    private boolean bagage;

    public Node(String nm, boolean bg) {
        name = nm;
        bagage = bg;
    }

    public void setBagage(boolean bagage) {
        this.bagage = bagage;
    }

    public boolean getBagage() {
        return bagage;
    }

    public void setConnection(Stap r) {
        // type will be used to determine the kind of trip
        setType(r.getClass());
        Node n = r.returnEndNode();
        Integer v = r.returnValue();

        connections.put(n, v);
    }

    public HashMap<Node, Integer> getConnection() {
        return connections;
    }

    public void setType(Class r) {
        // get the kind of class and change it into a string
        String r_string = r.getSimpleName();
        this.type = r_string;
    }

    public String getType() {
        return type;
    }

    public void setShortestPath(List<Node> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public List<Node> getShortestPath() {
        return shortestPath;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name;
    }
}
