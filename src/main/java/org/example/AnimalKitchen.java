package org.example;

public interface AnimalKitchen <T extends OnlyCat & OnlyDog> {

   void add(T animal);
   void feed(T animal);

}
