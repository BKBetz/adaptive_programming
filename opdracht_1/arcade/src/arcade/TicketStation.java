package arcade;

public class TicketStation implements Machine{
    private int stationCode;
    private int ports;
    private String condition;

    public TicketStation(int sC, int pT) {
        this.stationCode = sC;
        this.ports = pT;
    }

    public void setCondition(String cD) {
        this.condition = cD;
    }

    public String getCondition() {
        return this.condition;
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

    @Override
    public String toString() {
        String formattedString = String.format(
                "\n Station:%s  ports:%s \n condition:%s \n",
                this.stationCode, this.ports, this.condition
        );
        return formattedString;
    }
}
