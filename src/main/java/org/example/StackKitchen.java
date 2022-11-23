package org.example;

import java.util.ArrayList;

public class StackKitchen<T> implements AnimalKitchen{
    private ArrayList<T> animals = new ArrayList<>();

    @Override
    public void add(Object animal) {
        Class animalClass;
        if (animals.isEmpty()) {
            animalClass = animal.getClass();
        }
        if(animal.getClass()==animalClass) {
            animals.add(0, (T) animal);
            System.out.println("Голодный питомец ждёт своей очереди ...");
        }else {
            System.out.println("Они подеруться!");
        }
    }

    @Override
    public void feed() {
        if (!animals.isEmpty()) {
            animals.remove(0);
            System.out.println("Сытый питомец удаляется с кухни ...");
        } else {
            System.out.println("Больше некого кормить. Все сыты.");
        }
    }

    public void feedAll() {
        if (!animals.isEmpty()) {
            animals.clear();
            System.out.println("Больше некого кормить. Все сыты.");
        }
    }

}
