package DSP;

public class Rit extends Stap{
    private int value;
    private Node endNode;

    public Rit(int val, Node en) {
        value = val;
        endNode = en;
    }

    @Override
    public Node returnEndNode() {
        return endNode;
    }

    @Override
    public int returnValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Rit{" +
                "value=" + value +
                ", endNode=" + endNode.toString() +
                '}';
    }
}
