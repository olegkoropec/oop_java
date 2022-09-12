package com.koropecoleg.oop;

import java.util.*;

public class MyOOP {
    public static void main(String[] args) {
        Plants plants = new Plants();
        Plants spruce = new Spruce(34);
        Leaf leaf = new Leaf();

        Oak ukrainianOne = new Oak("ukrainian", 6, 100, 15);
        Oak ukrainianTwo = new Oak("ukrainian", 5, 110, 15);
        Oak ukrainianThree = new Oak("ukrainian", 5, 100, 20);
        Oak redOne = new Oak("red", 4, 90, 13);
        Oak redTwo = new Oak("red", 4, 90, 13);
        Oak canadian_oak = new Oak("canadian", 3, 80, 10);

        List<Oak> oaks = Arrays.asList(ukrainianOne, ukrainianTwo, ukrainianThree, redOne, redTwo, canadian_oak);
        Map<String, Integer> mapOaks = new HashMap<>();
        for (int i = 0; i < oaks.size(); i++) {
            Oak currentTree = oaks.get(i);
            if (mapOaks.containsKey(currentTree.getName())) {
                int volume = mapOaks.get(currentTree.getName());
                int result = volume + (currentTree.getRadiusTreeTrunk() * currentTree.getHeightPlant());
                mapOaks.put(currentTree.getName(), result);
            } else {
                int value = currentTree.getRadiusTreeTrunk() * currentTree.getHeightPlant();
                mapOaks.put(currentTree.getName(), value);
            }
        }

        System.out.println(mapOaks);

//        plants.blossom();
//        spruce.blossom();
//        spruce.height(1);
//        leaf.blossom();
//        leaf.height("I");

    }
}
