package org.example;

//  29.09.2022 Дан csv-файл с разделителями «;», содержащий данные:
//  Имя кота, вес кота, сердитость (true или false).
//
//  29.09.2022 Сформировать текстовый файл каждая строка которого будет соответствовать строке входного файла
//  и иметь вид: <Сердитый (Дружелюбный)> кот <Имя> весом <n>кг.

//  29.09.2022 Для этого описать интерфейс Transformable с методом void transform(String fileIn, String fileOut).
//   Параметрами задается имя входного и имя выходного файла.
//
//  29.09.2022 Описать класс, реализующий этот интерфейс:
//  TextTransformer, при помощи классов FileReader / FileWriter


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App
{
    public static void main( String[] args ) throws Exception {


        TextTransformer transformer = new TextTransformer();
        String fileIn = "myCats.csv";
        String fileOut = "myCats.txt";
        transformer.transform(fileIn,fileOut);


    }
}
