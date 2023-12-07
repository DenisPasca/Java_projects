package main;

import java.util.ArrayList;
import java.util.List;

// Singleton design pattern and Observer business logic implementation. Not sure if it should be implemented separately
public class AdoptionCenter {

    private static AdoptionCenter instance;
    private List<Animal> animalList;
    private List<Observer> observers;


    private AdoptionCenter() {
        this.animalList = new ArrayList<>();
        this.observers = new ArrayList<>();


    }

    // get Singleton instance
    public static AdoptionCenter getInstance() {
        if (instance == null) {
            instance = new AdoptionCenter();
        }

        return instance;
    }

    // add observer
    public void addObserver(Observer observer) {

        observers.add(observer);
    }

    // remove observer
    public void removeObserver(Observer observer) {

        observers.remove(observer);
    }

    // notify everyone when an animal is added
    private void notifyAnimalAdded(Animal a) {
        for (Observer observer : observers) {
            observer.update(a, "Animal added");
        }

    }

    // notify everyone when an animal is adopted
    private void notifyAnimalAdopted(Animal a) {
        for (Observer observer : observers) {
            observer.update(a, "Animal adopted");
        }

    }


    // add animal and call notify
    public void add(Animal a) {
        animalList.add(a);
        notifyAnimalAdded(a);
    }

    // remove animal and call notify
    public void adopt(Animal a) {

        animalList.remove(a);
        notifyAnimalAdopted(a);
    }

    // get a list of all the animals
    public List<Animal> getAnimals() {
        return animalList;
    }

    @Override
    public String toString() {
        return "AdoptionCenter{" +
                "animalList=" + animalList +
                ", observers=" + observers +
                '}';
    }
}
