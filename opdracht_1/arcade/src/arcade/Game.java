package arcade;

public class Game implements Machine{
    private String name;
    private double price;
    private int condition = 6;
    private int gameCode;
    private int jackpot;

    /* some rule
    *  - There can be more games with the same name, the gamecodes make them unique
    */

    public Game(String nm, double pC, int jP, int gC) {
        this.name = nm;
        this.price = pC;
        this.jackpot = jP;
        this.gameCode = gC;
    }

    public void setCondition(int cD) {
        this.condition = cD;
    }

    public int getCondition() {
        return this.condition;
    }

    public void setJackpot(int jP) {
        this.jackpot = jP;
    }

    public int getJackpot() {
        return this.jackpot;
    }

    public void setPrice(double pC) {
        this.price = pC;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public void machineBreakDown() {
            this.condition = this.condition -1;
    }


    @Override
    public String toString() {
        String condition_string = "";

        if(this.condition > 10 || this.condition < 0) {
            condition_string = "invalid status given";
        }
        switch (this.condition) {
            case 10:
                condition_string = "optimal";
                break;
            case 9:
                condition_string = "optimal";
                break;
            case 8:
                condition_string = "optimal";
                break;
            case 7:
                condition_string = "optimal";
                break;
            case 6:
                condition_string = "good";
                break;
            case 5:
                condition_string = "good";
                break;
            case 4:
                condition_string = "good";
                break;
            case 3:
                condition_string = "bad";
                break;
            case 2:
                condition_string = "bad";
                break;
            case 1:
                condition_string = "bad";
                break;
            case 0:
                condition_string = "broken";
                break;
        }

        String formattedString = String.format(
                "\n Game:%s Jackpot:%s tickets \n play price:%s euro condition:%s \n",
                this.name, this.jackpot, this.price, condition_string
        );
        return formattedString;
    }
}
