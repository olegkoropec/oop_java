package com.koropecoleg.oop;

public class Plants {
    private int widthPlant;
    private int  heightPlant;

    Plants(){

    }

    Plants(int heightPlant){
        setHeightPlant(heightPlant);
    }

    Plants(int heightPlant, int widthPlant){
        setWidthPlant(widthPlant);
        setHeightPlant(heightPlant);
    }

    public int getWidthPlant() {
        return widthPlant;
    }

    public void setWidthPlant(int widthPlant) {
        this.widthPlant = widthPlant;
    }

    public int getHeightPlant (){
        return heightPlant;
    }

    public void setHeightPlant(int heightPlant){
        this.heightPlant = heightPlant;
    }

    protected  void blossom(){
        System.out.println("I blossom");
    }

    protected void height(double v, double v1) {
    }

    protected int height(int i) {
        return 0;
    }
}
