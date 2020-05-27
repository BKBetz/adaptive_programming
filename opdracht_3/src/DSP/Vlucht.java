package DSP;

public class Vlucht extends Stap{
    private int value;
    private Node endNode;
    private boolean baggage;

    public Vlucht(int val, Node en, boolean bg) {
        value = val;
        endNode = en;
        baggage = bg;

    }

    @Override
    public Node returnEndNode() {
        return endNode;
    }

    @Override
    public int returnValue() {
        return value;
    }

    public void setBaggage(boolean baggage) {
        this.baggage = baggage;
    }

    public boolean getBaggage() {
        return baggage;
    }
}
