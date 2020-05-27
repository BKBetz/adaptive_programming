package DSP;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

// De volgende code is gemaakt met behulp van een tutorial over dijkstra
// link: https://www.baeldung.com/java-dijkstra

public class Graph {
    private Set<Node> nodes = new HashSet<>();

    public void addRoute(Node nd) {
        nodes.add(nd);
    }

    public void setNodes(Set<Node> nodes) {
        this.nodes = nodes;
    }

    public Set<Node> getNodes() {
        return nodes;
    }

    public static Graph calculateShortestPathFrom(Graph gp, Node sc) {
        Set<Node> settledNodes = new HashSet<>();
        Set<Node> unsettledNodes = new HashSet<>();

        unsettledNodes.add(sc);

        while(unsettledNodes.size() != 0) {
            Node currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);

            for(Entry <Node, Integer> adjacencyPair : currentNode.getConnection().entrySet()) {
                Node adjacentNode = adjacencyPair.getKey();
            }
        }
    }

    private static Node getLowestDistanceNode(Set < Node > un) {
        Node lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for(Node n : un) {
            int nodeDistance = n.getValue();
            if(nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = n;
            }
        }

        return lowestDistanceNode;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "nodes=" + nodes +
                '}';
    }
}
