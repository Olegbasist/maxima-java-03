package org.example;

//  03.11.2022 Описать класс Dog с методами аналогичными классу Cat,
//  но не имеющего с ним общих предков.

public class Dog {

    private String name;
    private int weight;
    private boolean isAngry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) throws IncorrectDogWeightException {

        if (weight < 0){
            throw new IncorrectDogWeightException("Покорми пёсика! Путь он весит хоть сколько-нибудь.");
        }
        if (weight > 160){
            throw new IncorrectDogWeightException("Пожалей пёсика! Он слишком тяжелый.");
        }

        this.weight = weight;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }

    public Dog(String name, int weight, boolean isAngry) throws IncorrectDogWeightException {
        this.name = name;
        setWeight(weight);
        this.isAngry = isAngry;
    }

}
