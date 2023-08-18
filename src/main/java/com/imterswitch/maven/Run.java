package com.imterswitch.maven;

public class Run {

    public static void main(String[] args) {

        UpperLowerCase upperLowerCase = new UpperLowerCase();
        System.out.printf("%s to %s", "hello world", upperLowerCase.wordToUpperCase("Hello World"));
        System.out.println();
        System.out.printf("%s to %s", "hello world", upperLowerCase.wordToLowerCase("Hello World"));
    }
}
