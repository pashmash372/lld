package com.scaler.lld.bird1;

import com.scaler.lld.bird1.interfaces.Flyable;

public class Parrot extends Bird implements Flyable {

    public Parrot(Integer weight, String colour, String size, String beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Parrot is making sound");
    }

}