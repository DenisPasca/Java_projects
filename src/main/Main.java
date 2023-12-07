package main;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        var adoptionCenter = AdoptionCenter.getInstance();

        Observer adopter1 = new PotentialAdopter("Bob");
        Observer adopter2 = new PotentialAdopter("John");
        Observer adopter3 = new PotentialAdopter("Mary");

        adoptionCenter.addObserver(adopter1);
        adoptionCenter.addObserver(adopter2);
        adoptionCenter.addObserver(adopter3);

        Animal dog = new Dog("Rex", 7);
        Animal cat = new Cat("Tom", 3);
        Animal cat2 = new Cat("Chris", 3);


        adoptionCenter.add(dog);
        adoptionCenter.add(cat);

        adoptionCenter.removeObserver(adopter1);

        adoptionCenter.add(cat2);


        List<Animal> current_animals = adoptionCenter.getAnimals();
        System.out.println(current_animals);

    }
}
