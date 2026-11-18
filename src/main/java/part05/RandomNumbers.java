package part05;
// Import Random to generate random values.
import java.util.Random;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3850s
//        random numbers start at about 64:10 — stop at about 68:28
// Guide: GUIDE.md in this folder, steps 11–16
//
// Part 05 — random numbers: nextInt, nextDouble, nextBoolean
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called RandomNumbers.
//    (Do NOT name it Random. Java already has a class called Random.)
//    Leave the "package part05;" line and the "public class RandomNumbers" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class RandomNumbers {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers.
        Random random = new Random();
        // Generate a random whole number from 1 to 6.
        int x = random.nextInt(6) + 1;
        // Print the random whole number.
        System.out.println(x);
        // Generate a random decimal number from 0 to less than 1.
        double y = random.nextDouble();
        // Print the random decimal number.
        System.out.println(y);
        // Generate a random true or false value.
        boolean z = random.nextBoolean();
        // Print the random boolean value.
        System.out.println(z);


    }

}
