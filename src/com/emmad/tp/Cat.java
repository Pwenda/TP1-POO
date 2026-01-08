package com.emmad.tp;

public class Cat extends animal implements Pet, Wild {
    public Cat(String name, int age, String sound, String color) {
        super(name, age, sound);
        this.color = color;
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing with a ball!");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting !");
    }
}
