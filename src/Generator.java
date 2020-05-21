import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Generator {
    private List<String> alphabet;
    private List<String> random;

    public Generator(int size) {
        this.alphabet = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");
//      TODO: Move this to own function/check if you can append directly to random.
        List<String> tempList = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            tempList.add(this.alphabet.get(ThreadLocalRandom.current().nextInt(0, 26)));
        }
        this.random = tempList;
    }

    public List<String> getAlphabet() {
        return alphabet;
    }

    public List<String> getRandom() {
        return random;
    }


}
