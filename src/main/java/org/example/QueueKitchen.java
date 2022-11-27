package org.example;


public class QueueKitchen<T> extends Kitchen<T> implements AnimalKitchen<T>{

    @Override
    public void feed() {

        if (!animals.isEmpty()) {
            animals.remove(0);
        }

    }

}
