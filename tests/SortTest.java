import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {
    private Generator generator = new Generator(5);
    private Sort sort = new Sort();

    @Test
    void bubbleSortArrayList() {
        List<String> test1 = this.generator.getRandomArrayList();
        Collections.sort(test1);

        List<String> test2 = this.sort.bubbleSort(this.generator.getAlphabet(), this.generator.getRandomArrayList());


        assertEquals(test1, test2);
    }

    @Test
    void bubbleSortVectorList() {
        List<String> test1 = this.generator.getRandomVectorList();
        Collections.sort(test1);

        List<String> test2 = this.sort.bubbleSort(this.generator.getAlphabet(), this.generator.getRandomVectorList());


        assertEquals(test1, test2);
    }

    @Test
    void bubbleSortLinkedList() {
        List<String> test1 = this.generator.getRandomLinkedList();
        Collections.sort(test1);

        List<String> test2 = this.sort.bubbleSort(this.generator.getAlphabet(), this.generator.getRandomLinkedList());


        assertEquals(test1, test2);
    }
}