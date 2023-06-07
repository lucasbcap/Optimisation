package com.example.tp2;

public class MultiCercle {

    public static void main(String[] args) {
        //test de l'ensemble et sauvegarde

        // creer un GenerateurCercle autour du cercle de centre (200,200) de rayon 100
        GenerateurCercle generateur1 = new GenerateurCercle(400,400,50,10);
        GenerateurCercle generateur2 = new GenerateurCercle(100,100,50,10);

        // on cree un ProblemeRF de 100 points avec ce generateur
        ProblemeCercles pb = new ProblemeCercles(100, generateur1,generateur2);

        // on creer un Cercle
        
        double alpha = 0.001;
        double d = 0.1;
        Double[] tab1 = {150.0,150.0,10.0};
        Cercle c1 = new Cercle(tab1);
        Double[] tab2 = {400.0,400.0,10.0};
        Cercle c2 = new Cercle(tab2);
        SauveImage image = new SauveImage(500,500);
        image.dessinerCercle(c1);
        image.dessinerCercle(c2);
        image.dessinerPoints(pb.points);
        image.sauverImage("test_imageDebut.png");
        

        for(int i=0;i<100000;i++){
            tab1[0] = tab1[0] - alpha * (pb.evaluer(new Cercle(new Double[]{tab1[0]+d,tab1[1],tab1[2]}))-pb.evaluer(new Cercle(new Double[]{tab1[0]-d,tab1[1],tab1[2]})))/2*d;
            tab1[1] = tab1[1] - alpha * (pb.evaluer(new Cercle(new Double[]{tab1[0],tab1[1]+d,tab1[2]}))-pb.evaluer(new Cercle(new Double[]{tab1[0],tab1[1]-d,tab1[2]})))/2*d;
            tab1[2] = tab1[2] - alpha * (pb.evaluer(new Cercle(new Double[]{tab1[0],tab1[1],tab1[2]+d}))-pb.evaluer(new Cercle(new Double[]{tab1[0],tab1[1],tab1[2]-d})))/2*d;

            tab2[0] = tab2[0] - alpha * (pb.evaluer(new Cercle(new Double[]{tab2[0]+d,tab2[1],tab2[2]}))-pb.evaluer(new Cercle(new Double[]{tab2[0]-d,tab2[1],tab2[2]})))/2*d;
            tab2[1] = tab2[1] - alpha * (pb.evaluer(new Cercle(new Double[]{tab2[0],tab2[1]+d,tab2[2]}))-pb.evaluer(new Cercle(new Double[]{tab2[0],tab2[1]-d,tab2[2]})))/2*d;
            tab2[2] = tab2[2] - alpha * (pb.evaluer(new Cercle(new Double[]{tab2[0],tab2[1],tab2[2]+d}))-pb.evaluer(new Cercle(new Double[]{tab2[0],tab2[1],tab2[2]-d})))/2*d;

        }
        c1 = new Cercle(tab1);
        c2 = new Cercle(tab2);
        System.out.println("x="+c1.getX() +"  ----- y="+ c1.getY() +"  ----- centre ="+ c1.getRayon());
        System.out.println("x="+c2.getX() +"  ----- y="+ c2.getY() +"  ----- centre ="+ c2.getRayon());

        // on creer l'image et on ajoute les éléments
        image = new SauveImage(500,500);
        image.dessinerCercle(c1);
        image.dessinerCercle(c2);
        image.dessinerPoints(pb.points);
        image.sauverImage("test_imageFinal.png");



    }
}

