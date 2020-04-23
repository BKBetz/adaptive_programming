package arcade;

public class Game implements Machine{
    private String name;
    private double price;
    private String condition;
    private int gameCode;
    private int jackpot;

    public Game(String nm, double pC, int jP, int gC) {
        this.name = nm;
        this.price = pC;
        this.jackpot = jP;
        this.gameCode = gC;
    }

    public void setName(String nm) {this.name = nm;}

    public String getName() {return this.name;}

    public void setCondition(String cD) {
        this.condition = cD;
    }

    public String getCondition() {
        return this.condition;
    }

    @Override
    public String toString() {
        String formattedString = String.format(
                "\n Game:%s Jackpot:%s tickets \n play price:%s euro condition:%s \n",
                this.name, this.jackpot, this.price, this.condition
                );
        return formattedString;
    }

    @Override
    public void machineBreakDown() {
        switch(this.condition) {
            case "optimal":
                this.condition = "good";
                break;
            case "good":
                this.condition = "bad";
                break;
            case "bad":
                this.condition = "broken";
                break;
        }
    }
}
