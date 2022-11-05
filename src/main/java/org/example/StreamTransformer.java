package org.example;

//  TODO 29.09.2022 Описать класс StreamTransformer, реализующий интерфейс Transformable
//   при помощи классов FileInputStream / FileOutputStream

import java.io.*;

public class StreamTransformer implements Transformable {


    @Override
    public void transform(String fileIn, String fileOut) throws IOException {

        try {
            FileInputStream inputStream = new FileInputStream(fileIn);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int r;

            while ((r=inputStream.read()) != -1){
                byteArrayOutputStream.write(r);
            }

            FileOutputStream outputStream = new FileOutputStream(fileOut);
            outputStream.write((byteArrayOutputStream.toString().getBytes()));
            outputStream.flush();
            outputStream.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
