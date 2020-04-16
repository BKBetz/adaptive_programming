public class Auto {
    String type;
    double prijsPerdag;

    public Auto(String tp, double prPd) {
        this.type = tp;
        this.prijsPerdag = prPd;
    }

    public void setPrijsPerdag(double prPd) {
        this.prijsPerdag = prPd;
    }

    public double getPrijsPerdag() {
        return this.prijsPerdag;
    }

    public String toString() {
        return type+ " " +prijsPerdag;
    }
}
