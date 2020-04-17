import java.util.List;
import java.util.ArrayList;

public class Main {
/*
Note: je ziet de list occupied staan. Dit is een list die gebruikt wordt
      om te kijken of een auto al bezet is of niet. Ik probeerde deze check in
      de class AutoHuur te maken, maar dat is me niet gelukt dus is dit de enige manier
      die ik kon bedenken.
*/

    public static void main(String[] args) {
        List occupied = new ArrayList();

        AutoHuur ah1 = new AutoHuur();
        // Print "Eerste autohuur: " + ah1.toString()
        System.out.println("Eerste autohuur: " + ah1.toString());

        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(10.0);
        ah1.setHuurder(k);
        // Print: "Eerste autohuur: " + ah1.toString()
        System.out.println("Eerste autohuur: " + ah1.toString());

        Auto a1 = new Auto("Peugeot 207", 50);
        if(occupied.contains(a1.type)) {
            ah1.setGehuurdeAuto(null);
        }
        else {
            ah1.setGehuurdeAuto(a1);
            occupied.add(a1.type);
        }
        ah1.setAantalDagen(4);
        // Print "Eerste autohuur:" + ah1.toString()
        System.out.println("Eerste autohuur: " + ah1.toString());

        AutoHuur ah2 = new AutoHuur();
        Auto a2 = new Auto("Ferrari", 3500);
        if(occupied.contains(a2.type)) {
            ah2.setGehuurdeAuto(null);
        }
        else {
            ah2.setGehuurdeAuto(a2);
            occupied.add(a2.type);
        }
        ah2.setHuurder(k);
        ah2.setAantalDagen(1);
        // Print "Tweede autohuur: " + ah2.toString()
        System.out.println("tweede autohuur: " + ah2.toString());

        AutoHuur ah3 = new AutoHuur();
        Auto a3 = new Auto("Ferrari", 3500);
        if(occupied.contains(a3.type)) {
            ah3.setGehuurdeAuto(null);
        }
        else {
            ah3.setGehuurdeAuto(a3);
            occupied.add(a3.type);
        }
        Klant j = new Klant("Karel");
        ah3.setHuurder(j);
        ah3.setAantalDagen(1);
        // Print "Tweede autohuur: " + ah2.toString()
        System.out.println("derde autohuur: " + ah3.toString());

        // Print "Gehuurd: " + ah1.getGehuurdeAuto()
        System.out.println("Gehuurd: " + ah1.getGehuurdeAuto());
        // Print "Gehuurd: " + ah2.getGehuurdeAuto()
        System.out.println("Gehuurd: " + ah2.getGehuurdeAuto());
    }
}
