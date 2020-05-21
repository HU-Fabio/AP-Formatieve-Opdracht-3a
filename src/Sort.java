import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public List bubbelSort(Generator generator) {
//      Get the generated list from the generator
        List<String> alphabet = generator.getAlphabet();
        List<Integer> randomAlphabetKey = new ArrayList<Integer>();
//      Convert the strings of the random list to indexes
        for (Object o : generator.getRandom()) {
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
