package com.example.tp2;

//import outils.SauveImage;

import java.util.ArrayList;
import java.util.List;

/**
 * represente un ensemble de points 2D
 */
public class ProblemeRF {

    /**
     * donnees sont un ensemble de point 2D
     */
    List<Point2D> points;

    /**
     * generateur de points
     */
    Generateur generateur;

    /**
     * construit un ensemble de points 2D
     *
     * @param nb  nombre de points
     * @param gen le generateur de points
     */
    public ProblemeRF(int nb, Generateur gen) {
        // copie generateur
        this.generateur = gen;

        // genere les points
        this.points = new ArrayList<>();
        for (int i = 0; i < nb; i++) {
            points.add(gen.getPoint());
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
            resultat += Math.abs(this.points.get(i).distance(c.getCentre())-c.getRayon());
        }
        return resultat;
    }




    public void addPoint(Point2D nouveauPoint) {
        this.points.add(nouveauPoint);
    }
}
