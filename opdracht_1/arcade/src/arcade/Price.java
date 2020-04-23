package arcade;

public class Price {
    private String name;
    private int price;
    private String type;

    public Price(String nm, int pC, String tP) {
        this.name = nm;
        this.price = pC;
        this.type = tP;
    }

    public void setName(String nm) {this.name = nm;}

    public String getName() {return this.name;}

    @Override
    public String toString() {
        String formattedString = String.format(
                "\n Name:%s price:%s tickets \n type:%s \n",
                this.name, this.price, this.type
        );
        return formattedString;
    }
}
