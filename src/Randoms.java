import java.util.Iterator;
import java.util.Random;
import java.util.stream.Stream;

public class Randoms implements Iterable<Integer> {
    private final Random random;
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator(min, max, random);
    }
    private static class RandomsIterator implements Iterator<Integer> {

        private final Random random;
        private final int min;
        private final int max;

        public RandomsIterator(int min, int max, Random random) {
            this.min = min;
            this.max = max;
            this.random = random;
        }

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return min + random.nextInt(max - min + 1);
        }
    }
}