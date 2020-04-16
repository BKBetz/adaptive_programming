public class Main {
    public static void main(String[] args) {
        AutoHuur ah1 = new AutoHuur();
        // Print "Eerste autohuur: " + ah1.toString()
        System.out.println("Eerste autohuur: " + ah1.toString());

        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(10.0);
        ah1.setHuurder(k);
        // Print: "Eerste autohuur: " + ah1.toString()
        System.out.println("Eerste autohuur: " + ah1.toString());

        Auto a1 = new Auto("Peugeot 207", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);
        // Print "Eerste autohuur:" + ah1.toString()
        System.out.println("Eerste autohuur: " + ah1.toString());

        AutoHuur ah2 = new AutoHuur();
        Auto a2 = new Auto("Ferrari", 3500);
        ah2.setGehuurdeAuto(a2);
        ah2.setHuurder(k);
        ah2.setAantalDagen(1);
        // Print "Tweede autohuur: " + ah2.toString()
        System.out.println("tweede autohuur: " + ah2.toString());

        // Print "Gehuurd: " + ah1.getGehuurdeAuto()
        System.out.println("Gehuurd: " + ah1.getGehuurdeAuto());
        // Print "Gehuurd: " + ah2.getGehuurdeAuto()
        System.out.println("Gehuurd: " + ah2.getGehuurdeAuto());
    }
}
