package org.example;

// TODO: 29.09.2022 Описать класс Cat (кот) со свойствами:
//  name — имя, строка.
//  weight — вес, число int
//  isAngry — сердитость, boolean
//  Описать геттеры и сеттеры всех свойств.
//
//  todo: 29.09.2022 Описать свой класс исключений — IncorrectCatWeightException и выбрасывать его при присваивании коту отрицательного веса.
//  todo: 29.09.2022 Описать фабрику котов CatFactory со статическим методом Cat createCat(String name, int weight).
//   Этот метод будет пытаться создать кота, если вес указан корректный, то будет создан дружелюбный кот с указанным именем и весом.
//   Если вес указан неверно, но будет создан сердитый кот весом 5 кг.

public class App 
{
    public static void main( String[] args )
    {
        Cat cat = new Cat("Пушистик", 3, false);
        System.out.println( cat.getName()+ " " +cat.getWeight()+ " кило" );
    }
}
