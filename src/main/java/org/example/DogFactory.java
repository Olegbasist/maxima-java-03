package org.example;


public class DogFactory {


    public static Dog createDog(String name, int weight) throws IncorrectDogWeightException {

        try {
            return new Dog(name, weight, false);

        } catch (IncorrectDogWeightException e) {
            System.out.println(e.getMessage());
            return new Dog (name, 25, true);

        }


    }

}
