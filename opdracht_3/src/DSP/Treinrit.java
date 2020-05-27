package DSP;

public class Treinrit extends Stap{
    private int value;
    private Node endNode;

    public Treinrit(int val, Node en) {
        value = val;
        endNode = en;
    }

    @Override
    public int returnValue() {
        return value;
    }

    @Override
    public Node returnEndNode() {
        return endNode;
    }

    @Override
    public String toString() {
        return "Rit{" +
                "value=" + value +
                ", endNode=" + endNode.toString() +
                '}';
    }
}
