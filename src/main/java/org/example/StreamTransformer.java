package org.example;

//  29.09.2022 Описать класс StreamTransformer, реализующий интерфейс Transformable
//   при помощи классов FileInputStream / FileOutputStream



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class StreamTransformer implements Transformable {


    @Override
    public void transform(String fileIn, String fileOut) {

        try {
            FileInputStream inputStream = new FileInputStream(fileIn);
            FileOutputStream outputStream = new FileOutputStream(fileOut);

            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);

            String str = new String(buffer, StandardCharsets.UTF_8); // Еще один способ прочитать с указанием кодировки

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
