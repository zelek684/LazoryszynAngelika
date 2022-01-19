package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList <Kandydet> grupa = new ArrayList<>();
        grupa.add(new Kandydet("Anna", 23, Kandydet.mistrz, 2));
        grupa.add(new Kandydet("Jan", 35, Kandydet.licencjat, 7));
        grupa.add(new Kandydet("Kinga", 28, Kandydet.licencjat, 1));
        grupa.add(new Kandydet("Zuzanna", 40, Kandydet.mistrz, 3));
        grupa.add(new Kandydet("Szymon", 36, Kandydet.licencjat, 5));
        grupa.add(new Kandydet("Piotr", 23, Kandydet.licencjat, 1));

        System.out.println("Przed sortowaniem...");
        for(int i=0; i<grupa.size(); i++){
            System.out.println(grupa.get(i).getNazwa());
        }

        Collections.sort(grupa);

        System.out.println("Po sortowaniu...");
        for(int i=0; i<grupa.size(); i++){
            System.out.println(grupa.get(i).getNazwa());
        }

        System.out.println("Zakwalifikowani kandydaci...");
        Rekrutacja a = new Rekrutacja(grupa);
        System.out.println(a.RecruitmentMap());
    }
}