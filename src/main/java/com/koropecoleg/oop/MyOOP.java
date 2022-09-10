package com.koropecoleg.oop;

import java.util.*;

public class MyOOP {
    public static void main(String[] args) {
        Plants plants = new Plants();
        Plants spruce = new Spruce(34);
        Leaf leaf = new Leaf();

        Oak ukrainian_oak = new Oak(5, 100, 15);
        Oak red_oak = new Oak(4, 90, 13);
        Oak canadian_oak = new Oak(3, 80, 10);

        List<String> oaksName = Arrays.asList("ukrainian oak", "red oak", "canadian oak");
        List<Oak> oaksValue = Arrays.asList(ukrainian_oak, red_oak, canadian_oak);
        Map<String, Integer> mapOaks = new HashMap<>();
        for(int i = 0; i < oaksName.size(); i ++){
            mapOaks.put(oaksName.get(i), oaksValue.get(i).getRadius_tree_trunk() * oaksValue.get(i).getHeightPlant());
        }

        System.out.println(mapOaks);

//        plants.blossom();
//        spruce.blossom();
//        spruce.height(1);
//        leaf.blossom();
//        leaf.height("I");

    }
}
