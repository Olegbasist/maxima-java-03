package org.example;

// 26.09.2022  Описать класс Birthday c двумя статическими методами:
// int getAge(int year, int month, int date) — вернет возраст в днях
// LocalDate nextBirthday(int year, int month, int date) — вернет дату следующего дня рождения в 1000 дней.


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class App
{
    public static void main( String[] args )
    {

        /*LocalDate birthDate = LocalDate.of(2021,10,2);
        LocalDate nowadays = LocalDate.now();

        System.out.println(birthDate);
        System.out.println(birthDate.until(nowadays, ChronoUnit.DAYS));*/

        Birthday ageInDays = new Birthday();
        System.out.print("Мой возраст в днях: ");
        System.out.println(ageInDays.getAge(1980,7,1));
        System.out.println(" -------------------------------------------------- ");
        System.out.print("Дата следующего тысячеденного дня рождения: ");
        System.out.println(ageInDays.nextBirthday(1980,7,1));

    }
}
