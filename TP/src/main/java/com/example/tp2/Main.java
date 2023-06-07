package com.example.tp2;

public class Main {
    public static void main(String[] args) {
        //test de l'ensemble et sauvegarde

        // creer un GenerateurCercle autour du cercle de centre (200,200) de rayon 100
        GenerateurCercle generateur1 = new GenerateurCercle(300,300,50,20);

        // on cree un ProblemeRF de 100 points avec ce generateur
        ProblemeRF pb1 = new ProblemeRF(100, generateur1);


        // on creer un Cercle
        
        double alpha = 0.1;
        double d = 0.1;
        Double[] tab = {150.0,150.0,10.0};
        Cercle c = new Cercle(tab);
        SauveImage image = new SauveImage(500,500);
        image.dessinerCercle(c);
        image.dessinerPoints(pb1.points);
        image.sauverImage("test_imageDebut.png");
        

        for(int i=0;i<1000000;i++){
            tab[0] = tab[0] - alpha * (pb1.evaluer(new Cercle(new Double[]{tab[0]+d,tab[1],tab[2]}))-pb1.evaluer(new Cercle(new Double[]{tab[0]-d,tab[1],tab[2]})))/2*d;
            tab[1] = tab[1] - alpha * (pb1.evaluer(new Cercle(new Double[]{tab[0],tab[1]+d,tab[2]}))-pb1.evaluer(new Cercle(new Double[]{tab[0],tab[1]-d,tab[2]})))/2*d;
            tab[2] = tab[2] - alpha * (pb1.evaluer(new Cercle(new Double[]{tab[0],tab[1],tab[2]+d}))-pb1.evaluer(new Cercle(new Double[]{tab[0],tab[1],tab[2]-d})))/2*d;
       }
        c = new Cercle(tab);
        System.out.println("x="+c.getX() +"  ----- y="+ c.getY() +"  ----- centre ="+ c.getRayon());

        // on creer l'image et on ajoute les éléments
        image = new SauveImage(500,500);
        image.dessinerCercle(c);
        image.dessinerPoints(pb1.points);
        image.sauverImage("test_imageFinal.png");



    }
}
