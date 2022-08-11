package com.koropecoleg.oop;

public class Spruce extends Plants {
    int heightPlant = 34;

    protected  void blossom(){
        System.out.println("I don't blossom ");
    }

    protected int height(int heightPlant) {
        heightPlant = this.heightPlant + heightPlant;
        System.out.println("Height Spruce now is " + heightPlant );
        return heightPlant;
    }
}
