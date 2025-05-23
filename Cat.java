package animal;


public class Cat extends Animal implements Pet{
     private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    public void displayColor() {
        System.out.println("Color: " + color);
    }

    @Override
    public void play() {
        System.out.println(name + " the cat is playing with a ball of yarn!");
    }
}

