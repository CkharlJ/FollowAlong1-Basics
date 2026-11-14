package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2915s
//        rewatch 48:35–52:25 for + - * / % ++ -- and casting
// Guide: GUIDE.md in this folder, steps 1–6
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args){
        int n = 10;
        /* MY GUESS:
        This line will print 2
         */
        System.out.println(n / 4);
        /*MY GUESS
        This line will print 2
         */
        System.out.println(n % 4);
        /* MY GUESS
        This line will print 2.5
         */
        System.out.println(n / 4.0);
        n++;
        /* MY GUESS
        It will be printed out 11
         */
        System.out.println(n);
        n--;
        n--;
        /* MY GUESS
        It will be printed out 9
         */
        System.out.println(n);
        /* MY GUESS
        It will print 3.5
         */
        System.out.println((double) 7 / 2);
        /* MY GUESS
        It will be printed 6
         */
        System.out.print(7 / 2 * 2);

        int totalSeconds = 500;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        System.out.println(totalSeconds + " seconds is " + minutes + "minutes and " + seconds + " seconds");

        int score1 = 90;
        int score2 = 85;
        int score3 = 78;
        int total = score1 + score2 + score3;

        //Integer division removes the decimal part
        int intAverage = total / 3;
        System.out.println("int average:" + intAverage);
        // Casting to double keeps the decimal part
        double doubleAverage = (double) total / 3;
        System.out.println("double average: " + doubleAverage);

    }
}
