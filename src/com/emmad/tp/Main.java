package com.emmad.tp;

import static com.emmad.tp.animal.commonInfo;
import static com.emmad.tp.animal.eat;

public class Main {
    public static void main(String[] args) {
        animal.Cow cow = new animal.Cow("Patricia", 2, "Moo");
        animal.Dog dog = new animal.Dog("Norbert", 15, "Woof");
        cow.makeSound();
        dog.makeSound();
        commonInfo();
        dog.eat();
        dog.eat("grass");
    }
}