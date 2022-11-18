package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class StackKitchen <T> implements AnimalKitchen{


    private ArrayList<T> animals = new ArrayList<>();

    @Override
    public void add(Object animal) {
        animals.add(0, (T) animal);
        // animals.add( (T) animal); // Вариант 2
    }

    @Override
    public void feed() {
       animals.remove(0);
       //animals.remove(animals.size()-1); // Вариант 2
    }

    public void feedAll() {
        animals.clear();
    }

    public ArrayList<T> getAnimals() {
        return animals;
    }
}
