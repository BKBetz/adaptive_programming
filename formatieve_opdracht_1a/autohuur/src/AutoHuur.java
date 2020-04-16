public class AutoHuur {
    private int aantalDagen;
    private Klant klant;
    private Auto auto;
    private double totaalprijs;

    public void AutoHuur() {
    }

    public void setAantalDagen(int aD) {
        aantalDagen = aD;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
        auto = gA;
    }

    public Auto getGehuurdeAuto() {
        return auto;
    }

    public void setHuurder(Klant k) {
        klant = k;
    }

    public Klant getHuurder() {
        return klant;
    }

    public double totaalPrijs() {
        double korting = klant.kortingspercentage / 100;
        totaalprijs = 5.5;
        return totaalprijs;
    }

    public String toString() {
        if(klant != null && auto != null && aantalDagen > 0)  {
            return
              "\nautotype: "+auto.type+" met prijs per dag: "+auto.prijsPerdag+
              "\nop de naam van: "+klant.naam+" ("+klant.kortingspercentage+")"+
              "\naantal dagen: "+aantalDagen+" en dat kost: "+totaalprijs;

        }
        else {
            return
            "\ner is geen auto bekend"+
            "\ner is geen huurder bekend"+
            "\naantal dagen:"+aantalDagen+" en dat kost: "+totaalprijs;
        }
    }
}
