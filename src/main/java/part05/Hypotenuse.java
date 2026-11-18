package part05;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3689s
//        the hypotenuse project starts at about 61:29 — stop at about 63:52
// Guide: GUIDE.md in this folder, steps 7–10
//
// Part 05 — a project that uses the Math class: find the long side of a triangle
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Hypotenuse.
//    Leave the "package part05;" line and the "public class Hypotenuse" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class Hypotenuse {
    public static void main(String[] args) {
        // Create a variable to store the first side.
        double x;
        // Create a variable to store the second side.
        double y;
        // Create a variable to store the hypotenuse.
        double z;
        // Create a Scanner to read user input.
        Scanner scanner = new Scanner(System.in);
        // Ask the user to enter the first side.
        System.out.println("Enter side x: ");
        // Read the first side entered by the user.
        x = scanner.nextDouble();
        // Ask the user to enter the second side.
        System.out.println("Enter side y: ");
        // Read the second side entered by the user.
        y = scanner.nextDouble();
        // Calculate the hypotenuse using the Pythagorean theorem.
        z = Math.sqrt((x * x) + (y * y));
        // Print the calculated hypotenuse.
        System.out.println("The hypotenuse is: " + z);
        // Close the Scanner after using it.
        scanner.close();
    }

}
