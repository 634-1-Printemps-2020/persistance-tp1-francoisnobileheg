package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {

    private int cpt;
    private int max;
    private final int MIN = 0;

    public UpperLimitedPositiveCounter(int depart, int max) {
        super(depart);
        this.max = max;
    }

    @Override
    public void inc() throws CounterException {
        if (this.cpt + 1 > this.max) {
            throw new CounterException("Error : The value of the counter can't be increased more.");
        }
        this.cpt += 1;
    }

    @Override
    public void add(int step) throws CounterException {
        if (this.cpt + step > this.max) {
            throw new CounterException("Error : The value of the counter can't be increased more.");
        }
        if (this.cpt + step < MIN) {
            throw new CounterException("Error : The value of the counter can't be under " + MIN + ".");
        }
        this.cpt += step;
    }

    @Override
    public int getValue() {
        return this.cpt;
    }
}
