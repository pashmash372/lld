package com.scaler.lld.bird;

public class Eagle extends FlyingBird{

    public Eagle(Integer weight, String colour, String size, String beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying ");
    }

    @Override
    public void makeSound() {

    }
}
