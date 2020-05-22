import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Generator {
    private List<String> alphabet;
    private List<String> randomArrayList;
    private List<String> randomVectorList;
    private List<String> randomLinkedList;

    public Generator(int size) {
        this.alphabet = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

        List<String> tempArrayList = new ArrayList<>();
        List<String> tempVectorList = new Vector<>();
        List<String> tempLinkedList= new LinkedList<>();

        for(int i = 0; i < size; i++) {
            tempArrayList.add(this.alphabet.get(ThreadLocalRandom.current().nextInt(0, 26)));
            tempVectorList.add(this.alphabet.get(ThreadLocalRandom.current().nextInt(0, 26)));
            tempLinkedList.add(this.alphabet.get(ThreadLocalRandom.current().nextInt(0, 26)));

        }
        this.randomArrayList = tempArrayList;
        this.randomVectorList = tempVectorList;
        this.randomLinkedList = tempLinkedList;
    }

    public List<String> getAlphabet() {
        return alphabet;
    }

    public List<String> getRandomArrayList() {
        return randomArrayList;
    }

    public List<String> getRandomVectorList() {
        return randomVectorList;
    }

    public List<String> getRandomLinkedList() {
        return randomLinkedList;
    }
}
