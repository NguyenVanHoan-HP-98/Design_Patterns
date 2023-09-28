package org.example.Factory;

import org.example.Animal.Cat;
import org.example.Animal.Dog;
import org.example.Animal.Duck;
import org.example.Animal.IAnimal;

import java.util.Random;

public class RandomAnimalFactory implements IAnnimalFactory {
    @Override
    public IAnimal CreateAnimal() {
        int type = new Random().nextInt(0, 3);
        if (type == 0) {
            return new Dog();
        } else if (type == 1) {
            return new Cat();
        } else {
            return new Duck();
        }

    }
}
