package part03;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2140s
//        starts at about 35:40 — stop at about 38:50, at "your assignment for today"
// Guide: GUIDE.md in this folder, steps 1–4
//
// Part 03, topic 1 — swapping two variables
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Swap.
//    Leave the "package part03;" line and the "public class Swap" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class Swap {
    // This is where the program starts running.
    public static void main(String[] args) {
        // Create a String variable x and give it "water".
        String x = "water";
        // Create a String variable y and give it "Kool-Aid".
        String y = "Kool-Aid";
        // Create a third String called
        String temp;
        // Save the original value of x in temp.
        temp = x;
        // Change x to the value stored in y.
        x = y;
        // Change y to the original value of x.
        y = temp;
        // Print the new value of x.
        System.out.println("x: " + x);
        // Print the new value of y.
        System.out.println("y: " + y);

    }
}
