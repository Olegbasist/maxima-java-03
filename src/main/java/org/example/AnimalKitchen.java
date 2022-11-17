package org.example;

// 03.11.2022 Описать интерфейс AnimalKitchen — описывает кормление группы любых животных.
//  Методы:
//      void add ( экземпляр животного) — добавить животное в очередь.
//      void feed() - покормить очередное животное (исключить его из очереди на кормление).
public interface AnimalKitchen <T> {

   void add(T animal);
   void feed(T animal);

}
