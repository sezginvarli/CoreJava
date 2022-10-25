package day29;

public class E01 {
    /*
        When we use "throw" keyword?
        When we want to throw any Exception in a method body, we use "throw" keyword.
        We can use "throw" keyword many times in a method body.
        After using "throw" keyword, we have to create an Exception Object("new" + "constructor").
    */
    public static void main(String[] args) {
        try {
            setAge(-12);
        } catch (IllegalArgumentException e) {
            System.out.println("Ages cannot be negative...");
        }
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException();
        } else {
            System.out.println("The age is " + age);
        }
    }
}
