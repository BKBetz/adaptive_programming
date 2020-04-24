package arcade;
import java.util.concurrent.ThreadLocalRandom;

public class Customer {
    private String name;
    private Pass pass;
    private int tickets;
    private double currency;

    /* some rules
    *  - A person can only have one pass at a time
    *  - 2 People can have the same pass... they can share it for example.
    *    it is a pass with only a code it is not connected to a customer by name
    * */

    public Customer(String nm, double cN) {
        this.name = nm;
        this.currency = cN;
    }

    public void setPass(Pass pS) {
        // only a person can have only one pass
        if(this.pass == null) {
            this.pass = pS;
        }
        // this is basically a quit membership
        else if(pS == null) {
            this.currency += this.pass.getCurrency();
            this.pass.setCurrency(0.0);
            this.pass = pS;
        }
    }

    public Pass getPass(){
        return this.pass;
    }

    public String addPassCurrency(double cN) {
        if(this.pass != null) {
            if(this.currency > cN) {
                this.pass.setCurrency(cN);
                this.currency -= cN;

                return String.format("Added %.2f to your pass", cN);
            }
            else {
                return "You don't have enough currency";
            }
        }
        else {
            return "Not a member";
        }
    }

    public String play(Game gM) {
        if(this.pass != null) {
            if(gM.getCondition() != 0) {
                if (pass.getCurrency() > gM.getPrice()) {
                    int rand_int = ThreadLocalRandom.current().nextInt(1, 20);

                    int prize = gM.getJackpot() / rand_int;

                    this.tickets += prize;

                    pass.setCurrency(-(gM.getPrice()));

                    gM.machineBreakDown();

                    return String.format("You won %s tickets, current currency: %.2f", prize, pass.getCurrency());
                } else {
                    return "Not enough currency";
                }
            }
            else {
                return "This game is broken, our apologies";
            }
        }
        else {
            return "Not a member";
        }
    }

    public String deposit_tickets(TicketStation tS) {
        if(this.pass != null) {
            if (tS.getCondition() != 0) {
                if (tS.checkIfOccupied()) {
                    return "All ports are taken";
                } else {
                    tS.setOccupied(1);
                    this.pass.setTickets(this.tickets);
                    String return_string = "Succesfully deposited " + this.tickets + " tickets";
                    this.tickets = 0;
                    tS.machineBreakDown();
                    return return_string;
                }
            }
            else {
                return "This station is broken, our apologies";
            }
        }
        else {
            return "Not a member";
        }
    }

    public String buyPrize(Prize pz) {
        if(this.pass != null) {
            int amount = pz.getPrice();
            if(amount > this.pass.getTickets()) {
                return "You don't have enough tickets";
            }
            else {
                this.pass.setTickets(-amount);
                return "Enjoy your new price, current tickets: "+this.pass.getTickets();
            }
        }
        else {
            return "Not a member";
        }
    }

    @Override
    public String toString() {
        if(this.pass != null) {
            String customer = "customer " + this.name;
            String tickets = String.format("currently has %s in his hand and %s on his pass", this.tickets, pass.getTickets());
            String currency = String.format("currency %.2f", pass.getCurrency());
            return '\n' + customer + '\n'
                    + tickets + '\n'
                    + currency + '\n';
        }
        else {
            return String.format("%s is not a customer", this.name);
        }
    }
}
