package edu.hw4;

import java.util.List;

public class Task8 {
    public static Animal heaviestAnimalBelowFixedHeight(List<Animal> animals, int fixedHeight){
        Animal heaviestAnimal = null;
        int weightHeaviestAnimal = 0;
        for(var animal:animals){
            if(animal.height() < fixedHeight && weightHeaviestAnimal < animal.weight()){
                weightHeaviestAnimal = animal.weight();
                heaviestAnimal = animal;
            }
        }
        return heaviestAnimal;
    }
}
