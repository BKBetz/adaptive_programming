package tests;

import DSP.Node;
import DSP.Rit;
import DSP.Treinrit;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    Node n = new Node("n", true);
    Node x = new Node("x", true);
    @Test
    void setBagage() {
        // bagage is a boolean so we can just use assertTrue / assertFalse instead of assertEquals
        n.setBagage(false);
        assertFalse(n.getBagage());
    }

    @Test
    void getBagage() {
        assertTrue(x.getBagage());
    }

    @Test
    // These get and set tests are hard to test for me because they don't do much
    void setConnection() {
        n.setConnection(new Rit(10, x));

        assertTrue(n.getConnection().containsKey(x));
        assertTrue(n.getConnection().containsValue(10));

    }

    @Test
    void setType() {
        // by calling the setconnection u immediately use settype
        n.setConnection(new Rit(10, x));
        x.setConnection(new Treinrit(10, n));
        assertEquals(n.getType(), "Rit");
        assertEquals(x.getType(), "Treinrit");
    }

    @Test
    void setShortestPath() {
        List<Node> nodes = new LinkedList<>();
        nodes.add(x);

        n.setShortestPath(nodes);

        assertTrue(n.getShortestPath().contains(x));
    }

    @Test
    void setValue() {
        n.setValue(10);
        assertEquals(n.getValue(), 10);
    }
}