package com.imterswitch.maven;

public class UpperLowerCase {

    public String wordToUpperCase(String word){
        if (word != null && !word.isEmpty()){
            String[] words = word.split(" ");
            return words[0].toUpperCase();
        }
        throw new IllegalArgumentException("Word cannot be empty");
    }

    public String wordToLowerCase(String word){
        if (word != null && !word.isEmpty()){
            String[] words = word.split(" ");
            return words[0].toLowerCase();

        }
        throw new IllegalArgumentException("Word cannot be empty");


    }



}
