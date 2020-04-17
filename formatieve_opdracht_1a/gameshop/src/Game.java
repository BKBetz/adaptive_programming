import java.time.LocalDate;

public class Game {
    private String name;
    private int release;
    private double price;

    public Game(String nm, int rl, double pr) {
        this.name = nm;
        this.release = rl;
        this.price = pr;
    }

    public double calcPrice() {
        int date = LocalDate.now().getYear();
        int game_age = date - this.release;
        double discount = 0.3;
        double new_price = this.price;

        for(int i = 0; i < game_age; i++) {
            new_price = new_price * (1 - discount);
        }

        return this.price = new_price;
    }
}
