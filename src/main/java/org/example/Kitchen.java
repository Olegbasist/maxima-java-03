package org.example;

import java.util.ArrayList;

public abstract class Kitchen <T> implements AnimalKitchen<T>{

    public ArrayList<T> animals = new ArrayList<>();


    @Override
    public void add(T animal) {

        animals.add((T) animal);

    }
    @Override
    public void feed() {}

}