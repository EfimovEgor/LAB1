package org.example;

class Cat extends Animal {
    private static int counter = 0;

    public Cat(String name) {
        super(name, 200, 0); // Кошка может бегать, но не плавать
        counter++;
    }

    public static int getCounter() {
        return counter;

    }
}
