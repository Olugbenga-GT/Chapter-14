package com;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
        /*    16.13 (Duplicate Elimination) Write a program that reads in a series of first names and eliminates
              duplicates by storing them in a Set. Allow the user to search for a first name. */

public class DuplicateElimination {
        public static  String[] removeDuplicate(String[] input){
            if(input == null || input.length == 0){throw  new IllegalArgumentException("Valid input required");}
            String[] result = new String[input.length];
            result[0] = input[0];
            for (int i = 1; i < input.length; i++){
                String nextInput = input[i];
                for(int j = 0; j < result.length; j++){
                    String resultingInput = result[j];
                    if (nextInput.equalsIgnoreCase(resultingInput)) {
                        break;
                    }
                    if(resultingInput == null){result[j] = nextInput;}
                    break;
                }

            }
            return result;
        }


    public static  String[] removeDuplicates(String[] input){
        if(input == null || input.length == 0){throw  new IllegalArgumentException("Valid input required");}

        Set<String> words = new HashSet<>();
        for(String inputs : input){
            words.add(inputs);
        }
        return words.toArray(new String[0]);
    }

}



