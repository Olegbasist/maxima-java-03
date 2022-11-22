package org.example;

// TODO: 07.10.2022 Описать класс CatStatistics со статическими методами:
//      ArrayList<Cat> sortByNameAscending(ArrayList<Cat> cats) — возвращает список котов, отсортировав по имени по возрастанию.
//      ArrayList<Cat> sortByWeightDescending(ArrayList<Cat> cats) — возвращает список котов, отсортировав по убыванию веса.
//      ArrayList<Cat> removeFirstAndLast (ArrayList<Cat> cats) — возвращает список котов кроме первого и последнего.
//      Cat findFirstNonAngryCat (ArrayList<Cat> cats) — возвращает первого не-сердитого кота в списке.
//      int getCommonWeight(ArrayList<Cat> cats, boolean onlyAngry) — возвращает суммарный вес всех котов (если параметр onlyAngry равен true, то только сердитых котов).
//      Map<String, List<Cat>> groupCatsByFirstLetter (ArrayList<Cat> cats) — возвращает список котов сгруппировав их по первой букве имени и отсортировав группировку по возрастанию.


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

        StackKitchen <Cat> stackKitchen = new StackKitchen<>();
        stackKitchen.add(cat);
        stackKitchen.add(kitty);
        stackKitchen.add(kitty);
        stackKitchen.add(doggy);
        stackKitchen.getAnimals();

        //stackKitchen.feedAll();
        stackKitchen.feed();
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
