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

    }
}
