package org.example;


public class StackKitchen<T> extends SuperKitchen<T> implements AnimalKitchen<T>{

    @Override
    public void feed() {

        if (!animals.isEmpty()) {
            animals.remove(animals.size()-1);

        }
    }
}
