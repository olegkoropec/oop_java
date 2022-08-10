package com.koropecoleg.oop;

public class Oak extends Plants {
    int  height_of_plant;
    int  width_of_plant;

    Oak(int height_of_plant, int width_of_plant) {
        this.height_of_plant = height_of_plant;
        this.width_of_plant = width_of_plant;
    }

    Oak(){
    }

    protected  void blossom(){
        System.out.println("I blossom in spring");
    }

    protected void height(double height, double width) {
        height = height_of_plant + height;
        width = width_of_plant + width;
        System.out.println("Oak height is now " + height + "m and width is now " + width );
    }

    public static void main(String[] args) {
        Oak oak = new Oak(50, 15);
        oak.blossom();
        oak.height(0.3, 0.15);

    }
}
