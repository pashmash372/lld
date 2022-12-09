package com.scaler.lld.bird1;

import com.scaler.lld.bird1.interfaces.Flyable;
import com.scaler.lld.bird1.interfaces.FlyingBehaviour;

public class Eagle extends Bird implements Flyable {

    private final FlyingBehaviour flyingBehaviour;

    public Eagle(Integer weight, String colour, String size, String beakType, BirdType type, FlyingBehaviour flyingBehaviour) {
        super(weight, colour, size, beakType, type);
        this.flyingBehaviour = flyingBehaviour;
    }

    @Override
    public void fly() {
        flyingBehaviour.makeFly();
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle is making sound");
    }
}
