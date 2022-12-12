package org.example;

//  07.10.2022 Описать класс CatStatistics со статическими методами:
//      07.10.2022 ArrayList<Cat> sortByNameAscending(ArrayList<Cat> cats)
//          — возвращает список котов, отсортировав по имени по возрастанию.
//      07.10.2022 ArrayList<Cat> sortByWeightDescending(ArrayList<Cat> cats)
//          — возвращает список котов, отсортировав по убыванию веса.
//      07.10.2022 ArrayList<Cat> removeFirstAndLast (ArrayList<Cat> cats)
//          — возвращает список котов кроме первого и последнего.
//      07.10.2022 Cat findFirstNonAngryCat (ArrayList<Cat> cats)
//          — возвращает первого не-сердитого кота в списке.
//      TODO: 07.10.2022 int getCommonWeight(ArrayList<Cat> cats, boolean onlyAngry)
//          — возвращает суммарный вес всех котов
//          (если параметр onlyAngry равен true, то только сердитых котов).
//      TODO: 07.10.2022 Map<String, List<Cat>> groupCatsByFirstLetter (ArrayList<Cat> cats)
//          — возвращает список котов сгруппировав их по первой букве имени
//          и отсортировав группировку по возрастанию.


import java.util.ArrayList;

public class App
{
    public static void main( String[] args ) throws Exception {

        //Задаем котов по-одному ...
        //System.out.println("-------------------------------");

        Cat kitty = new Cat("Пушок", 3,false);
        /*System.out.print(!kitty.isAngry() ? "Добрый " : "Злой ");
        System.out.println(kitty.getName() + " весом " + kitty.getWeight() + " кило");
        */
        //System.out.println("-------------------------------");

        Cat cat = CatFactory.createCat("Рыжик", 88);
        /*System.out.print(!cat.isAngry() ? "Добрый " : "Злой ");
        System.out.println(cat.getName() + " весом " + cat.getWeight() + " кило");*/
        //System.out.println("-------------------------------");

        Cat cat1 = new Cat("Маркиз", 8, false);
        /*System.out.print(!cat1.isAngry() ? "Добрый " : "Злой ");
        System.out.println(cat1.getName() + " весом " + cat1.getWeight() + " кило");*/
        //System.out.println("-------------------------------");

        Cat cat2 = new Cat("Васька", 4, true);
        /*System.out.print(!cat2.isAngry() ? "Добрый " : "Злой ");
        System.out.println(cat2.getName() + " весом " + cat2.getWeight() + " кило");*/
        //System.out.println("-------------------------------");

        //Создаем из котов ArrayList
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat);
        cats.add(cat1);
        cats.add(cat2);
        cats.add(kitty);

        CatStatistics catStatistics = new CatStatistics();


        //Сортировки
        System.out.println();
        System.out.println("Несортированные коты: ");
        catStatistics.catsToString(cats);

        //catStatistics.sortByNameAscending(cats);
        //catStatistics.sortByWeightDescending(cats);
        //catStatistics.removeFirstAndLast(cats);
        //catStatistics.findFirstNonAngryCat(cats);
        System.out.println(catStatistics.getCommonWeight(cats, true));

        System.out.println();
        System.out.println("Сортированные коты: ");
        catStatistics.catsToString(cats);



}


}
