package assignment1;

public class Animal {
    private String name;
    private String species;
    private int age;
    private String diet;
    private String healthStatus;

    public Animal(String name, String species, int age, String diet, String healthStatus) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.diet = diet;
        this.healthStatus = healthStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public void feedAnimal() {
        System.out.println(name + " is being fed.");
    }

    public void checkHealth() {
        System.out.println(name + "'s health status: " + healthStatus);
    }
}
