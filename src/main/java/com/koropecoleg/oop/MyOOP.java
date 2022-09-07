package com.koropecoleg.oop;

import java.util.*;

public class MyOOP {
    public static void main(String[] args) {
        Plants plants = new Plants();
        Plants oak = new Oak(50, 15);
        Plants spruce = new Spruce(34);
        Leaf leaf = new Leaf();

        Oak ukrainian_oak = new Oak(100);
        Oak red_oak = new Oak(90);
        Oak canadian_oak = new Oak(80);

        List<Oak> oaks = Arrays.asList(ukrainian_oak, red_oak, canadian_oak);
        Map<Oak, Integer> mapOaks = new HashMap<>();
        for(int i = 0; i < oaks.size(); i ++){
            mapOaks.put(oaks.get(i), oaks.get(i).getRadius_tree_trunk());
        }

        Spruce carpatian_spruce = new Spruce();
        Spruce european_spruce = new Spruce();

        Plants [] plant = {ukrainian_oak, red_oak, canadian_oak, carpatian_spruce, european_spruce};

        plants.blossom();
        oak.blossom();
        oak.height(0.3, 0.15);
        spruce.blossom();
        spruce.height(1);
        leaf.blossom();
        leaf.height("I");

    }
}
