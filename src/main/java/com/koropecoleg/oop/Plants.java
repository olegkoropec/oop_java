package com.koropecoleg.oop;

public class Plants {
    private int widthPlant;
    private int heightPlant;
    private int radiusTreeTrunk;
    private String name;

    Plants(){
    }

    Plants(int heightPlant){
        setHeightPlant(heightPlant);
    }

    Plants(String name, int radiusTreeTrunk, int heightPlant, int widthPlant){
        setName(name);
        setRadiusTreeTrunk(radiusTreeTrunk);
        setWidthPlant(widthPlant);
        setHeightPlant(heightPlant);
    }

    public int getRadiusTreeTrunk() {
        return radiusTreeTrunk;
    }

    public void setRadiusTreeTrunk(int radiusTreeTrunk) {
        this.radiusTreeTrunk = radiusTreeTrunk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
