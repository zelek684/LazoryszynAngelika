import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner objekt = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int n = 0;
        while (n < 1 || n > 100) {

            n = objekt.nextInt();
        }


        int[] tablica = new int[n];
        int liczba = 0;
        Random r = new Random();

        for (int i = 1; i < n; i++) {
            tablica[i] = r.nextInt(1000);
            liczba = r.nextInt(2);
            if (liczba == 1) tablica[i] *= (-1);
            System.out.println(tablica[i] + "  ");
        }
        //zadanie1a
        int parzysta = 0;
        int nieparzysta = 0;
        for (int i = 0; i < n; i++) {
            if (tablica[i] % 2 == 0) ;
            else nieparzysta += 1;
        }
        System.out.println(" ");
        System.out.println("liczba parzysta :" + parzysta + " nieparzysta " + nieparzysta);

        //zadanie1b
        int uj = 0;
        int dod = 0;
        int zerowa = 0;
        for (int i = 0; i < n; i++) {
            if (tablica[i] < 0) uj += 1;
            if (tablica[i] > 0) dod += 1;
            if (tablica[i] == 0) zerowa = 1;
        }
        //zadanie1c
        int max = tablica[0];
        int ileMax = 0;
        for (int i = 1; i < n; i++) {
            if (tablica[i] > max) max = tablica[i];

        }
        for (int i = 0; i < n; i++) {
            if (tablica[i] == max) ileMax = 1;
        }
        System.out.println("maxymalne= " + max + " liczby maksymalnych " + ileMax);
        //zadanie1d
        int sumaDod = 0;
        int sumaUjem = 0;

        for (int i = 0; i < n; i++) {
            if (tablica[i] < 0) sumaUjem += tablica[i];
            else sumaDod = tablica[i];
        }
        System.out.println(" Suma liczb dodatnich " + sumaDod + " Suma liczb ujemnych " + sumaUjem);
        //zadanie1e

        int wonsz = 0;
        int tym = 0;
        for (int i = 0; i < n; i++) {
            if (tablica[i] >= 0) {
                tym += 1;
            } else {
                if (tym > wonsz) {
                    wonsz = tym;
                    tym=0;


                }
                tym = 0;
            }

        }
        System.out.println("Wonszzzz ==  " + wonsz);

        //zadanie1f
        int[] tablica1 = new int[n];
        for(int i =0;i<n;i++){
            tablica1[i]=tablica[i];
        }

        for(int i=0;i<n;i++){
            if(tablica1[i]<0) tablica1[i]=-1;
            else tablica1[i]=1;
            System.out.println(tablica1[i]+" ");
        }
   //zadanie1g
        int lewy=0;
        int prawy=0;
        System.out.println("Zakres prawy");
        prawy = objekt.nextInt();
        System.out.println("Zakres lewy");
        lewy = objekt.nextInt();



    }
}
