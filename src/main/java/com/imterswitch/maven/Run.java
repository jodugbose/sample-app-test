package com.imterswitch.maven;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Run {

    public static void main(String[] args) {

        UpperLowerCase upperLowerCase = new UpperLowerCase();
        System.out.printf("%s to %s", "hello world", upperLowerCase.wordToUpperCase("Hello World"));
        System.out.println();
        System.out.printf("%s to %s", "hello world", upperLowerCase.wordToLowerCase("Hello World"));


        System.out.println("New Go-home feature by " +
                "Backbone Team suggested at" + LocalDateTime.now());
    }
}
