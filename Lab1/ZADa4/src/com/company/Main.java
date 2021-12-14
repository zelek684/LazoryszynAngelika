package com.company;

public class Main
    {
    public static void main(String[] args) {
        double dane=1000;
        for(int i=1; i<=3; i++)
        {
            dane=dane+(dane*0.06);
        }
        System.out.println(dane);
    }
}