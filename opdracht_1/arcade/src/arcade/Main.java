package arcade;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    // I don't want to keep creating numeric codes for the game class and ticketstation class...
    // So random int was a good solution
    static int create_random(int range_1, int range_2) {
        int rand_int = ThreadLocalRandom.current().nextInt(range_1, range_2);
        return rand_int;
    }

    static void create_test_1() {
        /* first test simple test to shows the arcade and what it contains */
        Arcade a1 = new Arcade("GameStop", "Barendrecht");

        // Games
        Game g1 = new Game("Pacman", 0.50, 100, create_random(1000, 10000));
        g1.setCondition(15);
        Game g2 = new Game("Galaga", 0.68, 150, create_random(1000, 10000));
        g1.setCondition(10);
        Game g3 = new Game("mortal kombat 2", 0.50, 200, create_random(1000, 10000));
        g3.setCondition(5);
        a1.setGames(g1);
        a1.setGames(g2);
        a1.setGames(g3);


        // Employees
        Employee e1 = new Employee("Karel", "cashier");
        Employee e2 = new Employee("Timmy", "mechanic");
        a1.setEmployees(e1);
        a1.setEmployees(e2);

        //Prices
        Prize p1 = new Prize("nintendo switch", 25000, "console");
        Prize p2 = new Prize("Big bear", 2000, "stuffed toys");
        a1.setPrices(p1);
        a1.setPrices(p2);

        //TicketStations
        TicketStation t1 = new TicketStation(create_random(1000,10000), 4);
        TicketStation t2 = new TicketStation(create_random(1000,10000), 3);
        t1.setCondition(10);
        t2.setCondition(6);
        a1.setTicketStations(t1);
        a1.setTicketStations(t2);

        System.out.println(a1.toString());
    }

    static void create_test_2() {
        /* this test shows how a game is played and how a customer is created.
            try to remove some of the play functions and
            see how the system print changes values
        */

        // create arcade
        Arcade a2 = new Arcade("GameGo", "Barendrecht");
        Game g4 = new Game("Centipede", 0.65, 200, create_random(1000,10000));
        Prize p3 = new Prize("South park plushie", 10, "stuffed toys");
        TicketStation t3 = new TicketStation(create_random(1000,10000), 3);
        t3.setCondition(8);

        a2.setGames(g4);
        a2.setPrices(p3);
        a2.setTicketStations(t3);

        System.out.print(a2.toString());

        // create customer and pass
        Customer c1 = new Customer("James", 8.00);
        Pass p1 = new Pass(create_random(100000,200000), 0);
        c1.setPass(p1);

        System.out.println(c1.toString());

        // add currency to your pass
        System.out.println(c1.addPassCurrency(7.00));

        // play the game a few times
        System.out.println(c1.play(g4));
        System.out.println(c1.play(g4));
        System.out.println(c1.play(g4));
        System.out.println(c1.play(g4));

        // show current status
        System.out.println(c1.toString());

        //deposit tickets
        System.out.println(c1.deposit_tickets(t3));

        // buy a prize
        System.out.println(c1.buyPrize(p3));

        // show new status
        System.out.println(c1.toString());

        // quit membership
        c1.setPass(null);
        System.out.println(c1.addPassCurrency(7.00));
        System.out.println(c1.play(g4));
        System.out.println(c1.toString());
    }

    static void create_test_3() {
        /* This test will show you how a ticketstation works
        * There can't be more people then there are ports at a ticketstation
        * that try to deposit tickets
        */

        // create arcade
        Arcade a3 = new Arcade("GameGo", "Barendrecht");
        Game g5 = new Game("Space invaders", 0.55, 400, create_random(1000,10000));
        TicketStation t4 = new TicketStation(create_random(1000,10000), 2);
        t4.setCondition(8);
        a3.setGames(g5);
        a3.setTicketStations(t4);

        System.out.println(a3.toString());

        // create customers and passes
        Customer c2 = new Customer("James", 8.00);
        Pass p2 = new Pass(create_random(100000,200000), 0);
        c2.setPass(p2);
        c2.addPassCurrency(5.00);
        Customer c3 = new Customer("Pieter", 8.00);
        Pass p3 = new Pass(create_random(100000,200000), 0);
        c3.setPass(p3);
        c3.addPassCurrency(5.00);
        Customer c4 = new Customer("Kees", 8.00);
        Pass p4 = new Pass(create_random(100000,200000), 0);
        c4.addPassCurrency(5.00);
        c4.setPass(p4);
        c2.play(g5);
        c3.play(g5);
        c4.play(g5);

        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());

        System.out.println(c2.deposit_tickets(t4));
        System.out.println(c3.deposit_tickets(t4));
        System.out.println(c4.deposit_tickets(t4));

    }

    static void create_test_4() {
        /* This test shows how the interface work.
           An machine has a certain condition
           each time a machine works the condition lowers
           only a mechanic can fix the condition
        * */

        //create arcade
        Arcade a4 = new Arcade("GameGo", "Barendrecht");
        Game g6 = new Game("California speed", 0.55, 400, create_random(1000,10000));
        TicketStation t5 = new TicketStation(create_random(1000,10000), 2);
        g6.setCondition(6);
        t5.setCondition(10);

        Game g7 = new Game("California speed", 0.55, 400, create_random(1000,10000));
        TicketStation t6 = new TicketStation(create_random(1000,10000), 2);
        g7.setCondition(0);
        t6.setCondition(0);

        Employee e3 = new Employee("mo", "cashier");
        Employee e4 = new Employee("Tony", "mechanic");

        a4.setGames(g6);
        a4.setGames(g7);
        a4.setTicketStations(t5);
        a4.setTicketStations(t6);
        a4.setEmployees(e3);
        a4.setEmployees(e4);

        System.out.println(a4.toString());

        //create customer
        Customer c5 = new Customer("James", 8.00);
        Pass p5 = new Pass(create_random(100000,200000), 0);
        c5.setPass(p5);
        c5.addPassCurrency(5.00);

        System.out.println(c5.toString());

        System.out.println("condition = " + g6.getCondition());
        System.out.println("condition = " + t5.getCondition());

        // each time a game is played or tickets ar being deposited the condition lowers
        System.out.println(c5.play(g6));
        System.out.println(c5.deposit_tickets(t5));

        System.out.println("condition = " + g6.getCondition());
        System.out.println("condtion = " + t5.getCondition());

        // if the condition is 0 you can't use the machine
        System.out.println(c5.play(g7));
        System.out.println(c5.deposit_tickets(t6));

        // a employee can fix the machines, but only if it has mechanic as role
        System.out.println(g7.toString());
        System.out.println(t6.toString());

        System.out.println(e3.fixMachine(g7, null));
        System.out.println(e4.fixMachine(null, t6));

        System.out.println(g7.toString());
        System.out.println(t6.toString());

        // by fixing the same machine more than once the condition rises
        System.out.println(e4.fixMachine(null, t6));

        System.out.println(t6.toString());


    }
    public static void main(String[] args) {
        /* not how you make a testfile,
        but I thought that putting 300 lines of testcode in your main didn't look nice either
        uncomment a function if you want to test it be sure to read the comments of that fucntie
        or else it will be hard to understand what happens.
        */
        create_test_1();
        //create_test_2();
        //create_test_3();
        //create_test_4();
    }
}
