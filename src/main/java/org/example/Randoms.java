package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private final int min;
    private final int diff;
    private int number;

    public Randoms(int min, int max) {
        this.min = min;
        this.diff = max - min;
        random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new AdditionalIterator();
    }

    private class AdditionalIterator implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            number = random.nextInt(diff + 1);
            return true;
        }

        @Override
        public Integer next() {
            return number + min;
        }
    }
}