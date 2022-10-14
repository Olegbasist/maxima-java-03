package org.example;

//  29.09.2022 Описать класс Cat (кот) со свойствами:
//  name — имя, строка.
//  weight — вес, число int
//  isAngry — сердитость, boolean
//  Описать геттеры и сеттеры всех свойств.
//
//  29.09.2022 Описать свой класс исключений — IncorrectCatWeightException
//  и выбрасывать его при присваивании коту отрицательного веса.
//  29.09.2022 Описать фабрику котов CatFactory
//   со статическим методом Cat createCat(String name, int weight).
//   Этот метод будет пытаться создать кота, если вес указан корректный, то будет создан дружелюбный кот с указанным именем и весом.
//   Если вес указан неверно, но будет создан сердитый кот весом 5 кг.

public class App 
{
    public static void main( String[] args ) throws Exception {

        System.out.println("-------------------------------");


        Cat kitty = new Cat("Пушок", 3,false);
        //kitty.setWeight(-8);
        System.out.print(!kitty.isAngry() ? "Добрый " : "Злой ");
        System.out.println(kitty.getName() + " весом " + kitty.getWeight() + " кило");

        System.out.println("-------------------------------");


        Cat cat = CatFactory.createCat("Рыжик", 51);
        System.out.print(!cat.isAngry() ? "Добрый " : "Злой ");
        System.out.println(cat.getName() + " весом " + cat.getWeight() + " кило");

        System.out.println("-------------------------------");

    }
}
