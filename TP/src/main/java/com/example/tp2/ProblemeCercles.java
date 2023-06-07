package com.example.tp2;

//import outils.SauveImage;

import java.util.ArrayList;
import java.util.List;

/**
 * represente un ensemble de points 2D
 */
public class ProblemeCercles {

    /**
     * donnees sont un ensemble de point 2D
     */
    List<Point2D> points;

    /**
     * generateur de points
     */
    Generateur generateur1;

    /**
     * generateur de points
     */
    Generateur generateur2;

    /**
     * construit un ensemble de points 2D
     *
     * @param nb  nombre de points
     * @param gen le generateur de points
     */
    public ProblemeCercles(int nb, Generateur gen1,Generateur gen2) {
        // copie generateur
        this.generateur1 = gen1;
        this.generateur2 = gen2;

        // genere les points
        this.points = new ArrayList<>();
        for (int i = 0; i < nb; i++) {
            points.add(gen1.getPoint());
            points.add(gen2.getPoint());
        }
    }


    /**
     * permet d'evaluer une solution
     *
     * @param c forme a evaluer
     * @return l'erreur moyenne commise
     */
    public double evaluer(Cercle c) {
        double resultat = 0;
        for(int i=0;i<this.points.size();i++){
            double cache = Math.abs(this.points.get(i).distance(c.getCentre())-c.getRayon());
            if(cache<200)
            resultat += cache;
        }
        return resultat;
    }




    public void addPoint(Point2D nouveauPoint) {
        this.points.add(nouveauPoint);
    }
}
