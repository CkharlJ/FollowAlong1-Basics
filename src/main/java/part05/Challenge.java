package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3689s
//        rewatch 61:29–63:52 for Scanner + Math, 66:47–67:40 for dice rolls
// Guide: GUIDE.md in this folder, steps 7–10 and 13–14
//
// SECTION D — Challenge. The dice report. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.
import java.util.Scanner;
import java.util.Random;

public class Challenge {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("What is your name? ");
        String name = input.nextLine();

        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;

        int total = die1 + die2;
        int higher = Math.max(die1, die2);
        int lower = Math.min(die1, die2);
        int difference = Math.abs(die1 - die2);
        double average = total / 2.0;
        long roundedAverage = Math.round(average);

        System.out.println(name + " rolled a " + die1 + " and a " + die2);
        System.out.println("Total: " + total);
        System.out.println("Higher die: " + higher);
        System.out.println("Lower die: " + lower);
        System.out.println("Difference: " + difference);
        System.out.println("Average: " + average);
        System.out.println("Average, rounded: " + roundedAverage);

        input.close();
    }
}
