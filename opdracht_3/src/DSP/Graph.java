package DSP;

import java.util.Map.Entry;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


// De volgende code is gemaakt met behulp van een tutorial over dijkstra
// om te laten zien dat ik het wel snap en niet stom gecopy paste heb heb ik er comments bij gezet
// link: https://www.baeldung.com/java-dijkstra

public class Graph {
    private Set<Node> nodes = new HashSet<>();

    public void addNode(Node nd) {
        nodes.add(nd);
    }

    public Set<Node> getNodes() {
        return nodes;
    }

    private static Node getLowestDistanceNode(Set <Node> un) {
        // kijkt alle nodes in unsettled en pakt de node met de laagste value
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

    public static void calculateMinimumDistance(Node en, Integer ew, Node sn) {
        Integer sourceDistance = sn.getValue();
        // kijkt naar de connecties en berekent welke node de korste route is

        if(sourceDistance + ew < en.getValue()) {
            // pas de huidige value aan van en als deze groter is dan de waarde sn + ew
            en.setValue(sourceDistance + ew);
            // pak de huidige path van sn en voeg de nieuwe waarde hieraan toe
            LinkedList<Node> shortestPath = new LinkedList<>(sn.getShortestPath());
            shortestPath.add(sn);
            en.setShortestPath(shortestPath);
        }
    }

    public static Graph calculateShortestPathFromSource(Graph gp, Node sc) {
        sc.setValue(0);

        Set<Node> settledNodes = new HashSet<>();
        Set<Node> unsettledNodes = new HashSet<>();

        unsettledNodes.add(sc);

        while(unsettledNodes.size() != 0) {
            // pak de node met de laagste waarde en haal deze ook gelijk als de unsettled list
            Node currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            // loop door de hashmap heen
            for(Entry<Node, Integer> adjacencyPair : currentNode.getConnection().entrySet()) {
                Node adjacentNode = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();
                if(!settledNodes.contains(adjacentNode)) {
                    calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            // voeg de currentnode toe aan de settled node om te tonen dat hier al mee gewerkt is
            settledNodes.add(currentNode);
        }
        return gp;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "nodes=" + nodes +
                '}';
    }
}
