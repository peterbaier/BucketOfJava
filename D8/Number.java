package D8;

public class Number {
    private int number;
    private Number before;
    private Number after;

    public Number(int number) {
        this.number = number;
        this.before = null;
        this.after = null;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Number getBefore() {
        return before;
    }

    public void setBefore(Number before) {
        this.before = before;
    }

    public Number getAfter() {
        return after;
    }

    public void setAfter(Number after) {
        this.after = after;
    }
}
