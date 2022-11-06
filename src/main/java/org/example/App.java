package org.example;

//  03.11.2022 Описать класс Dog с методами аналогичными классу Cat, но не имеющего с ним общих предков.
//
// TODO: 03.11.2022 Описать интерфейс AnimalKitchen — описывает кормление группы любых животных.
//  Методы:
//      void add ( экземпляр животного) — добавить животное в очередь.
//      void feed() - покормить очередное животное (исключить его из очереди на кормление).
//
// TODO: 03.11.2022 Описать два класса QueueKitchen и StackKitchen,
//  реализующие кормление животных по принципам FIFO и LIFO соответственно. (Подсказка: это конвейер)
//  Подсказка: В каждом классе должно быть определено свойство animals типа ArrayList (подсказка Arraylist<>getAnimals)
//  Подсказка из видео: В одну очередь ставить кошек и собак нельзя, но мы не знаем кого из них подадут на вход.

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

        Dog doggy = new Dog("Барбос", 18, false);
        System.out.print(!doggy.isAngry() ? "Добрый " : "Злой ");
        System.out.println(doggy.getName() + " весом " + doggy.getWeight() + " кило");

        System.out.println("-------------------------------");
    }
}
