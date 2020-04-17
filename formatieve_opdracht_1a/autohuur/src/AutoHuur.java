public class AutoHuur {
    private int aantalDagen;
    private Klant klant;
    private Auto auto;
    private double totaalprijs;

    public void AutoHuur() {
    }

    public void setAantalDagen(int aD) {
        this.aantalDagen = aD;
    }

    public int getAantalDagen() {
        return this.aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
        this.auto = gA;
    }

    public Auto getGehuurdeAuto() {
        return this.auto;
    }

    public void setHuurder(Klant k) {
        this.klant = k;
    }

    public Klant getHuurder() {
        return this.klant;
    }

    public double totaalPrijs() {
        double korting = this.klant.kortingspercentage / 100;
        this.totaalprijs = this.auto.prijsPerdag * this.aantalDagen * (1-korting);
        return this.totaalprijs;
    }

    public String toString() {

        if(klant != null && auto != null && aantalDagen > 0)  {
            return
              "\nautotype: "+this.auto.type+" met prijs per dag: "+this.auto.prijsPerdag+
              "\nop de naam van: "+this.klant.naam+" ("+this.klant.kortingspercentage+")"+
              "\naantal dagen: "+this.aantalDagen+" en dat kost: "+totaalPrijs()+"\n";
        }
        else {
            if(klant != null && auto == null) {
                 return
                    "\ner is geen auto bekend"+
                    "\nop de naam van: "+this.klant.naam+" ("+this.klant.kortingspercentage+")"+
                    "\naantal dagen:"+this.aantalDagen+" en dat kost: "+this.totaalprijs+"\n";
            }
            else if(klant == null && auto == null) {
                return
                    "\ner is geen auto bekend" +
                    "\ner is geen huurder bekend" +
                    "\naantal dagen:" + this.aantalDagen + " en dat kost: " + this.totaalprijs+"\n";
            }
            else {
                return
                    "\ner is geen auto bekend" +
                    "\ner is geen huurder bekend" +
                    "\naantal dagen:" + this.aantalDagen + " en dat kost: " + this.totaalprijs+"\n";
            }
        }
    }
}
