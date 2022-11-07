package org.example;

//  29.09.2022 Описать класс StreamTransformer, реализующий интерфейс Transformable
//   при помощи классов FileInputStream / FileOutputStream

import sun.security.util.IOUtils;

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


            String str = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
            System.out.println(str);


            FileOutputStream outputStream = new FileOutputStream(fileOut);
            outputStream.write((byteArrayOutputStream.toString().getBytes()));
            outputStream.flush();
            outputStream.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
