# Part 04 Guide — Math expressions, and pop-up windows

**The video, written out step by step.**

This page teaches the same thing as the video from **48:08 to 58:10**. You can:

- **read this page instead of watching**, or
- **read it while you watch**, or
- **come back to it** when you forget how something works.

Either way, **you still type every line yourself.** Steps 1–6 go in `Expressions.java`.
Steps 7–11 go in `GUI.java`. Do not copy and paste from this page. Each step has a time,
like **(video 51:38)**, if you want to see him do it.

---

# Topic 1 — Expressions (`Expressions.java`)

## Step 1 — Words you need (video 48:08)

An **expression** is a calculation. It is made of two kinds of things:

- **operands**: the values — numbers and variables, like `10` or `friends`
- **operators**: the symbols that do the math

| Operator | What it does | Example | Answer |
|---|---|---|---|
| `+` | add | `10 + 1` | `11` |
| `-` | subtract | `10 - 1` | `9` |
| `*` | multiply | `10 * 2` | `20` |
| `/` | divide | `10 / 2` | `5` |
| `%` | **remainder** after dividing | `10 % 3` | `1` |

---

## Step 2 — Change a variable with math (video 48:35)

Open `part04/Expressions.java`. Type `main` inside the class. Inside `main`, make an `int`
called `friends`:

```java
        int friends = 10;
```

You make a new friend. Add one. The variable goes on **both** sides of the `=`:

```java
        friends = friends + 1;
```

Read it from right to left: "take `friends` (10), add 1, and put the answer (11) back into
`friends`." Then print it:

```java
        System.out.println(friends);
```

**Run it.** Output:

```
11
```

---

## Step 3 — Try every operator (video 49:10)

He changes **only the middle line**, and runs it each time. `friends` always starts at
`10`. Do the same: change the line, run, check.

| Change the middle line to | Output | Why |
|---|---|---|
| `friends = friends - 1;` | `9` | you lost a friend |
| `friends = friends * 2;` | `20` | doubled |
| `friends = friends / 2;` | `5` | split in half |
| `friends = friends % 3;` | `1` | 10 in groups of 3 → 1 left over |
| `friends = friends % 2;` | `0` | 10 in groups of 2 → nobody left over |

### What `%` means (video 49:40)

`%` is called **modulus**. It gives you the **remainder** of a division. He compares it to
group projects: if everyone has to get into groups of three, there's always somebody left
over. With 10 people, that's **1** person.

---

## Step 4 — The shortcut: `++` and `--` (video 50:24)

Adding one is so common that Java has a shortcut. Instead of
`friends = friends + 1;`, you can write:

```java
        friends++;
```

**Run it.** Output: `11`.

To **subtract** one:

```java
        friends--;
```

Output: `9`.

`++` is called the **increment** operator. `--` is the **decrement** operator.

---

## Step 5 — Integer division (video 50:58)

He comes back for one more thing. Change the middle line to:

```java
        friends = friends / 3;
```

**Before you run it:** 10 divided by 3 is 3.33… right?

**Run it.** Output:

```
3
```

**Wrong — it's 3.** When you divide a whole number by a whole number, Java **cuts off**
the decimal part. It does not round. It just drops everything after the decimal point.
This is called **integer division**, and it surprises everyone who comes from Python.

---

## Step 6 — Casting to keep the decimal (video 51:38)

To keep the decimal part, you **cast** the value: you put the new type, in parentheses, in
front of it. `(double)` means "treat this as a decimal number."

Change the middle line to:

```java
        friends = (double) friends / 3;
```

It turns **red**:

```
error: incompatible types: possible lossy conversion from double to int
```

The answer is now a decimal, but `friends` is still an `int` box, and an `int` can't hold a
decimal. So change the **first** line too:

```java
        double friends = 10;
```

**Run it.** Output:

```
3.3333333333333335
```

(The `5` on the end is normal. A computer can't store 3.333… forever, so the last digit is
a tiny bit off.)

He ends with *"that's really all you need to know to get started with expressions."*

<details>
<summary>Click to compare your <code>Expressions.java</code></summary>

```java
package part04;

// (the comments at the top of your file)

public class Expressions {
    public static void main(String[] args) {
        double friends = 10;

        friends = (double) friends / 3;

        System.out.println(friends);
    }
}
```

Output:

```
3.3333333333333335
```

Your middle line might be different if you stopped at another step. That's fine, as long as
you tried every operator in steps 2–6.

</details>

---

# Topic 2 — Pop-up windows (`GUI.java`)

## Step 7 — What is a GUI? (video 53:11)

**GUI** (say "gooey") stands for **graphical user interface**: a program with windows and
buttons that you can see and click, instead of only text in the Run window.

In this part we make small pop-up boxes using a tool called **`JOptionPane`**.

Open `part04/GUI.java`. On the **empty line under `package part04;`**, above the class, type
the import:

```java
import javax.swing.JOptionPane;
```

Note the **x** in `javax`. `javax.swing` is Java's group of window tools.

Then type `main` inside the class.

---

## Step 8 — Ask a question in a box (video 54:12)

Inside `main`, type:

```java
        String name = JOptionPane.showInputDialog("Enter your name");
```

`showInputDialog` opens a box with a message, a place to type, and an **OK** button. When
the user clicks OK, it gives back what they typed — **as a `String`** — and we save it in
`name`. It's like `scanner.nextLine()` from part 03, but in a window.

**Run it.** A small box appears that says *Enter your name*.

> **Don't see it?** On a Mac especially, the box can open **behind** IntelliJ. Look for a
> new **Java** icon (a coffee cup) in your **Dock** (Mac) or **taskbar** (Windows), and
> click it.

Type your name and click OK. Nothing else happens yet. That's next.

---

## Step 9 — Show a message in a box (video 54:42)

Under that line, type:

```java
        JOptionPane.showMessageDialog(null, "Hello " + name);
```

`showMessageDialog` opens a box that just **shows** a message, with an OK button.

- The first thing in the parentheses, `null`, means "no parent window." Type `null` for
  now. We don't need it.
- After the comma comes the message: `"Hello " + name`.

**Run it.** Type your name, click OK. A second box says:

```
Hello bro
```

---

## Step 10 — Ask for a number: `parseInt` (video 55:11)

Now ask for an age. You might try:

```java
        int age = JOptionPane.showInputDialog("Enter your age");
```

It turns **red**:

```
error: incompatible types: String cannot be converted to int
```

`showInputDialog` **always** gives back a `String`, even if you typed `18`. And you can't
put a `String` in an `int` box.

**The fix (video 55:51):** `Integer.parseInt(...)` turns text like `"18"` into the number
`18`. Wrap the whole `showInputDialog` inside it:

```java
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
```

Count the parentheses: **two** open, **two** close, at the end. Then show the answer:

```java
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");
```

**Run it.** Name, then `18`. The last box says:

```
You are 18 years old
```

If you type a word like `pizza` for your age, the program crashes with
`NumberFormatException: For input string: "pizza"`. If you click **Cancel**, it crashes
with `NumberFormatException: Cannot parse null string`. Just run it again.

---

## Step 11 — Ask for a decimal: `parseDouble` (video 56:57)

For a decimal number like height, use a `double`, and `Double.parseDouble` instead.
**Capital D** in `Double`:

```java
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
```

**Run it.** Name, age, then `240` for height. The last box says:

```
You are 240.0 cm tall
```

It shows `240.0` because `height` is a `double`.

**The big rule:** `showInputDialog` always gives back text. To use it as a number, convert
it: `Integer.parseInt` for whole numbers, `Double.parseDouble` for decimals.

He ends with: this was just for fun, and *"we will be learning more about GUIs later."*

---

## Your finished `GUI.java`

Your file should look something like this now. Your messages can be different.
**Compare it to yours. Do not copy it.**

<details>
<summary>Click to compare</summary>

```java
package part04;

import javax.swing.JOptionPane;

// (the comments at the top of your file)

public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
    }
}
```

</details>

---

**Now go back to [README.md](README.md).** Make your Section A commit. Then do Section B:
put a comment above every line in **both** files, **in your own words**. Do not copy the
explanations from this guide.
