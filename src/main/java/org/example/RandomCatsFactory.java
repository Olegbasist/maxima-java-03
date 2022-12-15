package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

public class RandomCatsFactory {

    public ArrayList<Cat> makeCats (int count) {

        ArrayList<Cat> cats = new ArrayList<>();
        String[] catName = new String[20];
        catName[0] = "Первыш";
        catName[1] = "Ленточка";
        catName[2] = "Машка";
        catName[3] = "Мурка";
        catName[4] = "Мурзик";
        catName[5] = "Черныш";
        catName[6] = "Рыжик";
        catName[7] = "Шурик";
        catName[8] = "Леопольд";
        catName[9] = "Маркиз";
        catName[10] = "Лорд";
        catName[11] = "Пенка";
        catName[12] = "Шурка";
        catName[13] = "Ночка";
        catName[14] = "Пушистик";
        catName[15] = "Аскольд";
        catName[16] = "Элвис";
        catName[17] = "Котяра";
        catName[18] = "Нурс";
        catName[19] = "Пушок";


        for (int i = 0; i < count; i++) {
            Supplier<Cat> catRandomizer = () -> {
                int value = (int) (Math.random() * 20);
                // Добавить проверку на пустоту и удаление
                String name = catName[value];
                int weight = (int) (Math.random() * (3 - 16));
                boolean isAngry = Math.random() < 0.8;


                try {
                 Cat cat = new Cat(name,weight,isAngry);
                    System.out.println(cat.toString());
                } catch (IncorrectCatWeightException e) {
                    throw new RuntimeException(e);
                }


                //cats.add(name,weight,isAngry);

                 return cats.get(0);
            };
        }


        return cats;
    }

}
