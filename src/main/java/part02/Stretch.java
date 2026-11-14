package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 if you forget how to make a variable of each type
// Guide: GUIDE.md in this folder, steps 4–10
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] arg) {
      /* MY GUESS
      This line will be print 7
       */
        int a = 7;
        /* MY GUESS
        This line will be print 7.0
         */
        double b = 7;
        System.out.println(a);
        System.out.println(b);

       /* MY GUESS
       This line will be print a + b
        */

        System.out.println("a + b");
       /* MY GUESS
       This line will be print a: 7 (because a = 7)
        */
        System.out.println("a: " + a);
       /* MY GUESS
       This line will print a empty quote which is a space and 77
        */
        System.out.println("" + a + a);
       /* MY GUESS
       This line will be display 14! (a is 7 so 7+7 and we add the exclamation mark since it is inside a quote
        */
        System.out.println(a + a + "!");
       /* MY GUESS
       That line will be print the value of the Uppercase letter A which is 65
        */
        char c = 'A';
        // I was wrong , I thought it will be print the value of Uppercase A
       /* MY GUESS
       This line will be print the letter c
        */
        System.out.println(c);
       /* MY GUESS
       This line will be print true
        */
        boolean on = true;
        System.out.println(on);

        String name = "Joseph";
        int age = 19;
        double gpa = 3.4;
        boolean commuter = true;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: "+ gpa);
        System.out.println("Commuter: " + commuter);

        char initial = 'J';
        int classes = 4;
        double credits = 15.5;
        boolean hasJob = true;
        String major = "Computer Science";
        System.out.println(initial + "takes " + classes + " classes in" + major + ", for " + credits + "credit hours. Has a job: " + hasJob);

        //Instead of lowercase s it is Uppercase S . I dont know if string with lowercase s was a error because when I ran it , it didnt say it was an error , Java was pointing to the next line.
        String city = "Dover";

        // that one it was the int number can not be this long (10 digits) so I took of one number makes it 9 digits
        long people = 400000000;
        //Java interprets "B" as a String not a char
        char grade = 'B';
        //the type should be double instead of float
        double  temp = 72.5;
        System.out.println(city + " " + people + " " + grade + " " + temp);
    }
}




