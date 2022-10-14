package org.example;

//  29.09.2022 Описать класс Cat (кот) со свойствами:
//  name — имя, строка.
//  weight — вес, число int
//  isAngry — сердитость, boolean
//  Описать геттеры и сеттеры всех свойств.
//
//  29.09.2022 Описать свой класс исключений — IncorrectCatWeightException
//  и выбрасывать его при присваивании коту отрицательного веса.
//  todo: 29.09.2022 Описать фабрику котов CatFactory
//   со статическим методом Cat createCat(String name, int weight).
//   Этот метод будет пытаться создать кота, если вес указан корректный, то будет создан дружелюбный кот с указанным именем и весом.
//   Если вес указан неверно, но будет создан сердитый кот весом 5 кг.

public class App 
{
    public static void main( String[] args ) throws Exception {

        /*try {
            Cat cat = new Cat("Пушок", 4,false);
            System.out.println(cat.getName() + " " + cat.getWeight() + " кило");
        } catch (IncorrectCatWeightException exception){
            System.out.println("Пожалей котика! Посади его на диету");
        }*/


        Cat cat = CatFactory.createCat("Рыжик", -1);
        System.out.print(!cat.isAngry() ? "Добрый " : "Злой ");
        System.out.println(cat.getName() + " весом " + cat.getWeight() + " кило");

    }
}
