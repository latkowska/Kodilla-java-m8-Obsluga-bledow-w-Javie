package com.kodilla.exception.test;

import java.io.IOException;

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) throws IOException {
        if (x >= 2 || x < 1 || y == 1.5) {
            throw new IOException();
        }
        return "Done!";
    }
}

