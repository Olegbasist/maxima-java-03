package org.example;

//  TODO: 29.09.2022 Для этого описать интерфейс Transformable
//   с методом void transform(String fileIn, String fileOut).
//   Параметрами задается имя входного и имя выходного файла.

public interface Transformable {

    void transform(String fileIn, String fileOut) throws Exception;

}
