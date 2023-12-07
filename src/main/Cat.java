package main;

public class Cat implements Animal {

    private String name;
    private Integer age;

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getAnimalName() {
        return name;
    }

    @Override
    public String getAnimalType() {
        return "Cat";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
