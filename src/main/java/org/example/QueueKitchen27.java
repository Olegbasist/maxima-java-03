package org.example;


public class QueueKitchen27<T> extends Kitchen<T> implements AnimalKitchen<T>{

    @Override
    public void feed() {

        if (!animals.isEmpty()) {
            animals.remove(0);
        }

    }

}
