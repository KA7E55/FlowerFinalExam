import java.util.Comparator;

public class Flower implements Comparable<Flower> {
    private String name;
    private int price;
    private int length;
    private Freshness freshness;

    public Flower(String name, int price, int length) {
        this.name = name;
        this.price = price;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getLength() {
        return length;
    }

    public Freshness getFreshness() {
        return freshness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }

    @Override
    public String toString() {
        return "\n- - - Flower - - -" +
                "\nName: " + name +
                "\nPrice: " + price +
                "\nLength: " + length +
                "\nFreshness: " + freshness;
    }


    @Override
    public int compareTo(Flower o) {
        return this.price - o.price;
    }

}
