package tests;

import DSP.Node;
import DSP.Rit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// The classes Rit, Treinrit and Vlucht are basically the same and only use the functions from Stap
// Therefore by testing Stap u test Rit, Treinrit and Vlucht as well
class StapTest {

    @Test
    void returnEndNode() {
        Node x = new Node("X", true);
        Rit y = new Rit(15, x);

        assertEquals(y.returnEndNode(), x);
    }

    @Test
    void returnValue() {
        Node x = new Node("X", true);
        Rit y = new Rit(15, x);

        assertEquals(y.returnValue(), 15);
    }
}