# Part 05 — The Math class and random numbers

**We start this together in class · due before the next lecture · No AI**

In this part you use two tools that come built into Java: **`Math`**, for math beyond `+ - * /`,
and **`Random`**, for random numbers. By the end, you can find a square root, round a
number, and roll a die.

**What you learn:**

- `Math.max`, `Math.min`, `Math.abs`, `Math.sqrt`: bigger, smaller, absolute value, square
  root
- `Math.round`, `Math.ceil`, `Math.floor`: three different ways to round
- **`Random`**: making random whole numbers, decimals, and true/false values
- **import**: a line at the top of the file that tells Java where to find a tool like
  `Scanner` or `Random`

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
| **A · Follow along** | `MathMethods.java`, `Hypotenuse.java`, `RandomNumbers.java` | 25 | `part05 follow-along: Math class, hypotenuse, random numbers` |
| **B · Comments** | the same three files | 25 | `part05 comments: explained every line of the follow-along code` |
| **C · Stretch** | `Stretch.java` | 25 | `part05 stretch: prediction, dice roll, circle area, distance` |
| **D · Challenge** | `Challenge.java` | 25 | `part05 challenge: dice report` |

When you finish a section, you **commit** it with the message in the table. That commit is
how I know you finished it. **You do not send me anything on Canvas.** A program I run reads
your commit messages, so **type each one exactly as shown.**

> **No commit, no credit.** If a section has no commit, it gets **0**, even if the code is
> on your laptop. Everything must be **pushed before the next lecture starts.**

The warm-up and the in-class exercise are practice. They are not graded, but do them. They
make the rest easier.

---

## Warm-up — 5 minutes (practice, not graded)

1. Open `part04/Stretch.java`. Look at your **Stretch B1** for **30 seconds**.
2. Close it.
3. Open `part05/Warmup.java`. **Without looking back**, type your Stretch B1 again. You
   have to type the `main` method yourself, too.
4. Run it with the **green ▶** next to `main`. Does it print the same thing as before?
5. If not, try to fix it yourself first. Look back at `part04/Stretch.java` only if you are
   really stuck.

---

## Section A — Follow along (25 points)

*We start this together in class. Finish it on your own if we run out of time.*

**▶ [Open the video at 58:38](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3518s)**

**📖 Rather read than watch? Open [GUIDE.md](GUIDE.md)** in this folder. It is the same
lesson, written out step by step, with the output you should see after each step. You can
use the video, the guide, or both. Either way, you type every line yourself.

**Watch from about 58:38 to about 68:28.** That is about 10 minutes of video, in **two
short videos** back to back. It will take you about 20–25 minutes, because you keep
pausing to type. That is normal.

> The times might be off by a minute. Listen for what he says:
>
> - **Start** when he says *"I'm going to teach you guys a few useful methods of the math
>   class."*
> - **Stop** when he says *"that's a few uses of the random class."*

### Which file to type in

He makes a new program for each part. You have a file ready for each one:

| When he… | Type in |
|---|---|
| shows `max`, `min`, `abs`, `sqrt`, `round`, `ceil`, `floor` (58:38–61:29) | `MathMethods.java` |
| says *"here's a project that we can work on"* and builds the hypotenuse program (61:29–63:52) | `Hypotenuse.java` |
| starts the random numbers video (64:10–68:28) | `RandomNumbers.java` |

### His screen looks different from yours

**His class is called `Main`. Yours have other names.** Your files are `MathMethods`,
`Hypotenuse`, and `RandomNumbers`. **Leave the `package part05;` line and the
`public class ...` line alone.** Type everything else, starting with the `main` method.

**Never name a class `Math` or `Random`.** Java already has classes with those names. That
is why yours are called `MathMethods` and `RandomNumbers`.

**He changes one line over and over.** For example, he changes `Math.max` to `Math.min` on
the same line. **Don't erase your old lines.** Add new lines under them instead. You need
every line for Section B. When you add a new line that reuses `z`, write `z = ...` with **no**
`double` in front. (The guide, steps 3–6, shows exactly how.)

**He types the `import` line by hand.** In IntelliJ, you can click on a red `Scanner` or
`Random` and press `⌥ Enter` (Mac) or `Alt Enter` (Windows), then choose **Import class**.
IntelliJ adds the line for you. That is allowed: it is a fix, not autocomplete. Or type it
yourself. Either way, it goes **after** `package part05;` and **before** `public class`.

**Typing input.** In the hypotenuse program, the program waits for you. **Click inside the
Run window** at the bottom, type the number, and press Enter.

**He runs his code with a round green button.** You run yours with the **green ▶ next to
`main`**. Each file has its own `main`, so each file has its own ▶. Use the one in the file
you are working on.

**He copies and pastes a line.** **You type it.** Every time.

### Check your output as you go

**Check 1 (about 63:00): `MathMethods.java`, all done.**

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

`NaN` means "Not a Number." It is what you get for the square root of a negative number.

**Check 2 (about 63:30): `Hypotenuse.java`.** Type `4`, press Enter, type `5`, press Enter:

```
Enter side x: 
4
Enter side y: 
5
The hypotenuse is: 6.4031242374328485
```

**Check 3 (about 67:24): a die roll with `nextInt(6) + 1`.** Run it several times. You
should **only ever** see numbers from 1 to 6. If you ever see a `0`, you forgot the `+ 1`.

**Check 4 (about 68:28): `RandomNumbers.java`, all done.** Three lines: a whole number from
1 to 6, a decimal between 0 and 1, and `true` or `false`. **Yours will be different** every
time you run it. That is the point. For example:

```
6
0.49618642501530197
false
```

### Stuck? Check these first

| What you see | What is usually wrong |
|---|---|
| `cannot find symbol` … `symbol: class Scanner` (or `class Random`) | The `import` line is missing. Click the red word and press `⌥ Enter` / `Alt Enter` |
| `cannot find symbol` … `symbol: variable math` | `Math` needs a **capital M** |
| `variable z is already defined in method main(String[])` | You typed `double z` twice. The second time, write just `z = ...` |
| `incompatible types: possible lossy conversion from double to int` | You stored a `Math` answer in an `int`. Most `Math` methods give back a `double`, so use `double` |
| The program just sits there and prints nothing more | It is waiting for you to type. Click in the Run window, type a number, press Enter |
| You fixed your code, but the output did not change | You ran a **different file**. Use the ▶ **next to `main`** in the file you are working on |

### ✅ Commit Section A

When all three files match the checks above, type this in the terminal:

```bash
git add -A
git commit -m "part05 follow-along: Math class, hypotenuse, random numbers"
```

---

## In-class exercise — rover trip report (together, not graded)

We do this one together in class, in `InClass.java`. Everyone types their own copy.

### Step 1 — Work out the trip

Inside `main`, under the `STEP 1` comment, write a program that prints this. **Your
"Rocks found" number will be different** — it is random, from 1 to 5.

```
Distance: 5.0 meters
Farther leg: 4.0
Battery used, rounded: 13%
Battery used, rounded up: 13.0%
Rocks found: 2
```

Things to figure out together:

- The rover drove **3.0** meters east and **4.0** meters north. How far is it from the
  start? That is the hypotenuse: `Math.sqrt(east * east + north * north)`.
- Which leg was longer? `Math.max` tells you.
- The rover used **12.6%** of its battery. `Math.round` and `Math.ceil` round it two
  different ways. Why does one print `13` and the other `13.0`?
- `Random` needs an `import` line at the top of the file. When `Random` turns red, click
  on it and press `⌥ Enter` (Mac) or `Alt Enter` (Windows), then choose **Import class**.
- `random.nextInt(5)` gives 0 to 4. How do you make it 1 to 5?

### Step 2 — Fix the bugs

Under `STEP 2` there are three broken lines, inside a `/* ... */` comment so they don't
stop your program from running. One at a time:

1. Move **one** broken line up, above the `/*` line. Now Java can see it.
2. Read the **red error**. What is Java telling you?
3. Fix the line. Run the program.
4. Do the next line.

| Broken line | The error Java gives you |
|---|---|
| `double root = Math.sqrt(16)` | `';' expected` |
| `double big = math.max(3, 7);` | `cannot find symbol` |
| `int whole = Math.sqrt(25);` | `incompatible types: possible lossy conversion from double to int` |

**About the last one:** `Math.sqrt` always gives back a `double`, even for 25. Java will
not squeeze a `double` into an `int` by itself, because it might lose the part after the
decimal point. Either make the variable a `double`, or cast it: `(int) Math.sqrt(25)`.

### ✅ Commit the in-class exercise

```bash
git add -A
git commit -m "part05 in-class: rover trip report"
```

---

## Section B — Comment every line (25 points)

*On your own.*

Now explain your own code. In **all three** follow-along files (`MathMethods.java`,
`Hypotenuse.java`, `RandomNumbers.java`), put a `//` comment **above every line of code**,
saying **in your own words** what that line does.

**Which lines need a comment?**

- **Yes:** every line that does something. That includes `import`, `public class`,
  `public static void main(...)`, every variable, every `Math...` line, every
  `System.out...` line.
- **No:** lines that are only `}`, and empty lines.

**What makes a good comment?** Say what the line **does** and **why the output looks the
way it does.** Do not just repeat the code in English.

| ❌ Not enough | ✅ Good |
|---|---|
| `// math max` | `// Math.max picks the bigger of x and y, so z becomes 3.14` |
| `// sqrt of y` | `// square root of -10 doesn't exist, so this gives NaN (not a number)` |
| `// random` | `// nextInt(6) gives 0 to 5, so I add 1 to get 1 to 6, like a real die` |
| `// import` | `// tells Java where to find Scanner so I can read what the user types` |

Here is what a commented line looks like in your file:

```java
        // ceil always rounds UP, so 3.14 becomes 4.0
        z = Math.ceil(x);
```

**Rules:**

1. **Your own words.** Do not copy sentences from the guide or the video. I want to know
   what **you** think the line does.
2. **Not sure what a line does?** Write your best guess, and add `(not sure)` at the end.
   An honest guess gets credit. A skipped line does not.
3. **Run each file again when you're done.** Comments must not change the output.

### ✅ Commit Section B

```bash
git add -A
git commit -m "part05 comments: explained every line of the follow-along code"
```

---

## Section C — Stretch (25 points)

*On your own.*

Do these in `Stretch.java`. There is no `main` in that file yet. **Type it yourself.** You
will need two `import` lines: `java.util.Random` and `java.util.Scanner`.

### Stretch A — guess first

1. Type this code inside `main`. **Do not run it yet.**

```java
System.out.println(Math.max(7, -3));
System.out.println(Math.min(2.5, 9));
System.out.println(Math.abs(-8));
System.out.println(Math.sqrt(49));
System.out.println(Math.round(2.5));
System.out.println(Math.round(2.4));
System.out.println(Math.ceil(2.1));
System.out.println(Math.floor(-2.1));
```

2. **Above that code**, write what you think each line will print, inside a comment:

```java
/* MY GUESS:
   ...
*/
```

3. Now run it.
4. Were you wrong about any line? **Keep your wrong guess.** Under it, add a comment that
   says why you were wrong.

<details>
<summary>Click to see the answer. Only after you have run it!</summary>

```
7
2.5
8
7.0
3
2
3.0
-3.0
```

- `Math.max(7, -3)` and `Math.abs(-8)` print **no** `.0`. You gave them whole numbers
  (`int`s), so they give back whole numbers.
- `Math.sqrt` always gives a `double`, so `7.0`.
- `Math.round(2.5)` prints `3`, **not** `3.0`. In the video, `round` printed `3.0` only
  because he stored the answer in a `double` variable first.
- `Math.floor(-2.1)` is `-3.0`, not `-2.0`. "Down" means toward the smaller number, and
  `-3` is smaller than `-2`.

</details>

### Stretch B — dice, a circle, and a distance

Put this code under your Stretch A code, in the same `main`.

**B1.** Roll one six-sided die and print it. Three lines inside `main` (plus the import):

```
You rolled a 4
```

*(Your number will be different each time, but always 1 to 6.)* The next part's warm-up is
this one, from memory, so keep it short.

**B2.** Use a `Scanner` to ask for the radius of a circle. Print its area, then the area
rounded with `Math.round`. The area of a circle is **π × radius × radius**. Java has π
built in: **`Math.PI`**.

```
Enter the radius: 5
Area: 78.53981633974483
Area, rounded: 79
```

**B3.** Print the distance between the points (1, 2) and (4, 6). The formula is:

> the square root of ( (4 − 1) × (4 − 1) + (6 − 2) × (6 − 2) )

It is the same idea as the hypotenuse. Use `Math.sqrt`.

```
Distance: 5.0
```

### ✅ Commit Section C

```bash
git add -A
git commit -m "part05 stretch: prediction, dice roll, circle area, distance"
```

---

## Section D — Challenge (25 points)

*On your own.*

Do this in `Challenge.java`. Type `main` yourself again.

**Write a dice report.** Your program must follow **all** of these rules:

1. Uses a **`Scanner`** to ask for the player's name.
2. Uses **`Random`** to roll **two** six-sided dice. Each one must be **1 to 6**.
3. Prints the name and both dice, and the **total** of the two dice.
4. Prints the **higher** die using **`Math.max`**.
5. Prints the **lower** die using **`Math.min`**.
6. Prints the **difference** between the dice using **`Math.abs`**. (It should never be
   negative, no matter which die is bigger.)
7. Prints the **average** of the two dice: the total divided by `2.0`.
   *(Why `2.0` and not `2`? In Java, `7 / 2` is `3`, because two whole numbers give a
   whole-number answer. But `7 / 2.0` is `3.5`.)*
8. Prints the average **rounded** with **`Math.round`**.

Here is one example run. **Your dice will be different every time.** Your labels can be
different too, as long as each line says what it is.

```
What is your name? Jordan
Jordan rolled a 2 and a 5
Total: 7
Higher die: 5
Lower die: 2
Difference: 3
Average: 3.5
Average, rounded: 4
```

**Check your own work:** run it 5 times. Every time, is the higher die really the higher
one? Is the difference never negative? Does the total really add up?

### ✅ Commit Section D

```bash
git add -A
git commit -m "part05 challenge: dice report"
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
a1b2c3d part05 challenge: dice report
e4f5a6b part05 stretch: prediction, dice roll, circle area, distance
c7d8e9f part05 comments: explained every line of the follow-along code
9d8c7b6 part05 in-class: rover trip report
0a1b2c3 part05 follow-along: Math class, hypotenuse, random numbers
```

*(The letters and numbers at the start will be different for you. That is normal.)*
Press `q` to get out of the list.

**Missing one?** That section gets **0** right now. Go back, finish it, and make its
commit. You have until the next lecture starts.

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from the table, and add `--allow-empty` so Git lets you commit without
changing a file:

```bash
git commit --allow-empty -m "part05 comments: explained every line of the follow-along code"
```

### 3. Push

```bash
git add -A
git commit -m "part05 log"
git push
```

### 4. Check GitHub

Go to your fork on GitHub (`github.com/your-username/FollowAlong1-Basics`). Click the
**commits** link (clock icon) above the file list. **All of this part's commits must be
there.** If they are on your laptop but not on GitHub, you did not push, and I
cannot see them.

> **No commit, no credit.** A section with no commit gets 0. A commit that is not pushed
> before the next lecture starts does not count.

**Next part's warm-up:** retype your Stretch B1 (the die roll) from memory.

**Finished early? Start Part 06.** It is in the **next repo, FollowAlong2-ControlFlow**. Its README
shows you how to set it up (about 5 minutes). You don't have to wait for class.

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

- **Think Java** (free online book): [Chapter 4](https://books.trinket.io/thinkjava2/chapter4.html).
  Look for the part about **Math methods**. For random numbers, look in
  [Chapter 7](https://books.trinket.io/thinkjava2/chapter7.html) for the part about
  **random numbers**.
- **Tutoring:** bring your laptop and this page.
- **Office hours:** bring the error message and tell me what you already tried.
- **Classmates:** talk it over as much as you want. But **type your own code.**
