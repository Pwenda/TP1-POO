package com.emmad.tp;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Norbert", 5, "Woof", "black");
        Cow cow = new Cow("Norbert", 5, "Woof", "black");
        dog.play();
        cow.play();
    }
}