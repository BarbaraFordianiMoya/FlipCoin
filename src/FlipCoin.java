import java.util.Random;

public class FlipCoin {

    public static void main(String[] args) {

        // 50% chance heads, 50% chance tails
        Random rand = new Random();
        double chance = rand.nextDouble();
        System.out.println(chance);
        if (chance > 0.5) {
            System.out.println("Superior");
        }
        if (chance < 05.) {
            System.out.println("Inferior");
        }
        }
    }

