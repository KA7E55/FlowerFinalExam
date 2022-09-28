import java.util.*;

public class Main {
    public static Random random = new Random();
    private static java.util.List<Flower> List;

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();

        for (int i = 0; i < 10; i++) {

            Flower flower = new Flower("Flower " + (i + 1), random.nextInt(150, 500), random.nextInt(20, 100));

            int freshRandom = random.nextInt(1, 4);

            if (freshRandom == 1) {
                flower.setFreshness(Freshness.FRESH);
            } else if (freshRandom == 2) {
                flower.setFreshness(Freshness.MEDIUM_FRESH);
            } else {
                flower.setFreshness(Freshness.OVERDUE);
            }

            bouquet.rangeLength(flower);
            bouquet.addToBouquet(flower);

        }

        Collections.sort(bouquet.getFlowers());
        System.out.println(bouquet.getFlowers());

    }
}