package assignment1;

import java.util.ArrayList;
import java.util.List;

public class ZooKeeper {
    private String name;
    private int employeeId;
    private String shift;
    private List<Animal> assignedAnimals;

    public ZooKeeper(String name, int employeeId, String shift) {
        this.name = name;
        this.employeeId = employeeId;
        this.shift = shift;
        this.assignedAnimals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void assignAnimal(Animal animal) {
        assignedAnimals.add(animal);
    }

    public void viewAssignedAnimals() {
        System.out.println("Animals assigned to " + name + ":");
        for (Animal animal : assignedAnimals) {
            System.out.println("- " + animal.getName());
        }
    }
}

