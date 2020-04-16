public class Klant {

    String naam;
    double kortingspercentage;

    public Klant(String nm) {
        this.naam = nm;
    }

    public void setKorting(double kP) {
        this.kortingspercentage = kP;
    }

    public double getKorting() {
        return this.kortingspercentage;
    }

    public String toString() {
        return naam+" "+kortingspercentage;
    }
}
