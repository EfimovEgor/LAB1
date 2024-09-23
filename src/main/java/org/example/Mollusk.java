package org.example;

abstract class Mollusk extends Animal {
    private static int counter = 0;
    private final String uniqueness;

    public Mollusk(String name, String uniqueness) {
        super(name, 0, 0);
        this.uniqueness = uniqueness;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    // Реализация метода uniqueness() в Mollusk
    public void showUniqueness() {
        System.out.print(super.getName() + " уникален тем, что " + uniqueness); // Вывод общего текста
    }

    }

