import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalną :");
        int n = in.nextInt();
        int suma= 0;
        for(int i=1;i<=n;i++)
            suma+=Math.abs(i);

        System.out.println(suma);
    }
}
	// write your code here


