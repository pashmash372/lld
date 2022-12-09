package com.scaler.lld.bird1;

import com.scaler.lld.bird1.interfaces.Flyable;

public class Eagle extends Bird implements Flyable {
    public Eagle(Integer weight, String colour, String size, String beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle is making sound");
    }
}
