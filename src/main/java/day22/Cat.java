package day22;

public class Cat extends Mammal {

    @Override
    public void eat() {//Overriding Method

        System.out.println("Cats eat");
    }

    @Override//Checks the Overriding Rules
    public Animal createAnimal() {

        return new Cat();
    }
}
