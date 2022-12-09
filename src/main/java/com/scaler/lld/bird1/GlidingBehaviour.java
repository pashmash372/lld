package com.scaler.lld.bird1;

import com.scaler.lld.bird1.interfaces.FlyingBehaviour;

public class GlidingBehaviour implements FlyingBehaviour {

    @Override
    public void makeFly() {
        System.out.println("Gliding");
    }
}
