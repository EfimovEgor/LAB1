package org.example;

abstract class Fish extends Animal {
    private int length; // Делаем переменную нестатической

    private static int counter = 0;

    // Конструктор, который принимает длину рыбы
    public Fish(String name, int length) {
        super(name, 0, 100000); // Передаем только имя
        this.length = length;   // Устанавливаем длину рыбы
        counter++;
    }

    public void FishLength() {
        System.out.println("Длина рыбы " + getName() + " - " + length + " см");
    }

    @Override
    public void run(int distance) {
        System.out.println(getName() + " не бегает");
    }

    // Метод public, чтобы он был доступен для вызова
    public static int getCounter() {
        return counter;
    }


}
