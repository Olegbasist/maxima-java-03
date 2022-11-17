package org.example;

//  29.09.2022 Дан csv-файл с разделителями «;», содержащий данные:
//  Имя кота, вес кота, сердитость (true или false).
//
//  29.09.2022 Сформировать текстовый файл каждая строка которого будет соответствовать строке входного файла
//  и иметь вид: <Сердитый (Дружелюбный)> кот <Имя> весом <n>кг.

//  29.09.2022 Для этого описать интерфейс Transformable с методом void transform(String fileIn, String fileOut).
//   Параметрами задается имя входного и имя выходного файла.
//
//   29.09.2022 Описать класс StreamTransformer, реализующий интерфейс Transformable
//   при помощи классов FileInputStream / FileOutputStream


public class App
{
    public static void main( String[] args ) throws Exception {


        String fileIn = "myEngCats.csv";
        String fileOut = "myEngCats.txt";

        String fileInRu = "myCats.csv";
        String fileOutRu = "myCats.txt";


        StreamTransformer streamTransformer = new StreamTransformer();
        streamTransformer.transform(fileInRu, fileOutRu);


    }
}
