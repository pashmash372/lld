package com.scaler.lld.bird1;


import com.scaler.lld.bird1.interfaces.Swimmable;

public class Penguin extends Bird implements Swimmable {

    public Penguin(Integer weight, String colour, String size, String beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin is making sound");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming ");

    }

}