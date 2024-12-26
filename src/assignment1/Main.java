package assignment1;

public class Main {
    public static void main(String[] args) {
        // Create animals
        Animal lion = new Animal("Leo", "Lion", 5, "Meat", "Healthy");
        Animal giraffe = new Animal("Gigi", "Giraffe", 7, "Plants", "Healthy");

        // Create zookeeper
        ZooKeeper keeper = new ZooKeeper("John", 101, "Morning");
        keeper.assignAnimal(lion);
        keeper.assignAnimal(giraffe);

        // Create zoo
        Zoo zoo = new Zoo("Safari Park", "New York");
        zoo.addAnimal(lion);
        zoo.addAnimal(giraffe);
        zoo.addZooKeeper(keeper);

        // Display information
        zoo.viewAllAnimals();
        keeper.viewAssignedAnimals();
        lion.feedAnimal();
        giraffe.checkHealth();
    }
}
