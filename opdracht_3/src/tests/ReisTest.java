package tests;

import DSP.Node;
import DSP.Reis;
import DSP.Rit;
import DSP.Vlucht;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReisTest {
    Node a = new Node("A", true);
    Node b = new Node("B", true);
    Node c = new Node("C", true);
    Node d = new Node("D", true);
    Node e = new Node("E", true);

    List<Node> route = new LinkedList<>();

    @Test
    void checkIfRouteIsPossible() {
        a.setConnection(new Rit(10, c));
        b.setConnection(new Rit(5, c));
        c.setConnection(new Rit(10, b));

        route.add(a);
        route.add(b);
        route.add(c);

        Reis r = new Reis(d, route);

        assertTrue(r.checkIfRouteIsPossible());

        // when u add another kind of trip.. it isn't a valid route and should return false
        a.setConnection(new Vlucht(10, e));

        assertFalse(r.checkIfRouteIsPossible());
    }

    // The whole createRoute function only uses one if statement to print the right statements.
    // so I thought it wasn't worth testing
}