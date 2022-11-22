package org.example;

// TODO: 07.10.2022 Описать класс CatStatistics со статическими методами:
//      ArrayList<Cat> sortByNameAscending(ArrayList<Cat> cats) — возвращает список котов, отсортировав по имени по возрастанию.
//      ArrayList<Cat> sortByWeightDescending(ArrayList<Cat> cats) — возвращает список котов, отсортировав по убыванию веса.
//      ArrayList<Cat> removeFirstAndLast (ArrayList<Cat> cats) — возвращает список котов кроме первого и последнего.
//      Cat findFirstNonAngryCat (ArrayList<Cat> cats) — возвращает первого не-сердитого кота в списке.
//      int getCommonWeight(ArrayList<Cat> cats, boolean onlyAngry) — возвращает суммарный вес всех котов (если параметр onlyAngry равен true, то только сердитых котов).
//      Map<String, List<Cat>> groupCatsByFirstLetter (ArrayList<Cat> cats) — возвращает список котов сгруппировав их по первой букве имени и отсортировав группировку по возрастанию.

import java.nio.charset.StandardCharsets;
import java.util.*;

public class CatStatistics {

    ArrayList<Cat> sortByNameAscending(ArrayList<Cat> cats){

        Map<String, Cat> catsMap = new HashMap<>(); //Объявление коллекции Map
        cats.forEach(e->catsMap.put(e.getName(), e)); //Передача всех котов из ArrayList в Map

        //Проверка сколько котов поместилось в коллекцию
        System.out.print("Котов в мапе: ");
        System.out.println(catsMap.size());
        //System.out.println(catsMap.get("Пушок").getName());

        //Вывод котов

        for(String key: catsMap.keySet()){
            System.out.println(key);
            //System.out.println(catsMap.get(catsMap.get(key)));
        }
        for(Object entry: catsMap.entrySet()){
            System.out.println(entry);
            //System.out.println(catsMap.get(catsMap.get(key)));
        }


        return cats;
    }


}
