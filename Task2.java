//Inheritance,Variable declaration,Object creation,Access modifier,Method with parameters.
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " (a " + breed + " dog) barks.");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.displayInfo();
        myDog.makeSound();
    }
}
