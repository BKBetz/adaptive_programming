package arcade;

public class Prize {
    private String name;
    private int price;
    private String type;

    public Prize(String nm, int pC, String tP) {
        this.name = nm;
        this.price = pC;
        this.type = tP;
    }

    public void setName(String nm) {this.name = nm;}

    public String getName() {return this.name;}

    public void setPrice(int pC) {
        this.price = pC;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        String formattedString = String.format(
                "\n Name:%s price:%s tickets \n type:%s \n",
                this.name, this.price, this.type
        );
        return formattedString;
    }
}
