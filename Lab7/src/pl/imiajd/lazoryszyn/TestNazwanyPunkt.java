package pl.imiajd.lazoryszyn;

public class TestNazwanyPunkt extends Punkt {
    private String name;
    private int x;
    private int y;

    TestNazwanyPunkt(int x, int y, String name)
    {
        this.name = name;
        this.x=x;
        this.y=y;
    }

    public void show()
    {
        System.out.println(this.name + ":<" + this.x + ", " + this.y + ">");
    }
}
