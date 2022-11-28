package org.example;


public class QueueKitchen<T> extends SuperKitchen<T> {

    @Override
    public void feed() {

        if (!animals.isEmpty()) {
            animals.remove(0);
        }

    }

}
