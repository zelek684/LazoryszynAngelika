package pl.angelikalazoryszyn.ArrayUtil;


import java.util.ArrayList;

public class ArrayUtil<T> {



    public static <T extends Comparable<T>> void isSorted(ArrayList<T> ar){

        for(int i = 0; i <= ar.size()-2; i++){
            if(ar.get(i).compareTo(ar.get(i+1)) > 0) {
                System.out.println("Tablica nie  posortowana niemalejaco");
                return;
            }


            }
        System.out.println("Tablica  posortowana niemalejaco");



        }



    }







