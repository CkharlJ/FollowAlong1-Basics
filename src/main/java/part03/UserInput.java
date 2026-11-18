package part03;
// Import Scanner so we can read what the user types.
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        starts at about 39:25 — stop at about 47:00, after "that is how scanners work"
// Guide: GUIDE.md in this folder, steps 5–11
//
// Part 03, topic 2 — reading what the user types (Scanner)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this file.
//    His class is called Main. Yours is called UserInput.
//    Leave the "package part03;" line and the "public class UserInput" line alone.
//    He types an import line ABOVE the class. Type yours on the empty line
//    under "package part03;".
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. That includes the import line.
// Create a class called UserInput.
public class UserInput {
    // This is the main method where the program starts.
    public static void main(String[] args) {
        // Create a Scanner to read input from the keyboard.
        Scanner scanner = new Scanner(System.in);
        // printed out to Ask the user to enter their name.
        System.out.println("What is your name?");
        // Read the user's name and store it.
        String name = scanner.nextLine();
        // Print a greeting using the user's name.
        System.out.println("Hello " + name);
        //printed out to  Ask the user how old they are.
        System.out.println("How old are you?");
        // Read the user's age as a whole number.
        int age = scanner.nextInt();
        // Clear the leftover newline after entering the age.
        scanner.nextLine();
        // Print the user's age.
        System.out.println("You are " + age + " years old");
        //printed out to  Ask the user about their favorite food.
        System.out.println("What is your favorite food?");
        // Read the user's favorite food.
        String food = scanner.nextLine();
        // Print the user's favorite food.
        System.out.println("You like " + food);
    }
}
