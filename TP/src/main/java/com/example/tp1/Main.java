package com.example.tp1;

public class Main {

    public static void main(String[] args) {
        double x0 = 2;
        double alpha = 0.1;
        double dx = 0.0001;

        for(int i =0;i<100;i++){

            x0 = x0 - alpha* (Fonction1D.Fonction1D(x0+dx)-Fonction1D.Fonction1D(x0))/dx;
        }
        System.out.println("x ="+x0+" ----  f(x)="+ Fonction1D.Fonction1D(x0));

        x0 =0;
        alpha = 0.01;
        double y0 =0;

        for(int i =0;i<100;i++){

            x0 = x0 - alpha* (Fonction2D.Fonction2D(x0+dx,y0)-Fonction2D.Fonction2D(x0,y0))/dx;
            y0= y0 - alpha* (Fonction2D.Fonction2D(x0,y0+dx)-Fonction2D.Fonction2D(x0,y0))/dx;
        }
        System.out.println("x ="+x0+" ------ y ="+y0+" ----  f(x)="+ Fonction2D.Fonction2D(x0,y0));

        x0 =4;
        y0 =-1;

        for(int i =0;i<100;i++){

            x0 = x0 - alpha* (Fonction2D.Fonction2D(x0+dx,y0)-Fonction2D.Fonction2D(x0,y0))/dx;
            y0= y0 - alpha* (Fonction2D.Fonction2D(x0,y0+dx)-Fonction2D.Fonction2D(x0,y0))/dx;
        }
        System.out.println("x ="+x0+" ------ y ="+y0+" ----  f(x)="+ Fonction2D.Fonction2D(x0,y0));

        Descente d = new Descente(new Fonction1D());
        System.out.println(d.iterer(new Valeur1D(),100).getX());
    }




}
