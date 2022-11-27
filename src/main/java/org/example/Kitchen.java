package org.example;

import java.util.ArrayList;

public abstract class Kitchen <T> implements AnimalKitchen<T>{

    public ArrayList<T> animals = new ArrayList<>();
    int animalToFeed;

    @Override
    public void add(T animal) {
        animals.add((T) animal);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(animal);
        System.out.println(animals);
    }
    @Override
    public void feed() {
        System.out.println("-------------------------------------------");
        System.out.println(animals.get(animalToFeed));

        if (!animals.isEmpty()) {
            animals.remove(animalToFeed);
        }

        System.out.println(animals);
    }

}