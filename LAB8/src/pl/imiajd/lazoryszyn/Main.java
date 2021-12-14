package pl.imiajd.lazoryszyn;
import pl.imiajd.lazoryszyn.Pracownik;
import pl.imiajd.lazoryszyn.Osoba;
import pl.imiajd.lazoryszyn.Student;
//import pl.imiajd.lazoryszyn.Instrument;
//import pl.imiajd.lazoryszyn.Flet;
//import pl.imiajd.lazoryszyn.Fortepian;
//import pl.imiajd.lazoryszyn.Skrzypce;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args)
    {
        Osoba[] czlowieki = new Osoba[2];

       czlowieki[0] = new Pracownik("Nowak", new String[]{"Beata"}, LocalDate.of(1998,10,15), true, 30000, LocalDate.of(2021,12,13));
       czlowieki[1] = new Student("Klajn", new String[]{"Igor","Matesz"},LocalDate.of(1997,12,4),false, "informatyka",4.8);
        //czlowieki[2] = new Osoba("xxx Kowalski...");


        for (Osoba p : czlowieki) {
            for ( String i : p.getImiona()){
                System.out.print(i+" ");
            }
            System.out.print(p.getNazwisko() + ": " + p.getOpis()+ " data urodzenia: "+p.getDataUrodzenia()+", płeć: ");
            if(p.isPlec()){
                System.out.println("Kobieta");
            }
            else {
                System.out.println("Mężczyzna");
            }
        }
    }
}