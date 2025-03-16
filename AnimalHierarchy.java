class Animal{
    String name;
    int age;

    public void makeSound(){
        System.out.println("Sound of Animal");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog -> bark");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat -> meow");
    }
}

class Bird extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Bird -> chirping");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
        
        Bird bird = new Bird();
        bird.makeSound();
    }
}