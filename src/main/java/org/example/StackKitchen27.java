package org.example;


public class StackKitchen27<T> extends Kitchen<T> implements AnimalKitchen<T>{

    @Override
    public void feed() {

        if (!animals.isEmpty()) {
            animals.remove(animals.size()-1);

        }
    }
}
