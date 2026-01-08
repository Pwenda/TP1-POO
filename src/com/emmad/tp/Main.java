package com.emmad.tp;

import static com.emmad.tp.animal.commonInfo;

public class Main {
    public static void main(String[] args) {
        commonInfo();

        animal.Cow cow = new animal.Cow("Patricia", 2, "Moo");
        cow.makeSound();
    }
}