package com.scaler.lld.bird;

public class Parrot extends FlyingBird {

    public Parrot(Integer weight, String colour, String size, String beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void makeSound() {

    }
}
