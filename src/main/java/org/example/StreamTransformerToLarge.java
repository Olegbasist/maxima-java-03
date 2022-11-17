package org.example;

//  29.09.2022 Описать класс StreamTransformer, реализующий интерфейс Transformable
//   при помощи классов FileInputStream / FileOutputStream


import java.io.*;
import java.nio.charset.StandardCharsets;

public class StreamTransformerToLarge implements Transformable {


    @Override
    public void transform(String fileIn, String fileOut) throws IOException {

        try {
            FileInputStream inputStream = new FileInputStream(fileIn);
            FileOutputStream outputStream = new FileOutputStream(fileOut);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            int r;
            
            // Чтение файла в массив байтов
            while ((r=inputStream.read()) != -1){
                byteArrayOutputStream.write(r);
            }

            String str = byteArrayOutputStream.toString(StandardCharsets.UTF_8); // Способ прочитать байты в правильной кодировке в строку

            String[] linesData = str.split("\n"); // Разделение на строки
            for (String inputLine : linesData) {

                String[] cellData = inputLine.split(";"); // Разделение на значения (столбцы)
                String outputLine = (((Boolean.parseBoolean(cellData[2])) ? "Сердитый" : "Дружелюбный") + " кот " + cellData[0] + " весом " + cellData[1] + "кг." + "\n");

                outputStream.write(outputLine.getBytes()); // Запись в файл

            }

            outputStream.flush();
            outputStream.close();



        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
