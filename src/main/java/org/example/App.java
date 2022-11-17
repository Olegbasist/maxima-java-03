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


import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

public class App
{
    public static void main( String[] args ) throws Exception {


        //TextTransformer transformer = new TextTransformer();
        String fileIn = "myEngCats.csv";
        String fileOut = "myEngCats.txt";

        String fileInRu = "myCats.csv";
        String fileOutRu = "myCats.txt";
        //transformer.transform(fileIn,fileOut);

// Тренируемся получать поток из файла

        //FileInputStream fileInputStream = new FileInputStream(fileInRu); ///



        // Вывод в консоль
        /*Reader reader = new InputStreamReader(fileInputStream, Charset.forName("utf-8"));
        //BufferedReader bufferedReader = new BufferedReader(reader);

        int r;
        StringBuilder stringBuilder = new StringBuilder();
        do{
            r = reader.read();
            stringBuilder.append((char) r);
        } while (r!=-1);

        System.out.println(stringBuilder);
*/


        /*Stream<String> stream = bufferedReader.lines();
        stream.forEachOrdered((s -> System.out.println(s)));
        System.out.println(reader.toString().getBytes("utf-8"));*/

// Тренируемся читать поток побайтово в цикл

        /*System.out.println("-----------------------------------------------------");
        FileInputStream fileInputStream1 = new FileInputStream(fileOut);


        stringBuilder.delete(0,stringBuilder.capacity());
        r=0;
        do{
            r = fileInputStream1.read();
            stringBuilder.append((char) r);

        } while (r!=-1);

        System.out.println(stringBuilder);*/
//Записываем результат в файл
        /*System.out.println("-----------------------------------------------------");
        FileOutputStream fileOutputStream = new FileOutputStream(fileOut);
        fileOutputStream.write(stringBuilder.toString().getBytes(StandardCharsets.UTF_8));
        fileOutputStream.flush();
        fileOutputStream.close();

        FileInputStream fileInputStream2 = new FileInputStream(fileOut);
        stringBuilder.delete(0,stringBuilder.capacity());
        r = 0;
        do{
            r = fileInputStream2.read();
            stringBuilder.append((char) r);

        } while (r!=-1);

        System.out.println(stringBuilder);*/

 //////////////////////////////////////////////////////////////////////////////////////
      /* FileInputStream stream2 = new  FileInputStream(fileIn);
        StringBuilder result = new StringBuilder();

        do {
            r = stream2.read();
            result.append((char) r);
        }while (r!=-1);
        System.out.println(result.toString());*/

// Тренируемся записывать в файл

        /*OutputStream fileOutputStream = new FileOutputStream("test.txt");

        fileOutputStream.write(stream.toString().getBytes(Charset.forName("utf-8")));
        fileOutputStream.write(reader.toString().getBytes(Charset.forName("utf-8")));

        fileOutputStream.flush();
        fileOutputStream.close();*/

        // Используем StreamTransformer

        StreamTransformerBuffered streamTransformer = new StreamTransformerBuffered();
        streamTransformer.transform(fileInRu, fileOutRu);
        //System.out.println(System.getProperties().getProperty("file.encoding"));

    }
}
