// Define a Person class
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main class to demonstrate the output
public class PersonDemo {
    public static void main(String[] args) {
        // Creating two Person objects
        Person person1 = new Person("Bob", 30);
        Person person2 = new Person("Unknown", 0);

        // Display a message before showing details
        System.out.println("Displaying person details:");
        System.out.println("----------------------------");

        // Calling the display method for each person
        person1.display();
        person2.display();

        System.out.println("----------------------------");
        System.out.println("End of program.");
    }
}
