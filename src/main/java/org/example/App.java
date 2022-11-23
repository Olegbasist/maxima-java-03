package org.example;

//  03.11.2022 Описать класс Dog с методами аналогичными классу Cat, но не имеющего с ним общих предков.
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
        //System.out.print(!cat.isAngry() ? "Добрый " : "Злой ");
        //System.out.println(cat.getName() + " весом " + cat.getWeight() + " кило");

        System.out.println("-------------------------------");

        Dog doggy = new Dog("Барбос", 18, false);
        //System.out.print(!doggy.isAngry() ? "Добрый " : "Злой ");
        //System.out.println(doggy.getName() + " весом " + doggy.getWeight() + " кило");

        System.out.println("-------------------------------");

        StackKitchen<Cat> stackKitchen = new StackKitchen<>();
        stackKitchen.add(11);
        stackKitchen.add(12);
        stackKitchen.add(14);
        stackKitchen.add(doggy);
        stackKitchen.getAnimals();

        //stackKitchen.feedAll();
        stackKitchen.feed();
        stackKitchen.getAnimals();
        stackKitchen.feed();
        stackKitchen.getAnimals();

        /*QueueKitchen <Cat> queueKitchen = new QueueKitchen<>();
        queueKitchen.add(11);
        queueKitchen.add(cat);
        queueKitchen.add(kitty);
        queueKitchen.feed();
        queueKitchen.add(cat);
        queueKitchen.getAnimals();
        //queueKitchen.add(cat);
        queueKitchen.add(doggy);
        //queueKitchen.add(11);

        //System.out.println(queueKitchen.getAnimals());

        queueKitchen.feed();
        //System.out.println(queueKitchen.getAnimals());
        queueKitchen.feed();
        //System.out.println(queueKitchen.getAnimals());
        queueKitchen.feed();
       // System.out.println(queueKitchen.getAnimals());*/

        
    }


}
