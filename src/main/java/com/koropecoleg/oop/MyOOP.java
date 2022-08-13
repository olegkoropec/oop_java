package com.koropecoleg.oop;

public class MyOOP {
    public static void main(String[] args) {
        Plants plants = new Plants();
        Plants oak = new Oak(50, 15);
        Plants spruce = new Spruce(34);
        Leaf leaf = new Leaf();
        plants.blossom();
        oak.blossom();
        oak.height(0.3, 0.15);
        spruce.blossom();
        spruce.height(1);
        leaf.blossom();
        leaf.height("I");
    }
}
