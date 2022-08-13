package com.koropecoleg.oop;

public class Spruce extends Plants {

    Spruce (int heightPlant) {
    super(heightPlant);
    }

    protected  void blossom(){
        System.out.println("I don't blossom ");
    }

    protected int height(int heightPlant) {
        heightPlant = getHeightPlant() + heightPlant;
        System.out.println("Height Spruce now is " + heightPlant );
        return heightPlant;
    }
}
