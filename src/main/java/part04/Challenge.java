package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s
//        rewatch 53:11–58:10 for JOptionPane, and 48:08–52:25 for the math
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. A tip calculator with pop-up windows. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.
/*
 * Name: Ckharl Joseph
 * Program: Tip Calculator
 * Calculates the tip, total meal cost, and amount each person pays.
 */

import javax.swing.JOptionPane;

public class Challenge {
    public static void main(String[] args) {

        String mealInput = JOptionPane.showInputDialog("Enter the meal cost:");
        double mealCost = Double.parseDouble(mealInput);

        String tipInput = JOptionPane.showInputDialog("Enter the tip percentage:");
        int tipPercent = Integer.parseInt(tipInput);

        String peopleInput = JOptionPane.showInputDialog("How many people are paying?");
        int people = Integer.parseInt(peopleInput);

        double tip = mealCost * tipPercent / 100;
        double total = mealCost + tip;
        double eachPays = total / people;

        int wholeDollars = (int) eachPays;
        double shortAmount = total % people;

        JOptionPane.showMessageDialog(null,
                "Tip: $" + tip + "\nTotal: $" + total);

        JOptionPane.showMessageDialog(null,
                "Each person pays: $" + eachPays
                        + "\nIf everyone pays $" + wholeDollars
                        + ", the remaining amount per person is $" + (eachPays - wholeDollars)
                        + "\nTotal amount left over if everyone pays $" + wholeDollars
                        + ": $" + (total - (wholeDollars * people)));

    }
}

