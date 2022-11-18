package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class StackKitchen <T> implements AnimalKitchen{


    private ArrayList<T> animals = new ArrayList<>();

    @Override
    public void add(Object animal) {
        animals.add((T) animal);
        System.out.println(animals.lastIndexOf(animal));
        animals.forEach(a -> System.out.println(a));



    }

    @Override
    public void feed(Object animal) {

    }
}
