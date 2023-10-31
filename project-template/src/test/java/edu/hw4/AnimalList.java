package edu.hw4;

import java.util.ArrayList;
import java.util.List;

public class AnimalList {
    public final static ArrayList<Animal> animals = new ArrayList<>(){{
        add(new Animal("Bob", Animal.Type.CAT, Animal.Sex.M, 2, 30, 3, false));
        add(new Animal("Tomi", Animal.Type.DOG, Animal.Sex.F, 4, 50, 5, true));
        add(new Animal("Tod", Animal.Type.FISH, Animal.Sex.M, 1, 10, 1, false));
        add(new Animal("Molly", Animal.Type.BIRD, Animal.Sex.F, 3, 25, 3, false));
        add(new Animal("Maggie", Animal.Type.SPIDER, Animal.Sex.F, 1, 5, 1, true));
        add(new Animal("Buddy M", Animal.Type.DOG, Animal.Sex.M, 7, 120, 10, false));
        add(new Animal("Bo", Animal.Type.CAT, Animal.Sex.F, 2, 35, 3, false));
        add(new Animal("Shadow", Animal.Type.DOG, Animal.Sex.F, 4, 55, 6, true));
        add(new Animal("Max", Animal.Type.DOG, Animal.Sex.F, 2, 5, 6, true));

    }};

    public static ArrayList<Animal> getAnimals(){
        ArrayList<Animal> animalsClone = new ArrayList<Animal>(animals.size());
        animalsClone.addAll(animals);
        return animalsClone;
    }
}
