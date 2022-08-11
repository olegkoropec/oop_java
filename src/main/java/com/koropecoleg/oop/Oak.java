package com.koropecoleg.oop;

public class Oak extends Plants {

    Oak(int heightPlant, int widthPlant) {
        this.heightPlant = heightPlant;
        this.widthPlant = widthPlant;
    }

    Oak(){
    }

    protected  void blossom(){
        System.out.println("I blossom in spring");
    }

    protected void height(double height, double width) {
        height = heightPlant + height;
        width = widthPlant + width;
        System.out.println("Oak height is now " + height + "m and width is now " + width );
    }
}
