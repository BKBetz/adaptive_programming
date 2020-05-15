package tests;

import FMS.Node;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @org.junit.jupiter.api.Test
    void setConnections() {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");

        Node[] x ={s1, s2};
        s0.setConnections(x);

        // added 2 items so the size of connections should be 2
        assertEquals(2,  s0.getConnections().size());
        // if the for loop generates keys automatically (as I want it to do) the key should be 1 and it should return s1
        assertEquals(s0.getConnections().get("1"), s1);
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Node s0 = new Node("s0");
        assertEquals("s0", s0.getName());
    }

    @org.junit.jupiter.api.Test
    void machinePathCode() {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");

        Node[] x ={s1, s2};
        Node[] y ={s2, s0};

        s0.setConnections(x);
        s1.setConnections(y);

        String code = "1";
        String code_2 = "3";
        String code_3 = "0";

        Node right_outcome_1 = s0.machinePathCode(code);
        Node wrong_outcome_2 = s0.machinePathCode(code_2);

        Node right_outcome_3 = s1.machinePathCode(code);
        Node wrong_outcome_4 = s1.machinePathCode(code_2);
        Node wrong_outcome_5 = s1.machinePathCode(code_3);
        // several tests to show it works correct when values are good and when values are bad
        assertEquals(right_outcome_1, s1);
        assertEquals(wrong_outcome_2.getName(), "None" );

        assertEquals(right_outcome_3, s2);
        assertEquals(wrong_outcome_4.getName(), "None");

        assertEquals(wrong_outcome_5.getName(), "None");
    }

    @org.junit.jupiter.api.Test
    void machinePathChance() {

        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");

        Node[] x ={s1, s2};
        Node[] y ={s2, s0};

        s0.setConnections(x);
        s1.setConnections(y);

        Node outcome_1 = s0.machinePathChance();
        Node outcome_2 = s1.machinePathChance();

        /* This was a tricky one to test. It works with probabilities. For example s0 has s1 and s2 for connections,
        but the function has a 50% chance to return s1 and a 50% chance to return s2. BUT it has a 0% chance to return s0.
        therefore the best way I can test the function is by checking if it return anything (with anything I mean either s1 or s2)
        but s0. This same principle goes for the second test with s1
        * */
        assertNotEquals(s0, outcome_1);
        assertNotEquals(s1, outcome_2);
    }

    @org.junit.jupiter.api.Test
    void next() {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node endNode = new Node("end");

        Node[] x ={s1, s2};
        Node[] y ={s0, s2};
        Node[] z ={s0, s1};

        s0.setConnections(x);
        s1.setConnections(y);
        s2.setConnections(z);

        String[] code ={"1", "2", "2"};

        ArrayList outcome = new ArrayList();
        ArrayList empty = new ArrayList();
        outcome.add(s1.getName());
        outcome.add(s2.getName());
        outcome.add(s1.getName());

        // should return the same nodes as outcome
        assertEquals(outcome, s0.Next(s0,code));
        // should return empty since the while loop only begins when node != end
        assertEquals(empty, endNode.Next(endNode, null));
    }
}