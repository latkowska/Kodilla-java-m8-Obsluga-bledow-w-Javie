package com.kodilla.exception.com.kodilla.exception.test;

import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge object = new SecondChallenge();

        try {
            String result = object.probablyIWillThrowException(3.0, 1.8);
            System.out.println(result);
        } catch (IOException e) {
            System.out.println("Oh no, there's a mistake! Error: " + e);
        } finally {
            System.out.println("But remember - there is always solution.");
        }
    }

}