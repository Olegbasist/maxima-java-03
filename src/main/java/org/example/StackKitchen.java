package org.example;


public class StackKitchen<T> extends Kitchen<T> implements AnimalKitchen<T>{

    @Override
    public void feed() {

        if (!animals.isEmpty()) {
            animals.remove(animals.size()-1);

        }
    }
}
