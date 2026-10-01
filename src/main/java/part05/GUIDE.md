# Part 05 Guide — The Math class and random numbers

**The video, written out step by step.**

This page teaches the same thing as the video from **58:38 to 68:28**. You can:

- **read this page instead of watching**, or
- **read it while you watch**, or
- **come back to it** when you forget how something works.

Either way, **you still type every line yourself.** Do not copy and paste from this page.
Each step has a time, like **(video 59:20)**, if you want to see him do it.

This part uses **three** files:

| File | Steps |
|---|---|
| `MathMethods.java` | Steps 1–6: the Math class |
| `Hypotenuse.java` | Steps 7–10: a project that uses the Math class |
| `RandomNumbers.java` | Steps 11–16: random numbers |

---

## Part A — The Math class (`MathMethods.java`)

Java has a built-in class called **`Math`**. It is full of ready-made math tools called
**methods**. You use one by typing `Math`, a dot, the method's name, and then the numbers
it should work on, inside `( )`.

**`Math` always has a capital M.** Lowercase `math` does not work.

### Step 1 — Two numbers to work with (video 59:06)

Open `MathMethods.java`. Type the `main` method inside the class, like in Part 01. Then,
inside `main`, make two `double` variables:

```java
        double x = 3.14;
        double y = -10;
```

A `double` is a number that can have a decimal point.

### Step 2 — `Math.max`: the bigger of two numbers (video 59:20)

```java
        double z = Math.max(x, y);
        System.out.println(z);
```

`Math.max(x, y)` looks at both numbers and gives back the **larger** one. We store that in
a new variable, `z`, and print it.

**Run it.** Output:

```
3.14
```

### Step 3 — `Math.min`: the smaller of two numbers (video 60:20)

In the video, he changes the word `max` to `min` on the same line. **Don't do that.**
Keep your `max` line, so you can comment it later. Add **new** lines under it instead:

```java
        z = Math.min(x, y);
        System.out.println(z);
```

**Notice: no `double` at the start this time.** `z` already exists. You are just putting a
new value in it. If you type `double z` a second time, you get this error:

```
error: variable z is already defined in method main(String[])
```

**Run it.** Output (the new line is the last one):

```
3.14
-10.0
```

`y` is a `double`, so it prints with `.0` even though you typed `-10`.

### Step 4 — `Math.abs`: absolute value (video 60:30)

```java
        z = Math.abs(y);
        System.out.println(z);
```

**Absolute value** means the number without its minus sign. The absolute value of `-10`
is `10`.

New output line:

```
10.0
```

### Step 5 — `Math.sqrt`: square root (video 60:51)

```java
        z = Math.sqrt(y);
        System.out.println(z);
```

He tries the square root of `-10`. **Run it.** New output line:

```
NaN
```

**`NaN` means "Not a Number."** There is no regular number that is the square root of a
negative number, so Java gives you `NaN` instead of crashing.

Then he changes `y` to a positive number. Add these lines:

```java
        y = 3.16;
        z = Math.sqrt(y);
        System.out.println(z);
```

New output line:

```
1.7776388834631178
```

### Step 6 — `round`, `ceil`, `floor`: three ways to round (video 61:11)

```java
        z = Math.round(x);
        System.out.println(z);
        z = Math.ceil(x);
        System.out.println(z);
        z = Math.floor(x);
        System.out.println(z);
```

| Method | What it does | `x` is 3.14, so it gives |
|---|---|---|
| `Math.round` | rounds to the **nearest** whole number | `3.0` |
| `Math.ceil` | always rounds **up** ("ceiling") | `4.0` |
| `Math.floor` | always rounds **down** ("floor") | `3.0` |

**Run it.** Your whole output now:

```
3.14
-10.0
10.0
NaN
1.7776388834631178
3.0
4.0
3.0
```

They all end in `.0` because `z` is a `double`.

---

## Part B — The hypotenuse project (`Hypotenuse.java`)

The **hypotenuse** is the long, slanted side of a right triangle. If the two short sides
are `x` and `y`, the hypotenuse is:

> the square root of ( x × x + y × y )

This program asks the user for `x` and `y`, then prints the hypotenuse.

### Step 7 — Variables and a Scanner (video 61:29)

Open `Hypotenuse.java`. Type the `main` method. Inside it:

```java
        double x;
        double y;
        double z;
        Scanner scanner = new Scanner(System.in);
```

You can make a variable without giving it a value yet. It gets one later.

`Scanner` is the tool from Part 03 that reads what the user types.

### Step 8 — The import line

`Scanner` turns **red**. Java does not know where to find it yet.

**Fix it in IntelliJ:** click on the red word `Scanner`, then press `⌥ Enter` (Mac) or
`Alt Enter` (Windows), and choose **Import class**. IntelliJ adds this line near the top:

```java
import java.util.Scanner;
```

It goes **after** `package part05;` and **before** `public class Hypotenuse`. You can also
type it there yourself.

Without it, you get this error:

```
error: cannot find symbol
  symbol:   class Scanner
```

### Step 9 — Ask, read, calculate (video 61:57)

Under the Scanner line:

```java
        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();
        z = Math.sqrt((x * x) + (y * y));
        System.out.println("The hypotenuse is: " + z);
        scanner.close();
```

- `scanner.nextDouble()` waits for the user to type a number, then gives it back.
- `x * x` means x times x. The `*` is how you multiply in Java.
- `Math.sqrt( ... )` takes the square root of everything inside the parentheses.
- `scanner.close()` tells Java you are done reading input. He says it is good practice.

### Step 10 — Run it (video 63:30)

**Run it.** The program prints `Enter side x:` and waits.

**Click inside the Run window**, type `4`, and press Enter. Then type `5` and press Enter.

```
Enter side x: 
4
Enter side y: 
5
The hypotenuse is: 6.4031242374328485
```

*(The `4` and `5` are what you typed.)*

---

## Part C — Random numbers (`RandomNumbers.java`)

### Step 11 — Import Random (video 64:54)

Java has a class called **`Random`** that makes random numbers. Like `Scanner`, it needs an
import. Open `RandomNumbers.java` and add this line between `package part05;` and the class:

```java
import java.util.Random;
```

Or type the next step first, then use `⌥ Enter` / `Alt Enter` on the red `Random`.

**This is why your class is called `RandomNumbers`, not `Random`.** Java already has a
`Random`. Two classes with the same name in the same file confuse Java.

### Step 12 — Make a Random object (video 65:27)

Type the `main` method. Inside it:

```java
        Random random = new Random();
```

This makes a random-number maker and names it `random`. It looks a lot like the Scanner
line: `Scanner scanner = new Scanner(System.in);`. Same pattern: type, name, `= new`, type,
`( )`.

He mentions that computers can't make **truly** random numbers. These are
**pseudo-random**: made by a formula, but close enough for games.

### Step 13 — A random whole number (video 66:02)

```java
        int x = random.nextInt();
        System.out.println(x);
```

**Run it a few times.** You get a different number each time, and it can be **huge**,
anywhere from about −2 billion to about +2 billion. For example:

```
-1450279263
```

### Step 14 — Rolling a die: `nextInt(6) + 1` (video 66:47)

To roll a six-sided die, put a limit inside the parentheses. **Change your `nextInt()` line
to this:**

```java
        int x = random.nextInt(6);
```

**Careful:** `nextInt(6)` gives a number from **0 to 5**, not 1 to 6. Computers start
counting at 0. Six possible numbers, starting at 0.

To get **1 to 6**, add 1:

```java
        int x = random.nextInt(6) + 1;
```

**Run it several times.** You always get a number from 1 to 6, like:

```
4
```

### Step 15 — A random decimal: `nextDouble` (video 67:40)

He turns the earlier print into a comment so only the new value shows. You can leave
yours. Add:

```java
        double y = random.nextDouble();
        System.out.println(y);
```

`nextDouble()` gives a random decimal number **from 0 up to (but not including) 1**, like:

```
0.49618642501530197
```

### Step 16 — A random true/false: `nextBoolean` (video 68:05)

```java
        boolean z = random.nextBoolean();
        System.out.println(z);
```

`nextBoolean()` gives `true` or `false`, randomly. Like flipping a coin.

**Run it a few times.** Your output changes every time. For example:

```
6
0.49618642501530197
false
```

---

## Your finished programs

Your files should look something like this now. **Compare them to yours. Do not copy
them.**

<details>
<summary>Click to compare <code>MathMethods.java</code></summary>

```java
package part05;

// (the comments at the top of your file)

public class MathMethods {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;
        double z = Math.max(x, y);
        System.out.println(z);
        z = Math.min(x, y);
        System.out.println(z);
        z = Math.abs(y);
        System.out.println(z);
        z = Math.sqrt(y);
        System.out.println(z);
        y = 3.16;
        z = Math.sqrt(y);
        System.out.println(z);
        z = Math.round(x);
        System.out.println(z);
        z = Math.ceil(x);
        System.out.println(z);
        z = Math.floor(x);
        System.out.println(z);
    }
}
```

</details>

<details>
<summary>Click to compare <code>Hypotenuse.java</code></summary>

```java
package part05;

import java.util.Scanner;

// (the comments at the top of your file)

public class Hypotenuse {
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();
        z = Math.sqrt((x * x) + (y * y));
        System.out.println("The hypotenuse is: " + z);
        scanner.close();
    }
}
```

</details>

<details>
<summary>Click to compare <code>RandomNumbers.java</code></summary>

```java
package part05;

import java.util.Random;

// (the comments at the top of your file)

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(6) + 1;
        System.out.println(x);
        double y = random.nextDouble();
        System.out.println(y);
        boolean z = random.nextBoolean();
        System.out.println(z);
    }
}
```

</details>

---

**Now go back to [README.md](README.md).** Make your Section A commit. Then do Section B:
put a comment above every line, **in your own words**. Do not copy the explanations from
this guide.
