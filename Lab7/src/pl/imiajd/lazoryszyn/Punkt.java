package pl.imiajd.lazoryszyn;

public class Punkt {

    private int x;
    private int y;

    Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void show()
    {
        System.out.println("<" + this.x + ", " + this.y + ">");
    }

    public int x()
    {
        return this.x;
    }

    public int y()
    {
        return this.y;
    }
}