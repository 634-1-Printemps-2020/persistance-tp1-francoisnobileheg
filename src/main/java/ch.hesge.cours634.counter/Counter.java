package ch.hesge.cours634.counter;

public class Counter implements ICounter {

    private int cpt;

    public Counter(int depart) {
        this.cpt = depart;
    }

    @Override
    public void inc() throws CounterException {
        this.cpt += 1;
    }

    @Override
    public void add(int step) throws CounterException {
        this.cpt += step;
    }

    @Override
    public int getValue() {
        return cpt;
    }
}
