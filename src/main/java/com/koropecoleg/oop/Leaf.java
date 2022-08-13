package com.koropecoleg.oop;

public class Leaf extends Oak {

    protected  void blossom(){
        System.out.println("I will appear when plants blossom");
    }

    protected String height(String i) {
        return i + " am leaf";
    }
}
