package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CountingLetters {

    public static void main(String[] args) {
        Map<String, Integer> myWord = new HashMap<>();
        createletter(myWord);
        displayLetter(myWord);

    }

    private static void createletter(Map<String, Integer> map){
        String word =  "Hello There";
        String[] tokens = word.split("");
        for(String token : tokens){
            String letter = token.toLowerCase();
            if(map.containsKey(letter)){
                int count = map.get(letter);
                map.put(letter, count + 1);
            }
            else {map.put(letter, 1);}
        }
    }

    private static void displayLetter(Map<String, Integer> map){
        Set<String> keys = map.keySet(); //getKeys
        TreeSet<String> sortedKeys = new TreeSet<>(keys);
        System.out.println("%n Map contains: %n key\t\t Value %n");
//        Generate output
        for(String key: sortedKeys){
            System.out.printf("%-10s%10s%n", key, map.get(key));
        }

    }
}
