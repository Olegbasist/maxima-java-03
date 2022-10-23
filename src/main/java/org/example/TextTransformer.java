package org.example;

//  29.09.2022 Описать класс, реализующий интерфейс Transformable :
//  (TextTransformer), при помощи классов FileReader / FileWriter

import java.io.*;

public class TextTransformer implements Transformable {

    @Override
    public void transform(String fileIn, String fileOut) {

        try {

            BufferedReader reader = new BufferedReader(new FileReader(fileIn));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] cellData = line.split(";");

                writer.write(((Boolean.parseBoolean(cellData[2])) ? "Сердитый" : "Дружелюбный") + " кот " + cellData[0] + " весом " + cellData[1] + "кг.");
                writer.newLine();
                writer.flush();
            }
            writer.close();
            reader.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
