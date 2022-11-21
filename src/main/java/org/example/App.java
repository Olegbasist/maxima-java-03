package org.example;

//  03.11.2022 Описать класс Dog с методами аналогичными классу Cat, но не имеющего с ним общих предков.
//
//  03.11.2022 Описать интерфейс AnimalKitchen — описывает кормление группы любых животных.
//  Методы:
//      void add ( экземпляр животного) — добавить животное в очередь.
//      void feed() - покормить очередное животное (исключить его из очереди на кормление).
//
//  03.11.2022 Описать два класса QueueKitchen и StackKitchen,
//  реализующие кормление животных по принципам FIFO и LIFO соответственно. (Подсказка: это конвейер)


public class App
{
    public static void main( String[] args ) throws Exception {

        System.out.println("-------------------------------");


        Cat kitty = new Cat("Пушок", 3,false);
        //kitty.setWeight(-8);
        //System.out.print(!kitty.isAngry() ? "Добрый " : "Злой ");
       // System.out.println(kitty.getName() + " весом " + kitty.getWeight() + " кило");

        System.out.println("-------------------------------");


        Cat cat = CatFactory.createCat("Рыжик", 88);
        //System.out.print(!cat.isAngry() ? "Добрый " : "Злой ");
        //System.out.println(cat.getName() + " весом " + cat.getWeight() + " кило");

        System.out.println("-------------------------------");

        Dog doggy = new Dog("Барбос", 18, false);
        //System.out.print(!doggy.isAngry() ? "Добрый " : "Злой ");
        //System.out.println(doggy.getName() + " весом " + doggy.getWeight() + " кило");

        System.out.println("-------------------------------");

        /*ArrayList<Cat> animalsList = new ArrayList<>();
        animalsList.add(cat);
        animalsList.add(kitty);*/
        //System.out.println(animalsList.get(0).getName());

        StackKitchen <Cat> stackKitchen = new StackKitchen<>();
        stackKitchen.add(cat);
        stackKitchen.add(kitty);
        stackKitchen.add(kitty);
        stackKitchen.add(doggy);
        stackKitchen.getAnimals();

        //stackKitchen.feedAll();
        stackKitchen.feed();
        stackKitchen.feed();

        stackKitchen.getAnimals();

        /*QueueKitchen <Cat> queueKitchen = new QueueKitchen<>();
        queueKitchen.add(11);
        queueKitchen.add(cat);
        queueKitchen.add(kitty);
        queueKitchen.feed();
        queueKitchen.add(cat);
        queueKitchen.getAnimals();
        //queueKitchen.add(cat);
        queueKitchen.add(doggy);
        //queueKitchen.add(11);

        //System.out.println(queueKitchen.getAnimals());

        queueKitchen.feed();
        //System.out.println(queueKitchen.getAnimals());
        queueKitchen.feed();
        //System.out.println(queueKitchen.getAnimals());
        queueKitchen.feed();
       // System.out.println(queueKitchen.getAnimals());*/






///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Подсказка с ArrayList из транспортов ту сити:
        // Добавляем все вихикл в ЭррейЛист и затем ищем минимум

        /*ArrayList<Transport> arrOfTransports = new ArrayList<>();
        //arrOfTransports.add(vehicles[0]);
        //arrOfTransports.add(vehicles[1]);
        Collections.addAll(arrOfTransports, vehicles);
        arrOfTransports.forEach(elem -> System.out.println(elem));
        for (Transport obj: arrOfTransports){
            //Collections.addAll(objectsArrayList, obj.getPrice(city2));
            float costOfDelivery = obj.getPrice(city2);
            //System.out.println(obj);
            System.out.print(obj.getName());
            System.out.print(" доставит груз за - ");
            System.out.println(costOfDelivery);
            if (minCostOfDelivery > costOfDelivery && costOfDelivery !=0) {
                minCostOfDelivery = costOfDelivery;
                cheapestVehicle = obj;
            };*/


        // Посылаем объекты в Logistics заполняя ими vehicles



       // Logistics logistics = new Logistics(vehicles);


        /*logisticsWithoutList.setVehicles(vehicles[0]);
        logisticsWithoutList.setVehicles(vehicles[1]);
        logisticsWithoutList.setVehicles(vehicles[2]);
        logisticsWithoutList.setVehicles(vehicles[3]);
        logisticsWithoutList.setVehicles(vehicles[4]);*/
        //logisticsWithoutList.setVehicles(new Truck("Грузищще", 5864, 120, 1.1f));
//        System.out.println("Вот какие транспорты получились:");
//        logistics.listOfVehicles();
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Намётки:
        // ObjectOutputStream и ObjectInputStream. = конвеерные потоки.

    }


}
