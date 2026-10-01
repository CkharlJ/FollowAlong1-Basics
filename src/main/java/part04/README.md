# Part 04 — Math expressions, and pop-up windows

**We start this together in class · due before the next lecture · No AI**

In this part your programs do **math**, and they get **windows**. You learn how Java adds,
subtracts, multiplies and divides — including one surprise about dividing. Then you make
small pop-up boxes that ask questions and show answers.

**What you learn:**

- **expression**: a calculation, like `friends + 1`
- **operators**: `+` `-` `*` `/` and `%` (the **remainder** after dividing)
- **`++` and `--`**: add one, subtract one
- **integer division**: why `10 / 3` is `3` in Java, not 3.33
- **casting**: changing a value to a different type, like `(double)`
- **`JOptionPane`**: pop-up boxes that ask a question or show a message

> **Before you start:** open any `.java` file. Click inside it. Type `Sys` and wait two
> seconds. If a list pops up, **stop.** Autocomplete is back on. Do
> [Part 00, step 4](../part00/README.md#step-4--turn-off-the-autocomplete-and-the-ai) again
> before you type anything else.

---

## How this part works

**In class, together:** we start Section A (follow along), and we do the **in-class
exercise** together.

**On your own:** you finish whatever we did not get to, then do Sections B, C and D.

## How this part is graded

This part has **four graded sections**. Each one is worth **25 points**.

| Section | File | Points | Your commit message |
|---|---|---|---|
| **A · Follow along** | `Expressions.java` and `GUI.java` | 25 | `part04 follow-along: expressions and GUI dialog boxes` |
| **B · Comments** | `Expressions.java` and `GUI.java` | 25 | `part04 comments: explained every line of the follow-along code` |
| **C · Stretch** | `Stretch.java` | 25 | `part04 stretch: prediction, bill, time, and averages` |
| **D · Challenge** | `Challenge.java` | 25 | `part04 challenge: tip calculator with dialog boxes` |

When you finish a section, you **commit** it with the message in the table. That commit is
how I know you finished it. **You do not send me anything on Canvas.** A program I run reads
your commit messages, so **type each one exactly as shown.**

> **No commit, no credit.** If a section has no commit, it gets **0**, even if the code is
> on your laptop. Everything must be **pushed before the next lecture starts.**

The warm-up and the in-class exercise are practice. They are not graded, but do them. They
make the rest easier.

---

## Warm-up — 5 minutes (practice, not graded)

1. Open `part03/Stretch.java`. Find your **Stretch B1**: ask a name, say hi. Look at it for
   **30 seconds**. Also look at the `import` line at the top.
2. Close it.
3. Open `part04/Warmup.java`. **Without looking back**, make it do the same thing:

```
What is your name?
Jordan
Hi, Jordan!
```

4. You need the `import` line (under `package part04;`), `main`, and the `Scanner`. Type
   them all. Run it with the **green ▶** next to `main`, and type your name in the Run
   window.
5. If it does not work, try to fix it yourself first. Look back only if you are really
   stuck.

---

## Section A — Follow along (25 points)

*We start this together in class. Finish it on your own if we run out of time.*

This part's video has **two topics**, and each one gets **its own file**:

| Topic | Video | Your file |
|---|---|---|
| Expressions (math) | about 48:08 to 52:25 | `Expressions.java` |
| Pop-up windows (GUI) | about 53:11 to 58:10 | `GUI.java` |

**▶ [Open the video at 48:08](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2888s)**

**📖 Rather read than watch? Open [GUIDE.md](GUIDE.md)** in this folder. It is the same
lesson, written out step by step, with the output you should see after each step. You can
use the video, the guide, or both. Either way, you type every line yourself.

That is about 10 minutes of video.

> The times might be off by a minute. Listen for what he says:
>
> - **Expressions start** when he says *"an expression is a combination of operands and
>   operators."* **They end** at *"that's really all you need to know to get started with
>   expressions."*
> - **GUI starts** when he says *"I'm going to teach you all how to create a very basic GUI
>   program."* **It ends** at *"in conclusion, ladies and gentlemen, what we have made is a
>   very simple graphical user interface."*

### His screen looks different from yours

**His class is called `Main`. Yours are called `Expressions` and `GUI`.** Leave the
`package part04;` line and the `public class ...` line alone in both files. Type `main`
yourself inside each class, then type everything else.

**When he moves from expressions to the GUI, you switch files.** Open `GUI.java` for the
pop-up windows.

**He keeps changing one line.** In the expressions part, he changes `friends + 1` to
`friends - 1`, then `* 2`, then `/ 2`, and so on, **always starting from 10**. Do the same:
change the line, run it, check the answer. (If you **add** lines instead, each one starts
from the answer before it, and your numbers won't match his.)

**The `import` line goes above the class.** For the GUI he types
`import javax.swing.JOptionPane;`. Type it on the **empty line under `package part04;`**.
Note the **x** in `javax`.

**The pop-up box might hide behind IntelliJ.** On a Mac especially, the box can open
**behind** your IntelliJ window. If you run `GUI.java` and nothing seems to happen, look
for a new **Java** icon (a coffee cup) in your **Dock** (Mac) or **taskbar** (Windows), and
click it. The program is waiting for you to answer the box.

**Clicking Cancel crashes the age and height questions.** If you click **Cancel** instead
of typing, the program stops with an error (`NumberFormatException: Cannot parse null
string`). That's expected — just run it again and type an answer.

**To stop a program that is stuck,** click the red **■** square in the Run window.

### Check your output as you go

**Expressions — Check 1 (about 49:00): `friends = friends + 1`.** Starting from 10:

```
11
```

**Check 2: change the one line, run it each time.** Every one starts from `friends = 10`:

| Change the line to | Output |
|---|---|
| `friends = friends - 1;` | `9` |
| `friends = friends * 2;` | `20` |
| `friends = friends / 2;` | `5` |
| `friends = friends % 3;` | `1` |
| `friends = friends % 2;` | `0` |
| `friends++;` | `11` |
| `friends--;` | `9` |

**`%`** is the **remainder**. 10 friends in groups of 3 makes 3 groups, with **1** friend
left over. In groups of 2, nobody is left over: **0**.

**Check 3 (about 51:00): integer division.** `friends = friends / 3;` with `friends` as an
`int`:

```
3
```

Not 3.33! When you divide two whole numbers, Java **cuts off** the decimal part. It doesn't
round. It just drops it.

**Check 4 (about 51:38): casting.** He changes `friends` to a `double`, and puts
`(double)` in front: `friends = (double) friends / 3;`

```
3.3333333333333335
```

(The `5` at the very end is normal. Computers can't store 3.333... exactly.)

**GUI — Check 5 (about 54:42): name.** A box asks *Enter your name*. Type it and click
**OK**. A second box says:

```
Hello bro
```

**GUI — Check 6 (about 56:30): age.** Type `18`. The box says:

```
You are 18 years old
```

**GUI — Check 7 (about 57:30): height.** Type `240`. The box says:

```
You are 240.0 cm tall
```

It shows `240.0` because height is a `double`.

### Stuck? Check these first

| What you see | What is usually wrong |
|---|---|
| `possible lossy conversion from double to int` | You cast to `(double)` but `friends` is still an `int`. Change the variable to `double` too |
| `illegal start of expression` | A typo in an operator, like `friends+;` instead of `friends++;` |
| `cannot find symbol` pointing at `JOptionPane` | The `import javax.swing.JOptionPane;` line is missing or misspelled. Check the **x** in `javax` |
| `String cannot be converted to int` | `showInputDialog` always gives back text. Wrap it in `Integer.parseInt(...)` |
| `no suitable method found for showMessageDialog(String)` | `showMessageDialog` needs `null, ` first: `showMessageDialog(null, "Hello")` |
| `class expected` | You wrote `double.parseDouble`. It is **`Double`**, with a capital D |
| `NumberFormatException: For input string: "pizza"` | You typed a word when it wanted a number |
| `NumberFormatException: For input string: "18.5"` | `Integer.parseInt` only takes whole numbers. Use `Double.parseDouble` for decimals |
| You ran `GUI.java` and nothing happens | The box is **behind** IntelliJ. Check the Dock or taskbar |

### ✅ Commit Section A

When `Expressions.java` matches Check 4 and `GUI.java` shows all three message boxes, type
this in the terminal:

```bash
git add -A
git commit -m "part04 follow-along: expressions and GUI dialog boxes"
```

---

## In-class exercise — pizza party math (together, not graded)

We do this one together in class, in `InClass.java`. Everyone types their own copy.

### Step 1 — How much pizza?

**7 friends** each eat **3 slices**. A pizza has **8 slices**. Inside `main`, under the
`STEP 1` comment, make an `int` for each of those numbers. Then work out:

- how many slices you need,
- how many **whole** pizzas that is (use `/`),
- how many slices are **left over** (use `%`),
- the **exact** number of pizzas, with a decimal (use `(double)`).

Then one more friend shows up. Use `++` to add one to `friends` and print it.

```
Slices needed: 21
Whole pizzas: 2
Slices left over: 5
Exact pizzas: 2.625
A friend shows up. Friends: 8
```

Things to figure out together:

- Why does `21 / 8` give `2`, not `2.625`? (An `int` divided by an `int` throws away the
  decimal.)
- `%` gives what is left over: 2 whole pizzas use 16 slices, and 5 are left.
- Where does `(double)` go? Try `(double) (totalSlices / slicesPerPizza)` instead. You get
  `2.0`. Why?
- So how many pizzas should you order? (3.) In part 06 you learn how to make Java decide that.

### Step 2 — Fix the bugs

Under `STEP 2` there are three broken lines, inside a `/* ... */` comment so they don't
stop your program from running. One at a time:

1. Move **one** broken line up, above the `/*` line. Now Java can see it.
2. Read the **red error**, or run it and read the output. What is Java telling you?
3. Fix the line. Run the program.
4. Do the next line.

| Broken line | What Java gives you |
|---|---|
| `int share = 10 / 4.0;` | `incompatible types: possible lossy conversion from double to int` |
| `System.out.println("Total: " + 5 + 3);` | **No error.** It runs and prints `Total: 53`. Java glues `5` onto the text, then glues `3`. Put `(5 + 3)` in parentheses so it adds first |
| `System.out.println(totalSlices / (friends - friends));` | No red line. But when it **runs**, it crashes: `Exception in thread "main" java.lang.ArithmeticException: / by zero` |

When all three are fixed, your program prints two more lines: `Total: 8` and `2`.

### ✅ Commit the in-class exercise

```bash
git add -A
git commit -m "part04 in-class: pizza party math"
```

---

## Section B — Comment every line (25 points)

*On your own.*

Now explain your own code. In **both** `Expressions.java` and `GUI.java`, put a `//`
comment **above every line of code**, saying **in your own words** what that line does.

**Which lines need a comment?**

- **Yes:** every line that does something. That includes the `import` line,
  `public class ...`, `public static void main(...)`, every math line, every pop-up line,
  and every `System.out...` line.
- **No:** lines that are only `}`, and empty lines.

**What makes a good comment?** Say what the line **does** and **why the answer comes out
the way it does.** Do not just repeat the code in English.

| ❌ Not enough | ✅ Good |
|---|---|
| `// friends / 3` | `// divides 10 by 3, but both are whole numbers so Java drops the .33 and keeps 3` |
| `// (double)` | `// turns friends into a decimal number first, so the division keeps the decimal part` |
| `// %` | `// gives the remainder: 10 split into groups of 3 leaves 1 over` |
| `// import` | `// brings in JOptionPane so I can make pop-up boxes` |
| `// parseInt` | `// the box gives back text, so parseInt turns that text into a whole number for age` |

Here is what a commented line looks like in your file:

```java
        // ++ adds one to friends, the short way of writing friends = friends + 1
        friends++;
```

**Rules:**

1. **Your own words.** Do not copy sentences from the guide or the video. I want to know
   what **you** think the line does.
2. **Not sure what a line does?** Write your best guess, and add `(not sure)` at the end.
   An honest guess gets credit. A skipped line does not.
3. **Run both files again when you're done.** Comments must not change the output.

### ✅ Commit Section B

```bash
git add -A
git commit -m "part04 comments: explained every line of the follow-along code"
```

---

## Section C — Stretch (25 points)

*On your own.*

Do these in `Stretch.java`. There is no `main` in that file yet. **Type it yourself.**
This one prints to the Run window, not to pop-up boxes.

### Stretch A — guess first

1. Type this code inside `main`. **Do not run it yet.**

```java
int n = 10;
System.out.println(n / 4);
System.out.println(n % 4);
System.out.println(n / 4.0);
n++;
System.out.println(n);
n--;
n--;
System.out.println(n);
System.out.println((double) 7 / 2);
System.out.println(7 / 2 * 2);
```

2. **Above that code**, write what you think each line will print, inside a comment:

```java
/* MY GUESS:
   ...
*/
```

3. Now run it.
4. Were you wrong about any line? **Keep your wrong guess.** Under it, add a comment that
   says why.

<details>
<summary>Click to see the answer. Only after you have run it!</summary>

```
2
2
2.5
11
9
3.5
6
```

- `10 / 4` is `2`: two whole numbers, so the `.5` is dropped.
- `10 % 4` is `2`: 4 goes into 10 twice, with 2 left over.
- `10 / 4.0` is `2.5`: `4.0` is a decimal, so Java keeps the decimal part.
- `(double) 7 / 2` is `3.5`: the cast turns 7 into `7.0` before dividing.
- `7 / 2 * 2` is `6`, not 7: `7 / 2` is `3` first, then `3 * 2` is `6`.

</details>

### Stretch B — use the math

Put this code under your Stretch A code, in the same `main`.

**B1.** Four friends split a $50 bill. Make an `int` for the people, a `double` for the
bill, divide, and print the result. Keep it short — it is **the next part's warm-up**:

```
Each person pays $12.5
```

**B2.** Turn **500 seconds** into minutes and seconds. Use `/` for the minutes and `%` for
the seconds left over:

```
500 seconds is 8 minutes and 20 seconds
```

**B3.** Three test scores: `90`, `85` and `78`. Add them up. Print the average **twice**:
once with plain `int` division, and once with a `(double)` cast. Above each one, write a
comment that says why they are different.

```
int average: 84
double average: 84.33333333333333
```

### ✅ Commit Section C

```bash
git add -A
git commit -m "part04 stretch: prediction, bill, time, and averages"
```

---

## Section D — Challenge (25 points)

*On your own.*

Do this in `Challenge.java`. Type the `import`, and `main`, yourself.

**Make a tip calculator with pop-up boxes.** It asks for the cost of a meal, the tip
percent, and how many people, then shows what each person pays. It must follow **all** of
these rules:

1. Above the line `public class Challenge`, a **multi-line comment** (`/*` ... `*/`) with
   your name and what the program does.
2. Uses **`showInputDialog`** to ask **three** questions: the meal cost, the tip percent,
   and the number of people.
3. Uses **`Double.parseDouble`** for the meal cost, and **`Integer.parseInt`** for the tip
   percent and the number of people.
4. Works out the **tip**, the **total**, and the **amount each person pays**, using `*`, `/`
   and `+`.
5. Uses **at least one cast**, `(int)`, to show a whole-dollar amount each.
6. Uses **`%`** at least once. (Idea: if everyone pays the whole-dollar amount, how many
   dollars short are you?)
7. Shows the answers with **`showMessageDialog`** — at least two boxes.

Here is an example. **Make your own. Do not copy this one.** The user typed `47.50`, `20`
and `4`. The boxes said:

```
Tip: $9.5
Total: $57.0
Each person pays $14.25
If everyone pays $14, you are still $1 short.
```

> **Tip:** test your math in the Run window first with `System.out.println`, using fixed
> numbers. When the numbers are right, switch to pop-up boxes.

### ✅ Commit Section D

```bash
git add -A
git commit -m "part04 challenge: tip calculator with dialog boxes"
```

---

## Hand it in: push before the next lecture

### 1. Fill in your log

At the bottom of this page, fill in the three lines under **My log**.

### 2. Check your commits

In the terminal, type:

```bash
git log --oneline
```

Near the top of the list, you should see **your commits for this part**, newest first:

```
a1b2c3d part04 challenge: tip calculator with dialog boxes
e4f5a6b part04 stretch: prediction, bill, time, and averages
c7d8e9f part04 comments: explained every line of the follow-along code
9d8c7b6 part04 in-class: pizza party math
0a1b2c3 part04 follow-along: expressions and GUI dialog boxes
```

*(The letters and numbers at the start will be different for you. That is normal.)*
Press `q` to get out of the list.

**Missing one?** That section gets **0** right now. Go back, finish it, and make its
commit. You have until the next lecture starts.

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from the table, and add `--allow-empty` so Git lets you commit without
changing a file:

```bash
git commit --allow-empty -m "part04 comments: explained every line of the follow-along code"
```

### 3. Push

```bash
git add -A
git commit -m "part04 log"
git push
```

### 4. Check GitHub

Go to your fork on GitHub (`github.com/your-username/FollowAlong1-Basics`). Click the
**commits** link (clock icon) above the file list. **All of this part's commits must be
there.** If they are on your laptop but not on GitHub, you did not push, and I cannot see
them.

> **No commit, no credit.** A section with no commit gets 0. A commit that is not pushed
> before the next lecture starts does not count.

**Next part's warm-up:** retype your Stretch B1 (splitting the $50 bill) from memory.

**Finished early? Start Part 05.** You don't have to wait for class.

---

## My log

Fill this in before you push. Type your answers after the colons.

```
Started:
Finished:
The line that took me the longest:
```

---

## Want more help?

- **Think Java** (free online book): [Chapter 2 — Variables and Operators](https://books.trinket.io/thinkjava2/chapter2.html)
  for the math operators and integer division, and [Chapter 3 — Input and Output](https://books.trinket.io/thinkjava2/chapter3.html)
  for type casts and the remainder operator. The book does not cover pop-up windows.
- **Tutoring:** bring your laptop and this page.
- **Office hours:** bring the error message and tell me what you already tried.
- **Classmates:** talk it over as much as you want. But **type your own code.**
