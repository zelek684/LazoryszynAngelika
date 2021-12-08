
import java.time.LocalDate;
import java.util.*;

class Student extends Osoba
{
    private java.lang.String kierunek;
    private double sredniaOcen;

    public Student(java.lang.String nazwisko, java.lang.String[] imiona, LocalDate dataUrodzenia, boolean plec, java.lang.String kierunek, double sredniaOcen) {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }

    public java.lang.String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

}