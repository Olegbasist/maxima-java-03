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

    public void setWeight(int weight) {

        if (weight>30){
            setWeight(weight=0);
        }

        this.weight = weight;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }


    /*public Cat(String name, int weight, boolean isAngry) {

            this.name = name;
            this.weight = weight;
            this.isAngry = isAngry;

    }*/
}
