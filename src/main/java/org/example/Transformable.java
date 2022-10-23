package org.example;

//   29.09.2022 Описать интерфейс Transformable
//   с методом void transform(String fileIn, String fileOut).
//   Параметрами задается имя входного и имя выходного файла.

public interface Transformable {

    void transform(String fileIn, String fileOut) throws Exception;

}
