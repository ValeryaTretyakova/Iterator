import java.util.Random;

public class Iterator implements java.util.Iterator{
    int min;
    int max;
    protected Random random;

    public Iterator(int min, int max, Random random) {
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
        int range = max - min;
        return min + random.nextInt(range + 1);
    }
}

