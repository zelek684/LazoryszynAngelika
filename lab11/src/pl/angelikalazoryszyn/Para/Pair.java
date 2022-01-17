package pl.angelikalazoryszyn.Para;

public class Pair<T> {

    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second){
        this.first = first;
        this.second = second;

    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }
    public <T> void  swap(Pair<T> p){

        T buffer = p.second;
        p.second = p.first;
        p.first = buffer;

    }


}
