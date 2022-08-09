package com.koropecoleg.oop;

public class Spruce extends Plants {
    int height_of_plants = 34;
    protected  void blossom(){
        System.out.println("I don't blossom ");
    }

    protected int height(int height_of_plant) {
        height_of_plant = this.height_of_plant + height_of_plant;
        System.out.println("Height Spruce now is " + height_of_plant );
        return height_of_plant;
    }

    public static void main(String[] args) {
        Spruce spruce = new Spruce();
        spruce.blossom();
        spruce.height(1);

    }
}
