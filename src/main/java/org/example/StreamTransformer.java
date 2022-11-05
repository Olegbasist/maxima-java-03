package org.example;

//  TODO 29.09.2022 Описать класс StreamTransformer, реализующий интерфейс Transformable
//   при помощи классов FileInputStream / FileOutputStream

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTransformer implements Transformable {


    @Override
    public void transform(String fileIn, String fileOut) throws IOException {

        try {
            FileInputStream inputStream = new FileInputStream(fileIn);
            StringBuilder string = new StringBuilder();
            int r;

            do {
                r = inputStream.read();
                string.append((char) r);
            } while (r != -1);

            FileOutputStream outputStream = new FileOutputStream(fileOut);
            outputStream.write((string.toString().getBytes()));
            outputStream.flush();
            outputStream.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
