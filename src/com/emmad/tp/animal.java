package com.emmad.tp;

public class animal {
    private String name;
    protected int age;
    private String sound;
    protected String color;

    public animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
        this.color = "unknown";
    }

    public String getName() {
        return name;
    }

    protected static void displayColor(String name, String color) {
        System.out.println(name + " is " + color);
    }

    public static void commonInfo() {
        System.out.println("We are kind.");
    }

    public void makeSound() {
        System.out.println(name + " says " + sound);
    }

    public static void eat() {
        System.out.println("eating");
    }

    public static void eat(String food) {
        System.out.println("eating " + food);
    }

    public static class Cow extends animal {
        public Cow(String name, int age, String sound, String color) {
            super(name, age, sound);
            this.color = color;
        }
    }

    public static class Dog extends animal {
        public Dog(String name, int age, String sound, String color) {
            super(name, age, sound);
            this.color = color;
        }
    }
}