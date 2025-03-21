package Topic_3_Methods;

import java.util.Scanner;

public class HelloMethods {

    // This is the main method - the first code to run
    public static void main(String[] args) {

        String name = stringInput("Please enter your name: ");
        String greeting = makeGreeting(name);
        System.out.println(greeting);

    } // End of the main method

    // Method to take user input
    public static String stringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // A new method that we've created.
    // This method takes one argument, a string.
    // It will create a new String made from the word "Hello"
    // plus the String argument, plus an exclamation point "!"
    public static String makeGreeting(String n) {
        return "Hello " + n + "!";
    } // End of the makeGreeting method
}   // End of the HelloMethods class
