import java.util.ArrayList;
import java.util.List;

// The class name must perfectly match the file name (Main.java)
public class Main {

    // The main method is the starting entry point of any Java program
    public static void main(String[] args) {
        
        // 1. Print a message to the console
        System.out.println("Hello, World!");

        // 2. Variables and basic math
        int firstNumber = 10;
        int secondNumber = 20;
        int totalSum = firstNumber + secondNumber;
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + totalSum);

        // 3. Creating an object of this class to use an instance method
        Main program = new Main();
        program.runLoopDemo();

        // 4. Working with a basic List collection
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C++");

        System.out.println("\nLanguages in the list:");
        for (String language : programmingLanguages) {
            System.out.println("- " + language);
        }
    }

    // A helper method demonstrating a standard 'for loop'
    public void runLoopDemo() {
        System.out.println("\nCounting from 1 to 3:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Number: " + i);
        }
    }
}

