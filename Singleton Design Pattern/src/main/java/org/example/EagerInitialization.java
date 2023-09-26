package org.example;

import java.util.Random;

public class EagerInitialization {
    private static final EagerInitialization EAGER_INITIALIZATION = new EagerInitialization(new Random().nextInt(100));
    private int indexRandom;

    private EagerInitialization() {

    }

    private EagerInitialization(int indexRandom) {
        this.indexRandom = indexRandom;
    }

    public static EagerInitialization getInstance() {
        return EAGER_INITIALIZATION;
    }

    public void SayHi() {
        System.out.println("Say Hi: EagerInitialxation -> " + indexRandom);
    }

}
