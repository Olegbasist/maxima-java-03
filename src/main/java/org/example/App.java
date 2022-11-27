package org.example;

//  03.11.2022 Описать класс Dog с методами, аналогичными классу Cat, но не имеющего с ним общих предков.
//
//  03.11.2022 Описать интерфейс AnimalKitchen — описывает кормление группы любых животных.
//  Методы:
//      void add ( экземпляр животного) — добавить животное в очередь.
//      void feed() - покормить очередное животное (исключить его из очереди на кормление).
//
//  03.11.2022 Описать два класса QueueKitchen и StackKitchen,
//  реализующие кормление животных по принципам FIFO и LIFO соответственно. (Подсказка: это конвейер)

public class App
{
    public static void main( String[] args ) throws Exception {

        System.out.println("-------------------------------");


        Cat kitty = new Cat("Пушок", 3,false);
        //kitty.setWeight(-8);
        //System.out.print(!kitty.isAngry() ? "Добрый " : "Злой ");
       // System.out.println(kitty.getName() + " весом " + kitty.getWeight() + " кило");

        System.out.println("-------------------------------");


        Cat cat = CatFactory.createCat("Рыжик", 88);
        Cat cat2 = CatFactory.createCat("Рыж", 4);
        Cat cat3 = CatFactory.createCat("Снуффи", 6);
        //System.out.print(!cat.isAngry() ? "Добрый " : "Злой ");
        //System.out.println(cat.getName() + " весом " + cat.getWeight() + " кило");

        System.out.println("-------------------------------");

        Dog doggy = new Dog("Барбос", 18, false);
        //System.out.print(!doggy.isAngry() ? "Добрый " : "Злой ");
        //System.out.println(doggy.getName() + " весом " + doggy.getWeight() + " кило");

        System.out.println("-------------------------------");

        /*StackKitchen<Cat> stackKitchen = new StackKitchen<>();
        stackKitchen.add(cat);
        stackKitchen.add(kitty);
        stackKitchen.add(cat2);
        //stackKitchen.getAnimals();
        stackKitchen.add(cat3);
        //stackKitchen.getAnimals();

        //stackKitchen.feedAll();
        stackKitchen.feed();
        //stackKitchen.getAnimals();
        stackKitchen.feed();
        //stackKitchen.getAnimals();*/

        System.out.println("//////////////////////////////////////////////////////");

        QueueKitchen27 <Cat> queueKitchen = new QueueKitchen27<>();

        queueKitchen.add(cat);
        queueKitchen.add(kitty);
        //queueKitchen.feed();
        queueKitchen.add(cat2);
        //queueKitchen.getAnimals();
        queueKitchen.add(cat3);

        //queueKitchen.getAnimals();

        queueKitchen.feed();
        //queueKitchen.getAnimals();
        queueKitchen.feed();
        //queueKitchen.getAnimals();
        queueKitchen.feed();
        //queueKitchen.getAnimals();

        System.out.println("//////////////////////////////////////////////////////");

        /*StackKitchen27 <Cat> queueKitchen = new StackKitchen27<>();

        queueKitchen.add(cat);
        queueKitchen.add(kitty);
        //queueKitchen.feed();
        queueKitchen.add(cat2);
        //queueKitchen.getAnimals();
        queueKitchen.add(cat3);

        //queueKitchen.getAnimals();

        queueKitchen.feed();
        //queueKitchen.getAnimals();
        queueKitchen.feed();
        //queueKitchen.getAnimals();
        queueKitchen.feed();
        //queueKitchen.getAnimals();*/

        
    }


}
