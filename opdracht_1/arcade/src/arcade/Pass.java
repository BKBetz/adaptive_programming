package arcade;
import java.text.DecimalFormat;

public class Pass {
    private int passCode;
    private int tickets;
    private double currency;

    public Pass(int pC, int tK) {
        this.passCode = pC;
        this.tickets = tK;
    }

    public void setCurrency(double cN) {
        this.currency += cN;
    }

    public double getCurrency() {
        return this.currency;
    }

    public void setTickets(int tK) {
        this.tickets += tK;
    }

    public int getTickets() {
        return this.tickets;
    }

    @Override
    public String toString() {
        return "Pass{" +
                "passCode=" + passCode +
                ", tickets=" + tickets +
                ", currency=" + currency +
                '}';
    }
}
