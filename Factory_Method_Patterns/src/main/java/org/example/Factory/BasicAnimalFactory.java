package org.example.Factory;

import org.example.Animal.Cat;
import org.example.Animal.Dog;
import org.example.Animal.Duck;
import org.example.Animal.IAnimal;

public class BasicAnimalFactory implements IAnnimalFactory {
    int index = 0;

    @Override
    public IAnimal CreateAnimal() {
        if (index == 0) {
            index++;
            return new Duck();
        }
        if (index == 1) {
            index++;
            return new Cat();
        }
        if (index == 2) {
            index = 0;
            return new Dog();
        }
        return null;
    }
}
