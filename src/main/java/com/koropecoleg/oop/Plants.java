package com.koropecoleg.oop;

public class Plants {
    int  height_of_plant;
    int width_of_plant;
    protected  void blossom(){
        System.out.println("I blossom");
    }

    protected void height() {

    }

    public static void main(String[] args) {
        Plants plants = new Plants();
        plants.blossom();
    }
}
