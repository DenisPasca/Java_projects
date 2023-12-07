package main;


// adopter person, implements observer and uses the update method for the notify action
public class PotentialAdopter implements Observer {


    private String name;

    public PotentialAdopter(String name) {
        this.name = name;
    }

    @Override
    public void update(Animal animal, String action) {
        System.out.println(name + " received notification: " + action + " - " + animal.getAnimalType() + " - " + animal.getAnimalName());
    }
}
