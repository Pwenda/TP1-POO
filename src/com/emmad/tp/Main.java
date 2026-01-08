package com.emmad.tp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Dog("Norbert", 5, "Woof", "black");
        Pet pet2 = new Cow("Patricia", 3, "Moo", "white");

        pet1.play();
        pet2.play();

        List<animal> animals = new ArrayList<>();
        animals.add((animal) pet1);
        animals.add((animal) pet2);

        for (animal a : animals) {
            a.makeSound();

            if (a instanceof Pet) {
                ((Pet) a).play();
            }
        }
    }
}
