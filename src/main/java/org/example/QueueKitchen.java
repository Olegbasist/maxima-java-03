package org.example;

import java.util.ArrayList;

public class QueueKitchen<T> implements AnimalKitchen{


    private ArrayList<T> animals = new ArrayList<>();

    @Override
    public void add(Object animal) {
        animals.add( (T) animal);
    }

    @Override
    public void feed() {
        animals.remove(0);
    }

    public void feedAll() {
        animals.clear();
    }

    public ArrayList<T> getAnimals() {
        return animals;
    }

}
