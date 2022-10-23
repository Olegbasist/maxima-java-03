package org.example;

// TODO: 29.09.2022 Описать класс, реализующий интерфейс Transformable :
//  (TextTransformer), при помощи классов FileReader / FileWriter

import java.io.*;

public class TextTransformer implements Transformable {

    @Override
    public void transform(String fileIn, String fileOut) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(fileIn));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut));
        String line;

        while ((line=reader.readLine())!=null) {
            writer.write(line);
            writer.newLine();
            writer.flush();
        }
        writer.close();
        reader.close();
    }
}
