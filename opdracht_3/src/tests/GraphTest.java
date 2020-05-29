package tests;

import DSP.Graph;
import DSP.Node;
import DSP.Rit;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {
    Node a = new Node("A", true);
    Node b = new Node("B", true);
    Node c = new Node("C", true);
    Node d = new Node("D", true);

    Graph g1 = new Graph();

    @Test
    void addNode() {
        g1.addNode(a);
        assertTrue(g1.getNodes().contains(a));
    }

    @Test
    void calculateMinimumDistance() {
        a.setConnection(new Rit(10, b));
        a.setConnection(new Rit(15, c));

        g1.addNode(a);
        g1.addNode(b);
        g1.addNode(c);

        for(Map.Entry<Node, Integer> adjacencyPair : a.getConnection().entrySet()) {
            Node adjacentNode = adjacencyPair.getKey();
            Integer edgeWeight = adjacencyPair.getValue();
            g1.calculateMinimumDistance(adjacentNode, edgeWeight, a);
        }

        // calculateminimumdistance looks at the routes it is given and updates the shortest path of the adjecentNode
        // (b & c) with the currentNode(a) so that means that bij doing this both b & c should contain a
        assertTrue(b.getShortestPath().contains(a));
        assertTrue(c.getShortestPath().contains(a));

    }


    // I have no idea how to test this correctly
    @Test
    void calculateShortestPathFromSource() {
    }
}