package com.scaler.lld.bird1;

import com.scaler.lld.bird1.interfaces.Flyable;
import com.scaler.lld.bird1.interfaces.Swimmable;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BirdTest {

    @Test
    public void solve() {
        Flyable parrot = new Parrot(10, "Green", "Small", "Sharp", BirdType.Parrot);
        parrot.fly();
        ((Bird) parrot).makeSound();
    }

    @Test
    public void solve1() {
        Flyable eagle = new Eagle(20, "Brown", "Medium", "Sharp", BirdType.Eagle);
        eagle.fly();
        ((Bird) eagle).makeSound();
    }

    @Test
    public void solve2() {
        Bird penguin = new Penguin(30, "Black", "Large", "Sharp", BirdType.Penguin);
        penguin.makeSound();

        /* Make a penguin swim */
        ((Swimmable) penguin).swim();
    }
}