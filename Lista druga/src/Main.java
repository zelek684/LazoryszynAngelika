import java.math.*;

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

        float biloczyn = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                biloczyn *= a[i] * (-1);
            } else biloczyn *= a[i];

// pkt f potega += Math.pow(a[i},2)
        }
        //g
        float suma2 = 0;
        float iloczyn2 = 1;
        for (int i = 0; i < n; i++) {
            suma2 += a[i];
            iloczyn2 *= a[i];

        }
        System.out.println(suma2);
        System.out.println(iloczyn2);
//h
        float suma3 = 0;
        for (int i = 0; i < n; i++) {
            if ((i+1) % 2 != 0) {
                suma3 += a[i];
            }
            else suma3 -= a[i];


        }
        System.out.println(suma3);
        float silnia=1;
        float sum=0;
        float zmienna=1;
        for (int i = 0;i<n;i++){
            if(i%2!=0){
                zmienna=-1;
            }
        }
    }
}