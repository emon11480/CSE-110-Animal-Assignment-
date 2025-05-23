
package animal;


public class Dog extends Animal implements Pet{
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    public void displayBreed() {
        System.out.println("Breed: " + breed);
    }

    @Override
    public void play() {
        System.out.println(name + " the dog is playing fetch!");
    }
}
    

