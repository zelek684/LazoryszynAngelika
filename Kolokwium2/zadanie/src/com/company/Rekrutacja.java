package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Rekrutacja {
    private static int doswiadczenie;
    private ArrayList<Kandydet> kandydaci;

    Rekrutacja(ArrayList<Kandydet> kandydaci){
        setDoswiadczenie();
        this.kandydaci = kandydaci;
    }

    public int getDoswiadczenie(){
        return doswiadczenie;
    }

    public static void setDoswiadczenie(){
        doswiadczenie = 2;
    }

    public static boolean Qualified(Kandydet a){
        return a.getLatadoswiadczenia() >= doswiadczenie;
    }

    HashMap<Integer, String> RecruitmentMap(){
        HashMap<Integer, String> ret = new HashMap<>();

        for(int i=0; i<kandydaci.size(); i++){
            if(Qualified(kandydaci.get(i))){
                ret.put(kandydaci.get(i).getLatadoswiadczenia(),
                        kandydaci.get(i).getNazwa());
            }
        }

        return ret;
    }
}