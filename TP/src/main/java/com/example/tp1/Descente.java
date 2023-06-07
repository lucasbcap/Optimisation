package com.example.tp1;


public class Descente {
    
    private Probleme probleme;

    public Descente(Probleme p){
        this.probleme = p;
    }

    public Solution iterer(Solution s,int nb){
        double x =0;
        double alpha = 0.1;
        double dx = 0.0001;
        s.setX(x);

        for(int i =0;i<nb;i++){
            s.setX(s.getX()-alpha*(probleme.evaluer(s.modifier(1, dx))-probleme.evaluer(s))/dx);
        }
        return s;
    }

}
