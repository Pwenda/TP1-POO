package com.emmad.tp;

import static com.emmad.tp.animal.*;

public class Main {
    public static void main(String[] args) {
        animal.Cow cow = new animal.Cow("Patricia", 2, "Moo", "brown");
        animal.Dog dog = new animal.Dog("Norbert", 15, "Woof", "black");
        cow.makeSound();
        dog.makeSound();
        commonInfo();
        dog.eat();
        dog.eat("grass");
        color("Patricia", "brown");
    }
}