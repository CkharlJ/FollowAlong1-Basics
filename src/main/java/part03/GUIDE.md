# Part 03 Guide — Swapping variables, and reading what the user types

**The video, written out step by step.**

This page teaches the same thing as the video from **35:40 to 47:00**. You can:

- **read this page instead of watching**, or
- **read it while you watch**, or
- **come back to it** when you forget how something works.

Either way, **you still type every line yourself.** Steps 1–4 go in `Swap.java`. Steps
5–11 go in `UserInput.java`. Do not copy and paste from this page. Each step has a time,
like **(video 37:43)**, if you want to see him do it.

---

# Topic 1 — Swapping two variables (`Swap.java`)

## Step 1 — Two cups (video 35:40)

He starts with two cups: one has **water**, one has **Kool-Aid**. The goal: switch them, so
the water cup has Kool-Aid and the Kool-Aid cup has water.

Open `part03/Swap.java`. Type `main` inside the class, like in every part:

```java
    public static void main(String[] args) {

    }
```

Inside `main`, make two `String` variables:

```java
        String x = "water";
        String y = "Kool-Aid";
```

Then print them, with a label in front of each:

```java
        System.out.println("x: " + x);
        System.out.println("y: " + y);
```

**Run it.** Output:

```
x: water
y: Kool-Aid
```

---

## Step 2 — The swap that doesn't work (video 36:31)

The obvious idea: put `y` into `x`, then `x` into `y`. Type these two lines **above** the
two print lines:

```java
        x = y;
        y = x;
```

**Before you run it:** what will print?

**Run it.** Output:

```
x: Kool-Aid
y: Kool-Aid
```

Kool-Aid everywhere. Why?

1. `x = y;` copies Kool-Aid into `x`. **The water is gone.** Nothing remembers it.
2. `y = x;` copies what is in `x` now — Kool-Aid — back into `y`.

He tries it the other way round too (`y = x` first). Then you get water everywhere. Same
problem, the other direction.

**Delete those two lines** before you go on.

---

## Step 3 — A third cup: `temp` (video 37:16)

The fix is the same as in real life: use an **empty third cup** to hold one drink while you
pour.

Make a third `String` called `temp`. You don't need to give it a value yet. That is a
**declaration** from part 02:

```java
        String temp;
```

Now, above the print lines, type the swap — **in this order**:

```java
        temp = x;
        x = y;
        y = temp;
```

1. `temp = x;` saves the water in `temp`.
2. `x = y;` copies Kool-Aid into `x`. The water is safe in `temp`.
3. `y = temp;` puts the water into `y`.

**Run it.** Output:

```
x: Kool-Aid
y: water
```

It worked.

---

## Step 4 — The big idea (video 38:30)

If a language has no built-in way to swap two variables, you do it by hand with a
**temporary** variable: `temp = x`, `x = y`, `y = temp`.

That is the end of the swap video.

<details>
<summary>Click to compare your <code>Swap.java</code></summary>

```java
package part03;

// (the comments at the top of your file)

public class Swap {
    public static void main(String[] args) {
        String x = "water";
        String y = "Kool-Aid";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
```

Output:

```
x: Kool-Aid
y: water
```

</details>

---

# Topic 2 — Reading what the user types (`UserInput.java`)

## Step 5 — Import the Scanner (video 39:25)

To read what someone types, Java has a tool called a **`Scanner`**. Java doesn't load it
automatically. You have to **import** it — tell Java to bring it in — before you can use
it.

Open `part03/UserInput.java`. On the **empty line under `package part03;`**, above the class,
type:

```java
import java.util.Scanner;
```

- `java.util` is the "utility" group of tools that comes with Java.
- `Scanner` is the one we want.
- The `package` line stays first. The `import` line goes after it, and **above** the
  class.

Then type `main` inside the class.

---

## Step 6 — Make a Scanner (video 40:10)

Inside `main`, type:

```java
        Scanner scanner = new Scanner(System.in);
```

Piece by piece:

| Piece | What it means |
|---|---|
| `Scanner` | the type, like `int` or `String`. Capital S |
| `scanner` | the name you are giving it. Lowercase s |
| `new Scanner(...)` | make a brand-new scanner |
| `System.in` | read from the keyboard. (`System.out` is the screen. `System.in` is the keyboard) |

He says this uses **objects**, which we learn in part 15. For now, he says, "repeat after
me": type it exactly.

If `Scanner` turns red, check your `import` line. You can also click on the red word and
press `⌥ Enter` (Mac) or `Alt Enter` (Windows) and choose **Import class**.

---

## Step 7 — Ask a name and read it (video 40:46)

First, print a question so the user knows what to type:

```java
        System.out.println("What is your name?");
```

Then read their answer and save it in a variable:

```java
        String name = scanner.nextLine();
```

`nextLine()` waits for the user to type a whole line and press **Enter**. Then it gives
back what they typed. Capital **L** in `nextLine`.

Now use it:

```java
        System.out.println("Hello " + name);
```

**Run it.** The program prints the question and **waits**. It is not frozen. **Click inside
the Run window** at the bottom, type your name, and press **Enter**:

```
What is your name?
bro
Hello bro
```

(`bro` is what you typed. In IntelliJ it shows in a different color.)

---

## Step 8 — Ask a number with `nextInt()` (video 42:15)

To read a whole number, use `nextInt()` and save it in an `int`. Add a second question:

```java
        System.out.println("How old are you?");
        int age = scanner.nextInt();
```

And print the answer:

```java
        System.out.println("You are " + age + " years old");
```

He moves the `"Hello " + name` line down so both answers print at the end. You can do the
same.

**Run it.** Type a name, then a number:

```
What is your name?
bro
How old are you?
18
Hello bro
You are 18 years old
```

---

## Step 9 — Break it on purpose (video 42:59)

Run it again. This time, when it asks your age, type **`pizza`**. The program crashes:

```
Exception in thread "main" java.util.InputMismatchException
```

An **exception** is an error that happens while the program is **running**. This one means
"the input doesn't match": `nextInt()` wanted a whole number, and got a word. He says we
will learn to handle this in a later lesson. For now, type the right kind of answer.

---

## Step 10 — The `nextInt` trap (video 43:34)

He adds a third question, after the age:

```java
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();
```

and one more print at the end:

```java
        System.out.println("You like " + food);
```

**Run it.** Type a name, press Enter. Type `18`, press Enter. Then watch: **it never lets
you type a food.** It skips straight to the end:

```
What is your name?
bro
How old are you?
18
What is your favorite food?
Hello bro
You are 18 years old
You like 
```

### Why it happens (video 44:38)

When you type `18` and press Enter, the scanner holds **two** things: `18`, and the Enter.
(The Enter is a **new line** character — the same `\n` from part 01.)

1. `nextInt()` takes the `18`. It **leaves the Enter behind** in the scanner.
2. `nextLine()` reads everything up to the next Enter. The leftover Enter is **right
   there**. So it reads an empty line and moves on, without waiting for you.

---

## Step 11 — The fix (video 46:00)

Right **after** the `nextInt()` line, add one more line:

```java
        scanner.nextLine();
```

This reads the leftover Enter and throws it away. We don't save it in a variable, because
we don't need it. Now the scanner is empty, and the food question will wait for you.

**Run it again.**

```
What is your name?
bro
How old are you?
18
What is your favorite food?
pizza
Hello bro
You are 18 years old
You like pizza
```

**Remember this rule:** after `nextInt()`, if you are going to call `nextLine()` next, put
an extra `scanner.nextLine();` in between.

He ends with: scanners can do much more, like read files, and *"that is how scanners work
in Java."*

---

## Your finished `UserInput.java`

Your file should look something like this now. Your questions can be different.
**Compare it to yours. Do not copy it.**

<details>
<summary>Click to compare</summary>

```java
package part03;

import java.util.Scanner;

// (the comments at the top of your file)

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);
    }
}
```

</details>

---

**Now go back to [README.md](README.md).** Make your Section A commit. Then do Section B:
put a comment above every line in **both** files, **in your own words**. Do not copy the
explanations from this guide.
