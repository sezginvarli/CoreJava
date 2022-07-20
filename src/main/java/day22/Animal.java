package day22;

public class Animal {
    public void eat(){//Overridden Method

        System.out.println("Animals eat");
    }
    public Animal createAnimal(){

        return new Animal();
    }
}
