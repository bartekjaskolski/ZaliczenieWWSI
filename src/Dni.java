import java.lang.Integer;import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by bartek on 2016-05-24.
 */
public class Dni {

    final static int GODZINY_DNIA = 8;
    public List wypelnianieDnia() {
        List<Integer> godziny = new ArrayList<>(GODZINY_DNIA);
        Random gen = new Random();
        for (int i = 0; i < GODZINY_DNIA; i++) {
            godziny.add(gen.nextInt(3));
        }
        return godziny;
    }
}