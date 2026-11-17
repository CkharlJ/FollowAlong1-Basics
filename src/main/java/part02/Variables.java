package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1340s
//        starts at about 22:20 — stop at about 35:00, after he prints "Hello Bro"
// Guide: GUIDE.md in this folder — the same lesson, written out step by step
//
// Part 02 — variables
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Variables.
//    Leave the "package part02;" line and the "public class Variables" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// // Defines a public class named Main.
public class Variables {
    //The main method is the starting point of the Java program.
    public static void main(String[] args) {
        // This line  declared an int called x
        int x;
        // and we assign x to 123 in this line
        x = 123;
        // This line printed 123 cause we did assign x to it
        System.out.println(x);
        // this line printed literally x because we have x inside quotes.
        System.out.println("x");
        // the line printed My number is and then a space 123.
        System.out.println("My number is " + x);
        // this line will print 3000000000. and without the L , it will be an error saying the int is too long.
        long debt = 30000000000L;
        System.out.println(debt);
        // this line assigned b to 100
        byte b = 100;
        // and then printed out 100
        System.out.println(b);
        // this line we assign y to 3.14 and then the f symbol have to be here otherwise it will print error cause we assign float to it at the beginning.
        float y = 3.14f;
        // printed out 3.14
        System.out.println(y);
        // we assign y2 to 3.14 and tell java to consider the number a double
        double y2 = 3.14;
        // printed out 3.14
        System.out.println(y2);
        // assign z to true
        boolean z = true;
        //printed out true
        System.out.println(z);
        // assign a symbol to @
        char symbol = '@';
        // and print out @
        System.out.println(symbol);
        // assign name to "Bro"
        String name = "Bro";
        // prints out Hello and then a space and Bro
        System.out.println("Hello " + name);

    }
}
