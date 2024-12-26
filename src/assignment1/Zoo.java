package assignment1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private String location;
    private List<Animal> animals;
    private List<ZooKeeper> zookeepers;

    public Zoo(String name, String location) {
        this.name = name;
        this.location = location;
        this.animals = new ArrayList<>();
        this.zookeepers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void addZooKeeper(ZooKeeper zooKeeper) {
        zookeepers.add(zooKeeper);
    }

    public void viewAllAnimals() {
        System.out.println("Animals in " + name + ":");
        for (Animal animal : animals) {
            System.out.println("- " + animal.getName() + " (" + animal.getSpecies() + ")");
        }
    }
}
