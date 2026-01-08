package com.emmad.tp;

public class animal {
    private String name;
    private int age;
    private String sound;

    public animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public static void commonInfo() {
        System.out.println("We are kind.");
    }

    public void makeSound() {
        System.out.println(name + " say " + sound);
    }

    public static void eat() {
        System.out.println("eating");
    }
    public static void eat(String food) {
        System.out.println("eating " + food);
    }

    public static class Cow extends animal {
        public Cow(String name, int age, String sound) {
            super(name, age, sound);
        }
    }
    public static class Dog extends animal {
        public Dog(String name, int age, String sound) {
            super(name, age, sound);
        }
    }
}
