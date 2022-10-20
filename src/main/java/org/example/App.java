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

//  20.10.2022 Проверка на отрицательный вес должна быть только в сеттере.

// 20.10.2022 В конструкторе и сеттере может быть выброшен IncorrectCatWeightException,
//  а в сигнатуре метода описываете просто Exception это будет сбивать тех, кто будет этот класс использовать.
//  Лучше указывать точный класс исключения.

//  20.10.2022 В CatFactory нужно перехватить выброс исключения и при перехвате создать дефолтного кота.

public class App 
{
    public static void main( String[] args ) throws Exception {

        System.out.println("-------------------------------");


        Cat kitty = new Cat("Пушок", 3,false);
        //kitty.setWeight(-8);
        System.out.print(!kitty.isAngry() ? "Добрый " : "Злой ");
        System.out.println(kitty.getName() + " весом " + kitty.getWeight() + " кило");

        System.out.println("-------------------------------");


        Cat cat = CatFactory.createCat("Рыжик", 88);
        System.out.print(!cat.isAngry() ? "Добрый " : "Злой ");
        System.out.println(cat.getName() + " весом " + cat.getWeight() + " кило");

        System.out.println("-------------------------------");

    }
}
