package pl.angelikalazoryszyn.Para;


public class PairUtil<T>{




    public static <T> Pair swap(Pair p){
        Pair pair = new Pair(p.getSecond(), p.getFirst());


        return pair;
    }

}
