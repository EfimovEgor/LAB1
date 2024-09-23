package org.example;

public class Main {
    public static void main(String[] args) {
        // Объект щуки отдельно
        Щука shuka = new Щука("Щука");


        shuka.FishLength();

        // Массив с остальными животными
        Animal[] animals = {
                new Cat("Barsik"),
                new Dog("Bobik"),
                new Tiger("Sherhan"),
                shuka,
                new Окунь("Окунь"),
                new Losos("Лосось"),
                new Мидия("Мидия", "умеет плавать"),
                new Улитка("Герри", "может прятаться в панцире"),
                new Осьминог("Осьминог", "у него есть чернила")
        };

        // Обработка всех животных в массиве
        for (Animal animal : animals) {
            animal.run(400);
            animal.swim(1500);


        }
        System.out.println("\n");
        ((Fish) animals[4]).FishLength();
        System.out.println("\n");
        ((Fish) animals[5]).FishLength();
        System.out.println("\n");
        ((Mollusk) animals[6]).showUniqueness();
        System.out.println("\n");
        ((Mollusk) animals[7]).showUniqueness();
        System.out.println("\n");
        ((Mollusk) animals[8]).showUniqueness();
        System.out.println("\n");
        System.out.println("\nСоздано кошачьих: " + Cat.getCounter());
        System.out.println("Создано рыб: " + Fish.getCounter());
        System.out.println("Создано собачьих: " + Dog.getCounter());
        System.out.println("Создано тигров: " + Tiger.getCounter());
        System.out.println("Создано моллюсков: " + Mollusk.getCounter());
        System.out.println("Создано животных: " + Animal.getCount());

    }
}
