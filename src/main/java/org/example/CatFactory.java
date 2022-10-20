package org.example;

//   29.09.2022 Описать фабрику котов CatFactory
//   со статическим методом Cat createCat(String name, int weight).
//   Этот метод будет пытаться создать кота, если вес указан корректный, то будет создан дружелюбный кот с указанным именем и весом.
//   Если вес указан неверно, но будет создан сердитый кот весом 5 кг.

public class CatFactory {



    public static Cat createCat(String name, int weight) throws IncorrectCatWeightException {

        try {
            return new Cat(name, weight, false);

        } catch (Exception e){
            System.out.println(e.getMessage());
            return new Cat(name, 5, true);
        }


    }

}
