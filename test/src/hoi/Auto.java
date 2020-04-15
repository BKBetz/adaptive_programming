package hoi;

public class Auto {
    public String kleur;
    public int gewicht;
    public String merk;

    public Auto(String kl, int gew, String mk) {
        kleur = kl;
        gewicht = gew;
        merk = mk;
    }

    public static void main(String[] args) {
        Auto hoi = new Auto("rood", 22, "mercedes");
        System.out.println(hoi.kleur);
    }

}

