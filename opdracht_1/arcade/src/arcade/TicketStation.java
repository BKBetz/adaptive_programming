package arcade;

public class TicketStation implements Machine{
    private int stationCode;
    private int ports;
    //default condition
    private int condition = 6;
    private int occupied = 0;

    public TicketStation(int sC, int pT) {
        this.stationCode = sC;
        this.ports = pT;
    }

    public void setCondition(int cD) {
        this.condition = cD;
    }

    public int getCondition() {
        return this.condition;
    }

    public void setOccupied(int oC) {
        this.occupied += oC;
    }

    public String getOccupied() {
        return "currently there are "+ this.occupied + "taken";
    }

    public boolean checkIfOccupied() {
        if(this.occupied >= this.ports) {
            return true;
        }

        else {
            return false;
        }
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
                "\n Station:%s  ports:%s \n condition:%s \n",
                this.stationCode, this.ports, condition_string
        );
        return formattedString;
    }
}
