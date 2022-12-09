package com.scaler.lld.bird;

import org.junit.Test;


public class BirdTest {

    @Test
    public void solve() {
        FlyingBird parrot = new Parrot(10, "Green", "Small", "Sharp", BirdType.Parrot);
        parrot.fly();
    }

    @Test
    public void solve1() {
        FlyingBird eagle = new Eagle(20, "Brown", "Medium", "Sharp", BirdType.Eagle);
        eagle.fly();
    }

    @Test
    public void solve2() {
        NonFlyingBird penguin = new Penguin(30, "Black", "Large", "Sharp", BirdType.Penguin);
        penguin.makeSound();
    }
}