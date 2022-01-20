public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value += 1;
    }

    public void decrease() {
        this.value -= 1;
    }

    //Increasing the value only break if negative
    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            this.value = this.value;
        } else {
            this.value += increaseBy;
        }
    }

    //Decreasing value break if it goes under 0 stays the same
    public void decrease(int decreaseBy) {
       if(decreaseBy >= 0){
           this.value -= decreaseBy;
       }

    }
}
