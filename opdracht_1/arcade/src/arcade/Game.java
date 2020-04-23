package arcade;

public class Game implements Machine{
    private String name;
    private double price;
    private String condition;
    private int jackpot;

    public Game(String nm, double pC, int jP) {
        this.name = nm;
        this.price = pC;
        this.jackpot = jP;
    }

    public void setCondition(String cD) {
        this.condition = condition;
    }

    public String getCondition() {
        return this.condition;
    }

    @Override
    public String toString() {
        return "hoi";
    }

    @Override
    public void machineBreakDown() {

    }
}
