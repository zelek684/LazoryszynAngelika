package pl.angelikalazoryszyn;


import pl.angelikalazoryszyn.ArrayUtil.ArrayUtil;
import pl.angelikalazoryszyn.Para.Pair;
import pl.angelikalazoryszyn.Para.PairUtil;

import java.util.ArrayList;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


    Pair<Integer> para = new Pair<Integer>(1, 2);
    para.swap(para);
        System.out.println(para.getFirst());
        System.out.println(para.getSecond());

        Pair para2 = new Pair();
        para2 = PairUtil.swap(para);

        System.out.println(para2.getFirst());
        System.out.println(para2.getSecond());

        ArrayList<Integer> ar1 = new ArrayList<Integer>();
       ArrayList<Integer> ar2 = new ArrayList<Integer>();
        LocalDate ld1 = LocalDate.of(1997, 10, 21);
        LocalDate ld2 = LocalDate.of(1998, 10, 21);

        LocalDate ld3 = LocalDate.of(1999, 10, 21);

        LocalDate ld4 = LocalDate.of(2000, 10, 21);

        LocalDate ld5 = LocalDate.of(2001, 10, 21);



 //       ArrayList<LocalDate> ar1 = new ArrayList<LocalDate>();
 //       ArrayList<LocalDate> ar2 = new ArrayList<LocalDate>();

//        ar1.add(ld1);
//        ar1.add(ld2);
//        ar1.add(ld3);
//        ar1.add(ld4);
//        ar1.add(ld5);
//
//
//        ar2.add(ld1);
//        ar2.add(ld4);
//        ar2.add(ld3);
//        ar2.add(ld2);
//        ar2.add(ld5);



        ar1.add(1);
        ar1.add(2);
        ar1.add(3);
        ar1.add(4);
        ar1.add(4);
        ar1.add(6);

        ar2.add(1);
        ar2.add(2);
        ar2.add(3);
        ar2.add(4);
        ar2.add(3);
        ar2.add(5);
        ar2.add(6);

       ArrayUtil.isSorted(ar1);
       ArrayUtil.isSorted(ar2);






    }
}
