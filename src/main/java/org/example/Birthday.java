package org.example;

//  26.09.2022  Описать класс Birthday c двумя статическими методами:
//  int getAge(int year, int month, int date) — вернет возраст в днях
//  LocalDate nextBirthday(int year, int month, int date) — вернет дату следующего дня рождения в 1000 дней.


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Birthday
{

    public static int getAge (int year, int month, int date)
    {
        return (int) ChronoUnit.DAYS.between(LocalDate.of(year, month, date), LocalDate.now());

    }

    public static LocalDate nextBirthday (int year, int month, int date)
    {
        if (getAge(year, month, date) % 1000 != 0) {
            return (LocalDate.now()).plusDays(1000 - (getAge(year, month, date) % 1000));
        }
        else {
            return LocalDate.now();
        }

    }

}
