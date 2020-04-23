package arcade;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    // I don't want to keep creating numeric codes for the game class and ticketstation class...
    // So random int was a good solution
    static int create_random() {
        int rand_int = ThreadLocalRandom.current().nextInt(1000, 10000);
        return rand_int;
    }

    static void create_test_1() {
        /* first test simple test to show it is all connected */
        Arcade a1 = new Arcade("GameStop", "Barendrecht");

        // Games
        Game g1 = new Game("Pacman", 0.50, 100, create_random());
        g1.setCondition("optimal");
        Game g2 = new Game("Galaga", 0.68, 150, create_random());
        g1.setCondition("good");
        Game g3 = new Game("mortal kombat 2", 0.50, 200, create_random());
        g3.setCondition("bad");
        a1.setGames(g1);
        a1.setGames(g2);
        a1.setGames(g3);


        // Employees
        Employee e1 = new Employee("Karel", "cashier");
        Employee e2 = new Employee("Timmy", "mechanic");
        a1.setEmployees(e1);
        a1.setEmployees(e2);

        //Prices
        Price p1 = new Price("nintendo switch", 25000, "console");
        Price p2 = new Price("Big bear", 2000, "knuffel");
        a1.setPrices(p1);
        a1.setPrices(p2);

        //TicketStations
        TicketStation t1 = new TicketStation(create_random(), 4);
        TicketStation t2 = new TicketStation(create_random(), 3);
        t1.setCondition("good");
        t2.setCondition("optimal");
        a1.setTicketStations(t1);
        a1.setTicketStations(t2);

        System.out.println(a1.toString());
    }

    public static void main(String[] args) {
        // not how you make a testfile, but I thought that putting 300 lines of testcode in your main didn't look nice either
        create_test_1();
    }
}
