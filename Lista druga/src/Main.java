import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = 7;
        int suma = 0;

        //a
        for (int i = 0; i < n; i++) {
            suma = suma + a[i];

        }
        System.out.println(suma);
        int iloczyn = 1;
        //b
        for (int i = 0; i < n; i++) {
            iloczyn = iloczyn * a[i];
        }
        System.out.println(iloczyn);
        //c
        float suma1 = 0;
        for (int i = 0; i < n; i++) {
            suma1 += Math.sqrt(a[i] * (-1));
        }
        //d
        float bsuma = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                bsuma = bsuma + a[i] * (-1);
            } else bsuma = bsuma + a[i];
        }
        System.out.println(bsuma);
        //e
        System.out.println("Podaj elementy: ");
        int n = in.nextInt();
        double iloczyn = 1;

        for (int i = 1; i <= n; i++) {

            System.out.println("podaj liczbe a" + i + ": ");
            double a = in.nextDouble();
            if (a < 0) a = a * -1;
            iloczyn *= a;

        }
        System.out.println("Wynik to: " + iloczyn);
        //ff
        System.out.println("Podaj elmenty ");
        int n = in.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println("Podaj liczbe a" + i + "; ");
            double a = in.nextDouble();
            sum += Math.pow(a, 2);

        }
        System.out.println("Wynik to: " + sum);
        //g
        System.out.println("Podaj elementy: ");
        int n = in.nextInt();
        double suma = 0;
        double iloczyn = 1;

        for (int i = 1; i <= n; i++) {

            System.out.println("Podaj liczbe" + i + ": ");
            double a = in.nextDouble();
            suma += a;
            iloczyn *= a;

        }

        System.out.println("Wynik sumy: " + suma);
        System.out.println("Wynik iloczynu: " + iloczyn);

        //h
        float suma3 = 0;
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 != 0) {
                suma3 += a[i];
            } else suma3 -= a[i];


        }
        System.out.println(suma3);
        float silnia = 1;
        float sum = 0;
        float zmienna = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                zmienna = -1;
            }
        }

        //i

        int wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik = wynik * i;
        }
        return wynik;


        Scanner temp = new Scanner(System.in);
        int n = temp.nextInt();
        double wynik = 0;
        for (int i = 1; i <= n; i++) {
            int t = temp.nextInt();
            wynik = wynik + (pow(-1, i) * t) / (sil(t));
        }
        System.out.println(wynik);

        //ZESTEW2
        int licz = 0;
        System.out.println("podaj ilosc liczb: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("podaj liczbe " + i + ": ");
            double a = in.nextDouble();
            if (a % 2 != 0) licz++;
        }
        System.out.println("nieparzyste:" + licz);
        //zadanie 2b
        int licz = 0;
        System.out.println("podaj ilosc liczb: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("podaj liczbe " + i + ": ");
            double a = in.nextDouble();
            if ((a % 3 == 0) && (a % 5 != 0)) licz++;
        }
        System.out.println("liczby podziene 3 i niepodz przz 5" + licz);
        //zadanie2c
        int licz = 0;
        System.out.println("podaj ilosc: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("podaj liczbe " + i + ": ");
            double a = in.nextDouble();
            if (Math.sqrt(a) % 2 == 0) licz++;

        }
        System.out.println("wynik :" + licz);
        //zadanie2f
        int licz = 0;
        System.out.println("podaj ilosc: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("podaj liczbe " + i + ": ");
            double a = in.nextDouble();
            if ((i % 2 != 0) && (a % 2 == 0)) licz++;
        }
        System.out.println("wynik yto:" + licz);
        //zadanie2g
        int licz = 0;
        System.out.println("podaj ilosc: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("podaj liczbe " + i + ": ");
            double a = in.nextDouble();
            if ((a % 2 != 0) && (a >= 0)) licz++;
        }
        System.out.println("wynik:" + licz);
        //zadanie2h
        int licz = 0;
        System.out.println("podaj ilosc: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("podaj liczbe " + i + ": ");
            double a = in.nextDouble();
            if (a < 0) a *= -1;
            if (a < (i * i)) licz++;

        }
        System.out.println("wynik:" + licz);
        //zadanie2
        int licz = 0;
        System.out.println("podaj ilosc: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("podaj liczbe " + i + ": ");
            double a = in.nextDouble();
            if (a > 0) licz += a;
        }
        System.out.println("podwojona suma:" + (licz * 2));
        //zadanie3
        int dodatnie = 0;
        int ujemne = 0;
        int zera = 0;
        System.out.println("podaj liczby: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("podaj liczbe " + i + ": ");
            double a = in.nextDouble();
            if (a > 0) dodatnie++;
            if (a < 0) ujemne++;
            if (a == 0) zera++;
        }
        System.out.println("dodatnie:" + dodatnie);
        System.out.println("ujemne:" + ujemne);
        System.out.println("zera:" + zera);

        //ZADANIE4
        List<Double> list = new ArrayList<Double>();
        System.out.println("podaj liczby: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("podaj liczbe " + i + ": ");
            double a = in.nextDouble();
            list.add(a);
        }
        double minimun = list.get(0);
        double maximum = list.get(0);
        for (int i = 0; i < n; i++) {
            if (list.get(i) < minn) minimun = list.get(i);
            if (list.get(i) > maxx) maximum = list.get(i);
        }
        System.out.println("najmniejsza: " + minimun);
        System.out.println("najwieksza: " + maximum);

        List<Double> list = new ArrayList<Double>();
        System.out.println("podaj ilosc: ");
        int n = in.nextInt();
        int licz = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("podaj liczbe " + (i + 1) + ": ");
            double a = in.nextDouble();
            list.add(a);

        }
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > 0 && list.get(i + 1) > 0) licz++;
        }
        System.out.println("pary: " + licz);


    }
}

