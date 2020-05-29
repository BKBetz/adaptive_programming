package DSP;

public class Vlucht extends Stap{
    private int value;
    private Node endNode;

    public Vlucht(int val, Node en) {
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
}
