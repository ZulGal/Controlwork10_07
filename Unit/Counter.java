package Unit;

public class Counter {
    int count;

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int add(int i){
        i++;
        return i;
    }
}
