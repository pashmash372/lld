package com.scaler.lld.bird;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public abstract class Bird {
    private Integer weight;
    private String colour;
    private String size;
    private String beakType;
    private BirdType type;

    public abstract void makeSound();

}

