package part03;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        rewatch 39:25–47:00 for Scanner, and 43:34 for the nextInt trap
// Guide: GUIDE.md in this folder, steps 5–11
//
// SECTION D — Challenge. Mad Libs. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.
    /*
    * Name : Ckharl Joseph
    * The Shadow Monarch's  Secret
    */
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Name a character:");
        String character = input.nextLine();

        System.out.println("Name a monster:");
        String monster = input.nextLine();

        System.out.println("Pick a number:");
        int level = input.nextInt();
        input.nextLine();

        System.out.println("Name a place:");
        String place = input.nextLine();

        System.out.println("Name a weapon:");
        String weapon = input.nextLine();

        System.out.println();
        System.out.println(character + " entered " + place + " to hunt a terrifying " + monster + ".");
        System.out.println("After defeating " + level + " enemies, " + character + " discovered a legendary " + weapon + ".");
        System.out.println("The entire dungeon trembled as the Shadow Monarch revealed his true power.");

        String temp = character;
        character = monster;
        monster = temp;

        System.out.println("Plot twist: " + character + " became the hero, while " + monster + " became the monster's new master!");

        input.close();
    }
}
