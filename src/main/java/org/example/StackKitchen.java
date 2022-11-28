package org.example;


public class StackKitchen<T> extends SuperKitchen<T> {


    @Override
    public void feed() {

        if (!animals.isEmpty()) {
            animals.remove(animals.size()-1);

        }
    }
}
