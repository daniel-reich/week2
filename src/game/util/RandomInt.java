package game.util;
import java.util.Random;
/**
 * Created by Daniel on 11/11/16.
 */
public class RandomInt {

    public static int randomInteger(int max) {

        Random random = new Random();
        int randNumber = random.nextInt(max);

        randNumber = randNumber + 1;

        return randNumber;
    }
}
