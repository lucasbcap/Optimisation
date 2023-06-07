package com.example.tp1;

public class Fonction1D implements Probleme {

    public static double Fonction1D(double x){
        return Math.cos(x)*Math.pow(x-1,2);
    }

    public double evaluer(Solution s){
        Valeur1D v = (Valeur1D)s;
        return Math.cos(v.getX())*Math.pow(v.getX()-1,2);
    }
}
