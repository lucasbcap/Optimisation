package com.example.tp2;


public class Cercle {

    /**
     * coordonnees du centre
     */
    private  Point2D centre;

    /**
     * rayon
     */
    private  double rayon;

    @Override
    public String toString() {
        return "Cercle{" +
                "centre=" + centre +
                ", rayon=" + rayon +
                '}';
    }


    public Cercle(double x, double y, double r) {
        this.centre = new Point2D(x, y);
        this.rayon = r;
    }

    public Cercle(Double[] tab) {
        this.centre = new Point2D(tab[0], tab[1]);
        this.rayon = tab[2];
    }


    public double getX() {
        return this.centre.getX();
    }

    public double getY() {
        return this.centre.getY();
    }

    public Point2D getCentre() {
        return centre;
    }

    public double getRayon() {
        return this.rayon;
    }

}
