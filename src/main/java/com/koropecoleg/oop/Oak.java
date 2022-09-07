package com.koropecoleg.oop;

public class Oak extends Plants {

    Oak(int heightPlant, int widthPlant) {
        super(heightPlant, widthPlant);
    }

    Oak(){
    }

    Oak(int radius_tree_trunk){
        setRadius_tree_trunk(radius_tree_trunk);
    }

    protected  void blossom(){
        System.out.println("I will blossom in spring");
    }

    protected void height(double height, double width) {
        height = getHeightPlant() + height;
        width = getWidthPlant() + width;
        System.out.println("Oak height is now " + height + "m and width is now " + width );
    }
}
