package org.example;

//  29.09.2022 Дан csv-файл с разделителями «;», содержащий данные:
//  Имя кота, вес кота, сердитость (true или false).
//
// TODO: 29.09.2022 Сформировать текстовый файл каждая строка которого будет соответствовать строке входного файла
//  и иметь вид: <Сердитый (Дружелюбный)> кот <Имя> весом <n>кг.

//  TODO: 29.09.2022 Для этого описать интерфейс Transformable с методом void transform(String fileIn, String fileOut).
//   Параметрами задается имя входного и имя выходного файла.
//
// TODO: 29.09.2022 Описать класс, реализующий этот интерфейс:
//  TextTransformer, при помощи классов FileReader / FileWriter

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App
{
    public static void main( String[] args ) throws Exception {

        /*System.out.println("-------------------------------");


        Cat kitty = new Cat("Пушок", 3,false);
        //kitty.setWeight(-8);
        System.out.print(!kitty.isAngry() ? "Добрый " : "Злой ");
        System.out.println(kitty.getName() + " весом " + kitty.getWeight() + " кило");

        System.out.println("-------------------------------");


        Cat cat = CatFactory.createCat("Рыжик", 51);
        System.out.print(!cat.isAngry() ? "Добрый " : "Злой ");
        System.out.println(cat.getName() + " весом " + cat.getWeight() + " кило");*/

        System.out.println("-------------------------------");
        System.out.println("-------------------------------");

        Path myCsv = Paths.get("AllCatWeCanGet.csv");
        boolean exist = Files.exists(myCsv);
        System.out.println(exist ? ("Файл " +String.valueOf(myCsv)+ " существует") : "Файл не обраружен!");

        FileWriter writer = new FileWriter(String.valueOf(myCsv), true);
        String text = "Джордж;4;true";
        writer.write("\n" +text);
        writer.close();


        FileReader reader = new FileReader(String.valueOf(myCsv));
        int i =0;

        while((i = reader.read())!=-1 ) {
        System.out.print((char) i);
        }
        reader.close();




    }
}
