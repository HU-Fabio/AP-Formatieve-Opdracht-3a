import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public List<String> bubbleSort(List<String> alphabet, List<String> list) {
//      Get the generated list from the generator
        List<Integer> randomAlphabetKey = new ArrayList<>();
//      Convert the strings of the random list to indexes
        for (Object o : list) {
            randomAlphabetKey.add(alphabet.indexOf(o));
        }
//      Loop through the indexes and sort them
        for(int i=0; i < randomAlphabetKey.size(); i++){
            for(int j=1; j < (randomAlphabetKey.size()-i); j++){
                if(randomAlphabetKey.get(j - 1) > randomAlphabetKey.get(j)){
                    Collections.swap(randomAlphabetKey, j -1, j);
                }

            }
        }
//      Convert the list back to strings
        List<String> random = new ArrayList<String>();

        for (int o : randomAlphabetKey) {
            random.add(alphabet.get(o));
        }

        return random;
    }
}
