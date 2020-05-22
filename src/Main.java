public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator(5);

        Sort sort = new Sort();

        System.out.println(sort.bubbleSort(generator.getAlphabet(), generator.getRandomVectorList()));
    }
}

