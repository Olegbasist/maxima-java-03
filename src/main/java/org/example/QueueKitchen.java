package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class QueueKitchen <T> implements AnimalKitchen {



    private ArrayList<T> animals = new ArrayList<>();

    @Override
    public void add(Object animal) {
        Class onKitchen = !animals.isEmpty() ? animals.get(0).getClass() : null;
        Class newAnimal = animal.getClass();
        String actualAnimal = newAnimal.equals(Cat.class)
                ? "кот" : newAnimal.equals(Dog.class)
                ? "пёс" :
                newAnimal.toString();

        if (animals.isEmpty() || animals.get(0).getClass().equals(animal.getClass())) {
            System.out.println(animals.isEmpty()
                    ? "Первый "
                    + actualAnimal
                    + " пришел на кухню ..."
                    : "Еще один голодный "
                    + actualAnimal
                    + " пришел на кухню ...");

            animals.add((T) animal);
        }else {


            System.out.println("На кухне уже "
                    + (onKitchen.equals(Cat.class)
                    ? "мяукают коты"
                    : onKitchen.equals(Dog.class)
                    ? "поскуливают собаки" : newAnimal)
                    +" и если добавить "
                    + (newAnimal.equals(Cat.class)
                    ? "котика"
                    : newAnimal.equals(Dog.class)
                    ? "собаку" : newAnimal)
                    + " они подерутся ...");

        }
    }

    @Override
    public void feed() {
        if (!animals.isEmpty()) {

            String actualAnimal = animals.get(0).getClass().equals(Cat.class)
                    ? "кот" : animals.get(0).getClass().equals(Dog.class)
                    ? "пёс" :
                    animals.get(0).toString();

            animals.remove(0);
            System.out.println("Сытый " +actualAnimal+ " удаляется с кухни ...");
        } else {
            System.out.println("Больше некого кормить");
        }
    }

    public void feedAll() {
        animals.clear();
        System.out.println("Все питомцы внезапно сыты!");
    }

    public ArrayList<T> getAnimals() {
        return animals;
    }

}
