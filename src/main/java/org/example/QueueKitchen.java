package org.example;

import java.util.ArrayList;

public class QueueKitchen<T> implements AnimalKitchen<T>{

    private ArrayList<T> animals = new ArrayList<>();

    @Override
    public void add(T animal) {
            animals.add((T) animal);
        }

    @Override
    public void feed() {
        if (!animals.isEmpty()) {
            animals.remove(0);
        }
    }

}
