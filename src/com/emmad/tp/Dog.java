package com.emmad.tp;

public class Dog extends animal implements Pet {
    public Dog(String name, int age, String sound, String color) {
        super(name, age, sound);
        this.color = color;
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing!");
    }
}