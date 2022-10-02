package org.example;

// 26.09.2022  Описать класс Birthday c двумя статическими методами:
// int getAge(int year, int month, int date) — вернет возраст в днях
// LocalDate nextBirthday(int year, int month, int date) — вернет дату следующего дня рождения в 1000 дней.


import java.time.LocalDate;

public class App
{
    public static void main( String[] args )
    {
        
        System.out.print("Мой возраст в днях: ");
        System.out.println(Birthday.getAge(1980,7,1));
        System.out.println(" -------------------------------------------------- ");
        System.out.print("До следующего тысячного дня рождения:");
        System.out.print(1000 - ((Birthday.getAge(1980,7,1)) % 1000));
        System.out.println(" дней");
        System.out.print("Дата следующего тысячеденного дня рождения: ");
        System.out.println(Birthday.nextBirthday(1980,7,1));

    }
}
