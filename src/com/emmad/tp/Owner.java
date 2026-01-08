package com.emmad.tp;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String name;
    private List<animal> animals;

    public Owner(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(animal animal) {
        this.animals.add(animal);
    }

    public String getName() {
        return name;
    }

    public List<animal> getAnimals() {
        return animals;
    }
}
