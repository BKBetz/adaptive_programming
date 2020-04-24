package arcade;
import java.util.ArrayList;
import java.util.List;

public class Arcade {
    private String name;
    private String location;
    private List games = new ArrayList();
    private List prices = new ArrayList();
    private List ticketStations = new ArrayList();
    private List employees = new ArrayList();

    /* Some rules
    *  - The arcade should at least contain one of each list to show it in the prints
    *  - If one of the values isn't filled it shows the text "er is geen ... available"
    *  - The can be more arcades with the same name in the same town
    */


    public Arcade(String nm, String lC) {
        this.name = nm;
        this.location = lC;
    }

    public void setGames(Game gM) {
        games.add(gM);
    }

    public List getGames() {
        return this.games;
    }

    public void setPrices(Prize pC) {
        prices.add(pC);
    }

    public List getPrices() {
        return this.prices;
    }

    public void setTicketStations(TicketStation tS) {
        ticketStations.add(tS);
    }

    public List getTicketStations() {
        return this.ticketStations;
    }

    public void setEmployees(Employee eP) {
        employees.add(eP);
    }

    public List getEmployees() {
        return this.employees;
    }


    // function that removes brackets and comma from list
    static String formatList(List lt) {
        String formattedList = lt.toString()
                .replace("["," ")
                .replace("]"," ")
                .replace(",", " ");

        return formattedList;
    }

    @Override
    public String toString() {
        // many Strings so that I dont make a ugly return
        String formattedGames = formatList(this.games);
        String formattedPrices = formatList(this.prices);
        String formattedStations = formatList(this.ticketStations);
        String formattedEmployees = formatList(this.employees);
        String arcade = String.format("Welcome to %s in %s", this.name, this.location);
        String games= String.format("Current games and status: \n %s", ((this.games.isEmpty()) ? "None \n" : formattedGames));
        String prices = String.format("Available prices: \n %s", ((this.prices.isEmpty()) ? "None \n" : formattedPrices));
        String ticketStations = String.format("All ticketstations and status: \n %s", ((this.ticketStations.isEmpty()) ? "None \n" : formattedStations));
        String employees = String.format("All employees and role: \n %s", ((this.employees.isEmpty()) ? "None \n" : formattedEmployees));

        return
                arcade +'\n' +
                games + '\n' +
                prices + '\n' +
                ticketStations + '\n' +
                employees;
    }
}
