package pl.imiajd.lazoryszyn;
import java.time.LocalDate;
import java.util.Objects;

    class Pracownik extends Osoba
    {
    private double pobory;
    private LocalDate DataZatrudnienia;

    public Pracownik(java.lang.String nazwisko, java.lang.String[] imiona, LocalDate dataUrodzenia, boolean plec, double pobory, LocalDate dataZatrudnienia) {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.pobory = pobory;
        DataZatrudnienia = dataZatrudnienia;
    }

    public double getPobory()
    {
        return pobory;
    }

    public LocalDate getDataZatrudnienia() {
        return DataZatrudnienia;
    }

    public java.lang.String getOpis()
    {
        return java.lang.String.format("pracownik zatrudniony %s z pensją %.2f zł", this.DataZatrudnienia.toString(),this.pobory);
    }
}
