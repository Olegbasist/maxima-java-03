package org.example;

// TODO: 07.10.2022 Описать класс CatStatistics со статическими методами:
//      ArrayList<Cat> sortByNameAscending(ArrayList<Cat> cats) — возвращает список котов, отсортировав по имени по возрастанию.
//      ArrayList<Cat> sortByWeightDescending(ArrayList<Cat> cats) — возвращает список котов, отсортировав по убыванию веса.
//      ArrayList<Cat> removeFirstAndLast (ArrayList<Cat> cats) — возвращает список котов кроме первого и последнего.
//      Cat findFirstNonAngryCat (ArrayList<Cat> cats) — возвращает первого не-сердитого кота в списке.
//      int getCommonWeight(ArrayList<Cat> cats, boolean onlyAngry) — возвращает суммарный вес всех котов (если параметр onlyAngry равен true, то только сердитых котов).
//      Map<String, List<Cat>> groupCatsByFirstLetter (ArrayList<Cat> cats) — возвращает список котов сгруппировав их по первой букве имени и отсортировав группировку по возрастанию.

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CatStatistics {

    public void streamApiTest (ArrayList<Cat> cats){

        //Фильтрует злых котов:
        //cats.stream().filter(cat -> cat.isAngry() == true).forEach(cat -> System.out.println(cat.getName()));

        //cats.stream().forEachOrdered(cat -> System.out.println(cat.getName()));
        //Arrays.stream(cats.toArray()).forEach(cat -> System.out.println(cat));
        //Stream.of(cats.toArray()).forEach(cat -> System.out.println(cat));
        //cats.forEach(System.out::println);

    }


    public void catsToString(ArrayList<Cat> cats) {
        //cats.forEach(cat -> System.out.println(cat.toString()));
        cats.forEach(cat -> System.out.println((cats.lastIndexOf(cat) + 1)
                + ". "
                + cat.getName()
                + " весом "
                + cat.getWeight()
                + "Кг."
                + (cat.isAngry() ? " ... злой" : " ... добрый")));
    }

    ArrayList<Cat> sortByName(ArrayList<Cat> cats) {

        Map<String, Cat> catsMap = new HashMap<>(); //Объявление коллекции Map
        cats.forEach(e -> catsMap.put(e.getName(), e)); //Передача всех котов из ArrayList в Map
        catsToString(cats);

        System.out.println("///////////////////////////////////////");

        Supplier<Cat> catRandomizer = () -> {
            int value = (int) (Math.random() * cats.size());
            return cats.get(value);
        };
        System.out.println(catRandomizer.get().getName());
        System.out.println("///////////////////////////////////////");
        //cats.forEach(cat -> System.out.println(cat.getName()));

        //Проверка сколько котов поместилось в коллекцию
        System.out.print("Котов в мапе: ");
        System.out.println(catsMap.size());
        //System.out.println(catsMap.get("Пушок").getName()); //Поиск конкретного кота по ключу

        //Вывод котов

        for (String key : catsMap.keySet()) {
            System.out.println(key);
            //System.out.println(catsMap.get(catsMap.get(key)));
        }
        for (Object entry : catsMap.entrySet()) {
            System.out.println(entry);
            //System.out.println(catsMap.get(catsMap.get(key)));
        }

        System.out.println("===============================================================");


        //Перемешиваем Array
            /*Collections.shuffle(cats);
            cats.forEach(cat -> System.out.println(cat.getName()));
            System.out.println("---------------------------------------------");
            Collections.reverse(cats);
            cats.forEach(cat -> System.out.println(cat.getName()));
            System.out.println("----------------------------------------------");*/

        //Не работающий код:
        /*Arrays.sort(cats, new Comparator<Cat>() {

            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });*/


        //cats.forEach(cat -> System.out.println(cat.getWeight() + cat.getName()));


        return cats;

    }

    //Сортируем с помощью компаратора ...

    public ArrayList<Cat> sortByNameAscending(ArrayList<Cat> cats) {

        //cats.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));
        cats.sort((Comparator.comparing(Cat::getName)));
        //Collections.sort(cats, (Comparator.comparing(Cat::getName)));

        return cats;
    }

    public ArrayList<Cat> sortByWeightDescending(ArrayList<Cat> cats) {

        //Collections.sort(cats, (o1, o2) -> o2.getWeight() - o1.getWeight());
        cats.sort((o1, o2) -> o2.getWeight() - o1.getWeight());

        return cats;
    }

    //Простое удаление первого и последнего котов
    public ArrayList<Cat> removeFirstAndLast(ArrayList<Cat> cats) {

        cats.trimToSize();
        cats.remove(cats.size() - 1);
        cats.remove(0);

        return cats;
    }

    public Cat findFirstNonAngryCat(ArrayList<Cat> cats) {

// Можно просто циклом перебрать котов до первого "не сердитого" ...
        Cat cat = null;

        /*for (int i = 0; i <cats.size() ; i++) {
            if (!cats.get(i).isAngry()){
                cat = cats.get(i);
                break;

            }
        }*/

        for (Cat value : cats) {
            if (!value.isAngry()) {
                cat = value;
                break;

            }
        }

        return cat;
    }

    public int getCommonWeight(ArrayList<Cat> cats, boolean onlyAngry) {
        int summaryWeight = 0;

        if (onlyAngry) {
            for (Cat cat : cats) {
                if (cat.isAngry()) {
                    summaryWeight += cat.getWeight();
                }
            }
        } else {
            for (Cat cat : cats) {
                summaryWeight += cat.getWeight();
            }
        }

            return summaryWeight;
    }

    public Map<String, List<Cat>> groupCatsByFirstLetter (ArrayList<Cat> cats) {

        Map<String, List<Cat>> catsMap = new HashMap<>(); //Объявление коллекции Map


        return catsMap;
    }

}
