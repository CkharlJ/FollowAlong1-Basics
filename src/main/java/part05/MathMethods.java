package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3518s
//        Math class starts at about 58:38 — stop at about 61:29, "here's a project"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 05 — the Math class: max, min, abs, sqrt, round, ceil, floor
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called MathMethods.
//    Leave the "package part05;" line and the "public class MathMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class MathMethods {
    public static void main(String[] args) {
        // Create a double variable x and set it to 3.14.
        double x = 3.14;
        // Create a double variable y and set it to -10.
        double y = -10;
        // Find the bigger number between x and y.
        double z = Math.max(x, y);
        // Print the bigger number.
        System.out.println(z);
        // Find the smaller number between x and y.
        z = Math.min(x, y);
        // Print the smaller number.
        System.out.println(z);
        // Find the absolute which will be positive  value of y.
        z = Math.abs(y);
        // Print the absolute value.
        System.out.println(z);
        // Try to find the square root of a negative number.
        z = Math.sqrt(y);
        // Print NaN because the square root is not real.
        System.out.println(z);
        // Change the value of y to 3.16.
        y = 3.16;
        // Find the square root of the new value of y.
        z = Math.sqrt(y);
        // Print the square root result.
        System.out.println(z);
        // Round x to the nearest whole number.
        z = Math.round(x);
        // Print the rounded number.
        System.out.println(z);
        // Round x up to the next whole number.
        z = Math.ceil(x);
        // Print the rounded-up number.
        System.out.println(z);
        // Round x down to the previous whole number.
        z = Math.floor(x);
        // Print the rounded-down number.
        System.out.println(z);
    }
}
