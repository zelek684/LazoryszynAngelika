package com.company;

public class Kandydet implements Cloneable, Comparable<Kandydet> {
    private String nazwa;
    private int wiek;
    private String wyksztalcony;
    private int latadoswiadczenia;

    public static final String licencjat = "licencjat";
    public static final String mistrz = "mistrzowie";

    public Kandydet(String nazwa, int wiek, String wyksztalcony, int latadoswiadczenia){
        this.nazwa = nazwa;
        this.wiek = wiek;
        this.wyksztalcony = wyksztalcony;
        this.latadoswiadczenia = latadoswiadczenia;
    }

    public String getNazwa(){
        return nazwa;
    }

    public int getWiek(){
        return wiek;
    }

    public String getWyksztalcony(){
        return wyksztalcony;
    }

    public int getLatadoswiadczenia() {
        return latadoswiadczenia;
    }

    private static int getWyksztalconyAsInteger(String val){
        int ret;
        if(val == licencjat){
            ret = 1;
        }
        else if(val == mistrz){
            ret = 2;
        }
        else{
            ret = 0;
        }

        return ret;
    }

    @Override
    public int compareTo(Kandydet cmp) {
        int firstCompare = Integer
                .compare(getWyksztalconyAsInteger(getWyksztalcony())
                        , getWyksztalconyAsInteger(cmp.getWyksztalcony()));
        if(firstCompare != 0){
            return firstCompare;
        }

        int secondCompare = Integer.compare(getWiek(), cmp.getWiek());
        if(secondCompare != 0){
            return secondCompare;
        }

        return Integer.compare(getLatadoswiadczenia(), cmp.getLatadoswiadczenia());
    }
}