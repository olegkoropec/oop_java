package com.koropecoleg.oop;

public class Oak extends Plants {
    int  height_of_plant = 50;
    int  width_of_plant = 15;
    protected  void blossom(){
        System.out.println("I blossom in spring");
    }

    protected void height(double height_of_plant, double width_of_plant) {
        height_of_plant = this.height_of_plant + height_of_plant;
        width_of_plant = this.width_of_plant + width_of_plant;
        System.out.println("Oak height is now " + height_of_plant + "m and width is now " + width_of_plant );
    }

    public static void main(String[] args) {
        Oak oak = new Oak();
        oak.blossom();
        oak.height(0.3, 0.15);

    }
}
