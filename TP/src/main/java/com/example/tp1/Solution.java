package com.example.tp1;

public interface Solution {

    public int nbDimensions();
    public Solution modifier(int dim,double delta);
    public double getX();
    public void setX(double x);
}
