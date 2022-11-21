package org.example;

//   29.09.2022 Описать свой класс исключений — IncorrectCatWeightException
//   и выбрасывать его при присваивании коту отрицательного веса.

public class IncorrectCatWeightException extends Exception {
    public IncorrectCatWeightException(String message) {
        super(message);
    }
}
