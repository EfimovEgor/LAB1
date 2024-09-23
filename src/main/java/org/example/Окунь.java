package org.example;

class Окунь extends Fish {
    private static final int LENGTH = 25;

    public Окунь(String name) {
        super(name, LENGTH);  // Передаем имя и длину
    }
//
//    public void FishLength() {
//        System.out.println("Длина рыбы " + getName() + " - " + LENGTH + " см");
//    }
}
