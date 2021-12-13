package com.company;
import pl.imiajd.lazoryszyn.Osoba;
import pl.imiajd.lazoryszyn.Pracownik;
import pl.imiajd.lazoryszyn.Student;
import pl.imiajd.lazoryszyn.Instrument;
import pl.imiajd.lazoryszyn.Flet;
import pl.imiajd.lazoryszyn.Fortepian;
import pl.imiajd.lazoryszyn.Skrzypce;


import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kowalski", new String[]{"Jan"}, LocalDate.of(1234,9,11), false, 50000, LocalDate.of(2020,1,2));
        ludzie[1] = new Student("Nowak", new String[]{"Małgorzata","Anna"},LocalDate.of(1324,5,3),true, "informatyka",3.6);
        // ludzie[2] = new pl.imiajd.lazoryszyn.Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            for ( String i : p.getImiona()){
                System.out.print(i+" ");
            }
            System.out.print(p.getNazwisko() + ": " + p.getOpis()+ " uordzony: "+p.getDataUrodzenia()+", plec: ");
            if(p.isPlec()){
                System.out.println("Kobieta");
            }
            else {
                System.out.println("Mężczyzna");
            }
        }
    }
}