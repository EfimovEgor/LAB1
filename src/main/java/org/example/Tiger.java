package org.example;

class Tiger extends Animal {
    private static int counter = 0;

    public Tiger(String name) {
        super(name, 600, 100); // Примерные значения для Tiger
        counter++;
    }

    public static int getCounter() {
        return counter;

    }
}
