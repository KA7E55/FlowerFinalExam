import java.util.ArrayList;
import java.util.List;
public class Bouquet {
    private List<Flower> flowers = new ArrayList<>();
    public void addToBouquet(Flower flower) {
        flowers.add(flower);
    }

    public void rangeLength(Flower flowerLength) {
        if (flowerLength.getLength() > 50 && flowerLength.getLength() < 60) {
            System.out.println(" - - - length > 50 || length < 60 - - -");
            System.out.println("Name: " + flowerLength.getName());
            System.out.println("Length: " + flowerLength.getLength());
        }

    }
    public List<Flower> getFlowers() {
        return flowers;
    }
    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }
}
