package org.example;

import java.util.ArrayList;

public class QueueKitchen<T> implements AnimalKitchen{

    private Class animalClass = null;
    private ArrayList<T> animals = new ArrayList<>();

    @Override
    public void add(Object animal) {

        if (animals.isEmpty()) {
            animalClass = animal.getClass();
        }
        if(animal.getClass().equals(animalClass)) {
            animals.add((T) animal);
        }
    }

    @Override
    public void feed() {
        if (!animals.isEmpty()) {
            animals.remove(0);
        }
    }

    public void feedAll() {
        if (!animals.isEmpty()) {
            animals.clear();
        }
    }

}
