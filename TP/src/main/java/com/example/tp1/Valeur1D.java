package com.example.tp1;

public class Valeur1D implements Solution {

    private double x;

    @Override
    public int nbDimensions() {
        return 1;
    }

    @Override
    public Solution modifier(int dim, double delta) {
        this.x = this.x+delta;
        return this;
    }

    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
}
