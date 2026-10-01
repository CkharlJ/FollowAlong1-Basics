# Part 01 Guide — Printing text to the screen

**The video, written out step by step.**

This page teaches the same thing as the video from **7:50 to 17:30**. You can:

- **read this page instead of watching**, or
- **read it while you watch**, or
- **come back to it** when you forget how something works.

Either way, **you still type every line into `Main.java` yourself.** Do not copy and paste
from this page. Each step has a time, like **(video 12:05)**, if you want to see him do it.

---

## Step 1 — What is a class? (video 7:56)

Open `part01/Main.java`. Under the comments, you see this:

```java
package part01;

public class Main {

}
```

- **`package part01;`** tells Java this file belongs to the `part01` folder. His file does
  not have this line. **Leave it alone.**
- **`public class Main`** makes a **class** named `Main`. A class is a group of related code.
  For now, every program you write lives inside a class. We learn much more about classes
  in part 15.
- **The curly braces `{` and `}`** show where the class starts and ends. Everything that
  belongs to the class goes **between** them.

**The file name and the class name must match.** The class is `Main`, so the file is
`Main.java`.

### What happens when you run a Java program (video 9:00)

1. You write **source code**. That is the `.java` file. People can read it.
2. Java **compiles** it. That means it turns your code into **bytecode**, a `.class` file.
   Computers can read it. People mostly can't.
3. The **JVM** (Java Virtual Machine) runs the bytecode on your computer.

IntelliJ does steps 2 and 3 for you every time you click the green ▶.

---

## Step 2 — The main method (video 9:41)

A Java program **starts running at a method called `main`.** No `main`, no program.

Click on the empty line **between** the class's `{` and `}`. Type this:

```java
    public static void main(String[] args) {

    }
```

Type it carefully. Check each piece:

| Piece | Watch out for |
|---|---|
| `public static void main` | All lowercase |
| `(String[] args)` | Capital **S** in `String`. Square brackets `[]`, then `args` |
| `{` and `}` | You type **both**. IntelliJ will not add the `}` for you |

He says to think of this line as a **magic spell** you must say to start the program
(video 10:47). For now, **memorize it.** You will learn what each word means later.

**Now look to the left of the `main` line.** A **green ▶** has appeared. That means Java
found your `main` method. Click it and choose **Run 'Main.main()'**.

The Run window opens at the bottom. It says:

```
Process finished with exit code 0
```

Nothing else prints, because `main` is empty. **Exit code 0** means the program ended with
no problems.

### Try this: break it on purpose (video 10:04)

1. Change `main` to `mian`.
2. Look at the left side: **the green ▶ disappears.** Java can't find a `main` method, so
   there is nothing to run.
3. Change it back to `main`. The ▶ comes back.

---

## Step 3 — Print one line (video 12:05)

Code inside `main` runs **from top to bottom**, one line at a time.

Click on the empty line **inside `main`'s** `{ }`. Type:

```java
        System.out.print("I love pizza");
```

What each part means:

| Part | What it is |
|---|---|
| `System` | Built into Java. **Capital S** |
| `.out` | The screen |
| `.print` | Show some text |
| `( )` | What to show goes inside |
| `"I love pizza"` | The text. Text always goes inside **double quotes** `" "` |
| `;` | Ends the line. **Every** line like this needs one |

You can print any words you want. **He prints "I love pizza." You can print your own
favorite food.**

**Run it** (green ▶ next to `main`). Output:

```
I love pizza
```

---

## Step 4 — Print a second line (video 12:31)

Under the first line, type a second one:

```java
        System.out.print("It's really good");
```

**Before you run it:** do you think it will print on one line or two?

**Run it.** Output:

```
I love pizzaIt's really good
```

**Both sentences are stuck together on one line.** Why? `print` shows the text, then
**stays on the same line.** So the second sentence starts right where the first one ended.

---

## Step 5 — `println`: print, then go to a new line (video 12:53)

Change **both** lines from `print` to `println`:

```java
        System.out.println("I love pizza");
        System.out.println("It's really good");
```

`println` is short for **print line**. It shows the text, **then moves to a new line**, like
pressing Enter.

The letters are **p-r-i-n-t-l-n**. The letter after `print` is a lowercase **L**, not a
capital I.

**Run it.** Output:

```
I love pizza
It's really good
```

| | What it does after printing |
|---|---|
| `print` | Stays on the same line |
| `println` | Moves to a new line |

---

## Step 6 — `\n`: a new line inside the text (video 13:25)

There is another way to move to a new line. Change both lines **back to `print`**. Then, at
the end of the **first** sentence, **inside the quotes**, add `\n`:

```java
        System.out.print("I love pizza\n");
        System.out.print("It's really good");
```

**Run it.** Output:

```
I love pizza
It's really good
```

It looks exactly the same as Step 5. **`\n` means "new line."** It does the same job as the
"ln" in `println`.

### What is an escape sequence?

`\n` is an **escape sequence**: a **backslash `\`** followed by one character. Together they
mean something special. The backslash is the one above the Enter key. It leans left: `\`.
(The one that leans right, `/`, is a different key.)

---

## Step 7 — `println` **and** `\n` together (video 14:30)

Change both lines back to `println`. **Keep** the `\n` on the first line:

```java
        System.out.println("I love pizza\n");
        System.out.println("It's really good");
```

**Before you run it:** what will be different?

**Run it.** Output:

```
I love pizza

It's really good
```

**There is an empty line in the middle.** Why? The first line moves to a new line
**twice**: once for `\n`, and once more for `println`.

---

## Step 8 — `\t`: a tab (video 15:02)

`\t` adds a **tab**, which is a gap, like pressing the Tab key.

Put `\t` at the **start** of the first sentence, inside the quotes:

```java
        System.out.println("\tI love pizza\n");
```

**Run it.** The first line now starts with a gap:

```
        I love pizza

It's really good
```

The gap might look wider or narrower on your screen. That is fine.

---

## Step 9 — `\"`: printing a quote mark (video 15:20)

What if you want to print quote marks **around** "I love pizza"? Try the obvious way first:

```java
        System.out.println(""I love pizza"");
```

It **does not work.** Java sees the second `"` and thinks the text is over. You get red
underlines, and an error like this:

```
error: ')' or ',' expected
```

**The fix:** put a backslash before each quote mark you want to **print**. `\"` means
"print a quote mark here. Don't end the text."

Change the first line to:

```java
        System.out.println("\t\"I love pizza\"\n");
```

That line is hard to read, so here it is piece by piece:

| Piece | Prints |
|---|---|
| `"` | *(the text starts)* |
| `\t` | a tab |
| `\"` | `"` |
| `I love pizza` | `I love pizza` |
| `\"` | `"` |
| `\n` | a new line |
| `"` | *(the text ends)* |

**Run it.** Output:

```
        "I love pizza"

It's really good
```

---

## Step 10 — `\\`: printing a backslash (video 15:58)

You now know that `\` starts an escape sequence. So how do you print a backslash **itself**?

Use **two**: `\\` prints **one** `\`.

Add one to the end of the second sentence:

```java
        System.out.println("It's really good \\");
```

**Run it.** Output:

```
        "I love pizza"

It's really good \
```

If you use only **one** backslash, you get this error:

```
error: illegal escape character
```

That error means: "You typed `\`, but the character after it is not one I know."

### All four escape sequences

| Type this | To get |
|---|---|
| `\n` | a new line |
| `\t` | a tab |
| `\"` | a quote mark `"` |
| `\\` | a backslash `\` |

---

## Step 11 — Comments (video 16:32)

A **comment** is a note in your code. **Java ignores it completely.** Comments are for
people: you later, or someone else reading your code.

**One-line comment:** two forward slashes `//`. Everything after them, to the end of that
line, is ignored.

Add this line anywhere inside `main`:

```java
        // This is a comment
```

**Multi-line comment (video 16:59):** starts with `/*` and ends with `*/`. Everything in
between is ignored, even across many lines.

```java
        /*
          This
          is
          a
          comment
        */
```

**Run it.** **The output does not change at all.** That's how you know Java ignored them.

If your output **did** change, some of your text is outside the comment. Check that you
have both `/*` and `*/`.

---

## Your finished program

Your `Main.java` should look something like this now. Your food and your comments can be
different. **Compare it to yours. Do not copy it.**

<details>
<summary>Click to compare</summary>

```java
package part01;

// (the comments at the top of your file)

public class Main {
    public static void main(String[] args) {
        // This is a comment
        /*
          This
          is
          a
          comment
        */
        System.out.println("\t\"I love pizza\"\n");
        System.out.println("It's really good \\");
    }
}
```

Output:

```
        "I love pizza"

It's really good \
```

</details>

---

## What he does next (you can skip it)

From **17:33** to the end of this section, he shows **"tips and tricks"** for Eclipse:
changing colors, a typing shortcut, and find-and-replace. They are for Eclipse, not
IntelliJ. And the typing shortcut is one you turned off in Part 00. **Skip it.**

**Now go back to [README.md](README.md).** Make your Section A commit. Then do Section B:
put a comment above every line, **in your own words**. Do not copy the explanations from
this guide.
