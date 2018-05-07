package com.kodilla.exception.com.kodilla.exception.test;

import java.io.IOException;

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) throws Exception {
        if (x >= 2 || x < 1 || y == 1.5) {
            throw new Exception();
        }
        return "Done!";
    }


    public static void main(String[] args) {
        ExceptionHandling object = new ExceptionHandling();

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



