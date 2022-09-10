package com.koropecoleg.oop;

public class Plants {
    private int widthPlant;
    private int heightPlant;
    private int radius_tree_trunk;
    private String name;

    Plants(){
    }

    Plants(int heightPlant){
        setHeightPlant(heightPlant);
    }

    Plants(int radius_tree_trunk, int heightPlant, int widthPlant){
        setRadius_tree_trunk(radius_tree_trunk);
        setWidthPlant(widthPlant);
        setHeightPlant(heightPlant);
    }

    public int getRadius_tree_trunk() {
        return radius_tree_trunk;
    }

    public void setRadius_tree_trunk(int radius_tree_trunk) {
        this.radius_tree_trunk = radius_tree_trunk;
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
