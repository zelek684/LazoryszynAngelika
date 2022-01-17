package pl.angelikalazoryszyn.punkt;

public class Punkt {

    private int x;
    private int y;

    public Punkt(int x, int y){
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void show(){
        System.out.println("<" + x  + ", " + y + ">");


    }
}
