package org.example;

// 29.09.2022 Описать класс Cat (кот) со свойствами:
//  name — имя, строка.
//  weight — вес, число int
//  isAngry — сердитость, boolean
//  Описать геттеры и сеттеры всех свойств.

public class Cat {

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

    public void setWeight(int weight) throws IncorrectCatWeightException {

        if (weight < 0){
            throw new IncorrectCatWeightException("Покорми котика! Путь он весит хоть сколько-нибудь.");
        }
        if (weight > 30){
            throw new IncorrectCatWeightException("Пожалей котика! Он слишком тяжелый.");
        }

        this.weight = weight;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }

    public Cat(String name, int weight, boolean isAngry) throws IncorrectCatWeightException {
        this.name = name;
        /*if (weight < 0) {
            throw new IncorrectCatWeightException("Пожалей котика!");
        }*/
        setWeight(weight);
        this.isAngry = isAngry;
    }

}
