package main;

public class Dog implements Animal {


    private String name;
    private Integer age;


    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String getAnimalName() {
        return this.name;
    }

    @Override
    public String getAnimalType() {
        return "Dog";
    }

}

