package org.example;

//  29.09.2022 Описать класс StreamTransformer, реализующий интерфейс Transformable
//   при помощи классов FileInputStream / FileOutputStream


import java.io.*;
import java.nio.charset.StandardCharsets;

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


            String str = byteArrayOutputStream.toString(StandardCharsets.UTF_8); // Еще один способ прочитать байты в правильной кодировке в строку
            System.out.println(str);
            System.out.println("////////////////////////////////////");
            String[] cellData = str.split(";");
            System.out.println(((Boolean.parseBoolean(cellData[2])) ? "Сердитый" : "Дружелюбный") + " кот " + cellData[0] + " весом " + cellData[1] + "кг.");
            




               /* writer.write(((Boolean.parseBoolean(cellData[2])) ? "Сердитый" : "Дружелюбный") + " кот " + cellData[0] + " весом " + cellData[1] + "кг.");
                writer.newLine();
                writer.flush();
            }*/


            /*FileOutputStream outputStream = new FileOutputStream(fileOut);
            outputStream.write((byteArrayOutputStream.toString().getBytes()));
            outputStream.flush();
            outputStream.close();*/

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
