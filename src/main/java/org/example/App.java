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
//       07.10.2022 int getCommonWeight(ArrayList<Cat> cats, boolean onlyAngry)
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


        RandomCatsFactory randomCatsFactory = new RandomCatsFactory();
        System.out.println(randomCatsFactory.makeCats(5));



}


}
