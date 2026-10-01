# Part 03 — Swapping variables, and reading what the user types

**We start this together in class · due before the next lecture · No AI**

In this part your programs start **listening**. Until now, every value was typed into the
code. By the end of this part, your program asks a question, waits, and uses the answer the person
types.

**What you learn:**

- **swapping**: trading the values of two variables, with the help of a third one
- **`import`**: a line at the top of the file that brings in a tool Java doesn't load by
  itself
- **`Scanner`**: the tool that reads what the user types
- **the `nextInt` trap**: why your program sometimes skips a question, and the one-line fix

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
| **A · Follow along** | `Swap.java` and `UserInput.java` | 25 | `part03 follow-along: swapping variables and user input` |
| **B · Comments** | `Swap.java` and `UserInput.java` | 25 | `part03 comments: explained every line of the follow-along code` |
| **C · Stretch** | `Stretch.java` | 25 | `part03 stretch: prediction, greeting, rotation, and the nextInt fix` |
| **D · Challenge** | `Challenge.java` | 25 | `part03 challenge: mad libs with a swap` |

When you finish a section, you **commit** it with the message in the table. That commit is
how I know you finished it. **You do not send me anything on Canvas.** A program I run reads
your commit messages, so **type each one exactly as shown.**

> **No commit, no credit.** If a section has no commit, it gets **0**, even if the code is
> on your laptop. Everything must be **pushed before the next lecture starts.**

The warm-up and the in-class exercise are practice. They are not graded, but do them. They
make the rest easier.

---

## Warm-up — 5 minutes (practice, not graded)

1. Open `part02/Stretch.java`. Find your **Stretch B1**: four variables about you, printed
   with labels. Look at it for **30 seconds**.
2. Close it.
3. Open `part03/Warmup.java`. **Without looking back**, make it print the same four lines:

```
Name: Jordan Smith
Age: 19
GPA: 3.4
Commuter: false
```

4. Type `main` yourself. Run it with the **green ▶** next to `main`.
5. If it does not match, try to fix it yourself first. Look back only if you are really
   stuck.

---

## Section A — Follow along (25 points)

*We start this together in class. Finish it on your own if we run out of time.*

This part's video has **two topics**, and each one gets **its own file**:

| Topic | Video | Your file |
|---|---|---|
| Swapping two variables | about 35:40 to 38:50 | `Swap.java` |
| User input with `Scanner` | about 39:25 to 47:00 | `UserInput.java` |

**▶ [Open the video at 35:40](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2140s)**

**📖 Rather read than watch? Open [GUIDE.md](GUIDE.md)** in this folder. It is the same
lesson, written out step by step, with the output you should see after each step. You can
use the video, the guide, or both. Either way, you type every line yourself.

That is about 11 minutes of video.

> The times might be off by a minute. Listen for what he says:
>
> - **Swap starts** when he says *"here we got two variables."* **Swap ends** at *"your
>   assignment for today is to post two variables in the comments."*
> - **Scanner starts** when he says *"I'm going to explain how we can use a scanner."*
>   **Scanner ends** at *"that is how scanners work in Java."*

### His screen looks different from yours

**His class is called `Main`. Yours are called `Swap` and `UserInput`.** Leave the
`package part03;` line and the `public class ...` line alone in both files. Type `main`
yourself inside each class, then type everything else.

**When he moves from swapping to Scanner, you switch files.** Close `Swap.java` and open
`UserInput.java`. Do not put the Scanner code in `Swap.java`.

**The `import` line goes above the class.** At about 39:47 he types
`import java.util.Scanner;` "outside of the class, at the top." In your file, type it on
the **empty line under `package part03;`**, above `public class UserInput`. The `package`
line always stays first.

**If `Scanner` is red,** you forgot the import, or spelled it wrong. Click on the red word
and press `⌥ Enter` (Mac) or `Alt Enter` (Windows). IntelliJ offers **Import class**.
Choose it. But try typing the import yourself first.

**You type your answers in the Run window.** When the program asks *What is your name?*, it
**waits.** Click inside the **Run** window at the bottom, type your answer, and press
**Enter**. In his Eclipse the window is called "Console." Same thing.

**A yellow underline under `Scanner` is OK.** IntelliJ may warn that the scanner is never
"closed." That is a warning, not an error. Your program still runs. You can ignore it for now.

**His run button is round and green.** Yours is the **green ▶ next to `main`** — in the file
you are working on.

### Check your output as you go

**Swap — Check 1 (about 36:20): print both.**

```
x: water
y: Kool-Aid
```

**Swap — Check 2 (about 36:31): set `x = y`, then `y = x`.** It doesn't swap. Both end up
with Kool-Aid:

```
x: Kool-Aid
y: Kool-Aid
```

**Before you go on, say out loud why.** (`x = y` copies Kool-Aid into `x`. The water is
gone. Now `y = x` just copies Kool-Aid back.)

**Swap — Check 3 (about 37:43): use `temp`.** Now it really swaps:

```
x: Kool-Aid
y: water
```

**Scanner — Check 4 (about 41:40): ask a name.** Type your name in the Run window and press
Enter:

```
What is your name?
bro
Hello bro
```

(The `bro` in the middle is what **you** typed.)

**Scanner — Check 5 (about 42:15): ask an age.** You type a name and a number:

```
What is your name?
bro
How old are you?
18
Hello bro
You are 18 years old
```

(Where `Hello bro` appears depends on where you put that line. He moves the "Hello" line
down to the end. Either place is fine.)

**Scanner — Check 6 (about 42:59): type a word instead of a number.** Type `pizza` when it
asks your age. The program crashes:

```
Exception in thread "main" java.util.InputMismatchException
```

That is expected. `nextInt` wanted a whole number and got a word. We learn how to handle
this much later. For now, type numbers when it asks for numbers.

**Scanner — Check 7 (about 43:34): the trap.** He adds a third question, *What is your
favorite food?*, read with `nextLine()`. When you run it, **the program skips it**. You
never get to type a food:

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

**Check 8 (about 46:00): the fix.** He adds one extra `scanner.nextLine();` right after the
`nextInt()` line. Now it waits for the food:

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

**Why does the trap happen?** When you type `18` and press Enter, the Enter is saved too.
`nextInt()` takes the `18` but **leaves the Enter behind**. The next `nextLine()` reads
everything up to the next Enter — and finds it right away. So it reads an empty line and
moves on. The extra `scanner.nextLine();` throws away that leftover Enter.

### Stuck? Check these first

| What you see | What is usually wrong |
|---|---|
| `cannot find symbol` and `symbol: class Scanner` | The `import java.util.Scanner;` line is missing or misspelled |
| `cannot find symbol` and `symbol: method nextline()` | It is `nextLine`, with a **capital L** |
| `cannot find symbol` pointing at `System.In` | It is `System.in`, all **lowercase** `in` |
| The program seems frozen | It is **waiting for you.** Click in the Run window, type an answer, press Enter |
| `java.util.InputMismatchException` | You typed a word when `nextInt()` wanted a number |
| It skips a question after a number | The `nextInt` trap. Add `scanner.nextLine();` right after the `nextInt()` line |
| The swap gives the same value twice | You did not save one value in `temp` **first** |
| You fixed your code, but the output did not change | You ran a **different file**. Use the ▶ **next to `main`** in the file you are working on |

### ✅ Commit Section A

When `Swap.java` matches Check 3 and `UserInput.java` matches Check 8, type this in the
terminal:

```bash
git add -A
git commit -m "part03 follow-along: swapping variables and user input"
```

---

## In-class exercise — halftime swap (together, not graded)

We do this one together in class, in `InClass.java`. Everyone types their own copy.

### Step 1 — Ask for two teams, then swap them

1. At the top of the file, on the empty line under `package part03;`, type the import line:
   `import java.util.Scanner;`
2. Inside `main`, under the `STEP 1` comment, make a `Scanner`.
3. Ask for the **home** team and the **away** team. Save each answer in a `String`.
4. Print them. Then teams switch sides at halftime: **swap** the two variables, and print
   them again.

```
Home team: Hornets
Away team: Tigers
Before: Hornets vs Tigers
After halftime: Tigers vs Hornets
```

*(You type `Hornets` and `Tigers`, pressing Enter after each one. Use any teams you like.)*

Things to figure out together:

- Use `print`, not `println`, for the questions, so the answer is typed on the same line.
- Click inside the **Run** window before you type your answer.
- The swap needs a third variable, `temp`. What happens if you skip it and write
  `home = away;` then `away = home;`? Try it: both teams come out as `Tigers`.
- `nextLine()` reads the whole line, spaces and all, so `Delaware State` works too.

### Step 2 — Fix the bugs

Under `STEP 2` there are three broken lines, inside a `/* ... */` comment so they don't
stop your program from running. One at a time:

1. Move **one** broken line up, above the `/*` line. Now Java can see it.
2. Read the **red error**. What is Java telling you?
3. Fix the line. Run the program.
4. Do the next line.

| Broken line | The error Java gives you |
|---|---|
| `System.out.println("Home: " + Home);` | `cannot find symbol` and, under it, `symbol: variable Home` |
| `Scanner keyboard = new scanner(System.in);` | `cannot find symbol` and, under it, `symbol: class scanner` |
| `String coach = "Coach K;` | `unclosed string literal` |

When all three are fixed, your program prints one more line: `Home: Tigers`. Why Tigers,
not Hornets? Because of the swap.

### ✅ Commit the in-class exercise

```bash
git add -A
git commit -m "part03 in-class: halftime swap"
```

---

## Section B — Comment every line (25 points)

*On your own.*

Now explain your own code. In **both** `Swap.java` and `UserInput.java`, put a `//` comment
**above every line of code**, saying **in your own words** what that line does.

**Which lines need a comment?**

- **Yes:** every line that does something. That includes the `import` line,
  `public class ...`, `public static void main(...)`, the line that makes the `Scanner`,
  every line that asks a question or reads an answer, and every `System.out...` line.
- **No:** lines that are only `}`, and empty lines.

**What makes a good comment?** Say what the line **does** and **why**. Do not just repeat
the code in English.

| ❌ Not enough | ✅ Good |
|---|---|
| `// temp = x` | `// save water in temp first, so it isn't lost when x gets changed` |
| `// import` | `// bring in the Scanner tool, because Java doesn't load it on its own` |
| `// new scanner` | `// make a scanner that reads from the keyboard (System.in)` |
| `// nextInt` | `// wait for the user to type a whole number and press Enter, then store it in age` |
| `// nextLine` | `// throw away the Enter that nextInt left behind, so the next question isn't skipped` |

Here is what a commented line looks like in your file:

```java
        // wait for the user to type a line and press Enter, then save it in name
        String name = scanner.nextLine();
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
git commit -m "part03 comments: explained every line of the follow-along code"
```

---

## Section C — Stretch (25 points)

*On your own.*

Do these in `Stretch.java`. There is no `main` in that file yet. **Type it yourself.**
For B1 and B3 you also need `import java.util.Scanner;` on the empty line under
`package part03;`.

### Stretch A — guess first

1. Type this code inside `main`. **Do not run it yet.**

```java
int a = 1;
int b = 2;
a = b;
b = a;
System.out.println(a + " " + b);
int c = 1;
int d = 2;
int temp = c;
c = d;
d = temp;
System.out.println(c + " " + d);
```

2. **Above that code**, write what you think it will print, inside a comment:

```java
/* MY GUESS:
   ...
*/
```

3. Now run it.
4. Were you wrong? **Keep your wrong guess.** Under it, add a comment that says why.

<details>
<summary>Click to see the answer. Only after you have run it!</summary>

```
2 2
2 1
```

- The first swap fails. `a = b` makes `a` 2, and the 1 is gone. Then `b = a` copies 2
  back into `b`.
- The second swap works, because `temp` saves the 1 before it is lost.

</details>

### Stretch B — use Scanner and swap

Put this code under your Stretch A code, in the same `main`. Make **one** `Scanner` near
the top of `main` and use it for everything.

**B1.** Ask for a name and say hi. Keep it short — it is **the next part's warm-up**:

```
What is your name?
Jordan
Hi, Jordan!
```

**B2.** Make three `String` variables, `first = "red"`, `second = "green"`,
`third = "blue"`. Print them. Then **rotate** them, using only **one** `temp` variable, so
each value moves one place to the left. Print them again:

```
red green blue
green blue red
```

**B3.** Ask for an age (with `nextInt()`), then a city (with `nextLine()`). Make the trap
happen first — see the city get skipped. Then fix it. Above your fix, write a comment that
explains the fix in your own words. When it works:

```
How old are you?
19
What city do you live in?
Dover
19 years old, living in Dover
```

### ✅ Commit Section C

```bash
git add -A
git commit -m "part03 stretch: prediction, greeting, rotation, and the nextInt fix"
```

---

## Section D — Challenge (25 points)

*On your own.*

Do this in `Challenge.java`. Type `main` and the `import` yourself.

**Make a Mad Libs story.** Your program asks the user for words, then prints a short story
with their words in it. It must follow **all** of these rules:

1. Above the line `public class Challenge`, a **multi-line comment** (`/*` ... `*/`) with
   your name and the title of your story.
2. Asks **at least 4 questions**, using **one** `Scanner`.
3. At least **one** answer is a whole number, read with `nextInt()`.
4. At least **one** `nextLine()` question comes **after** the `nextInt()` one — and it must
   **not** get skipped. (Use the fix.)
5. Prints a story of **at least 3 sentences** that uses **every** answer.
6. Before the last sentence, **swap two of the answers** using a `temp` variable, so the
   last sentence has a twist.

Here is an example run. **Make your own story. Do not copy this one.** The lines after each
question are what the user typed.

```
Name a hero:
Maya
Name a villain:
Dr. Doom
Pick a number:
7
Name a place:
the library
Maya walked into the library.
There were 7 problems, and Dr. Doom caused every one.
Plot twist: Dr. Doom was the hero all along, and Maya was the villain!
```

### ✅ Commit Section D

```bash
git add -A
git commit -m "part03 challenge: mad libs with a swap"
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
a1b2c3d part03 challenge: mad libs with a swap
e4f5a6b part03 stretch: prediction, greeting, rotation, and the nextInt fix
c7d8e9f part03 comments: explained every line of the follow-along code
9d8c7b6 part03 in-class: halftime swap
0a1b2c3 part03 follow-along: swapping variables and user input
```

*(The letters and numbers at the start will be different for you. That is normal.)*
Press `q` to get out of the list.

**Missing one?** That section gets **0** right now. Go back, finish it, and make its
commit. You have until the next lecture starts.

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from the table, and add `--allow-empty` so Git lets you commit without
changing a file:

```bash
git commit --allow-empty -m "part03 comments: explained every line of the follow-along code"
```

### 3. Push

```bash
git add -A
git commit -m "part03 log"
git push
```

### 4. Check GitHub

Go to your fork on GitHub (`github.com/your-username/FollowAlong1-Basics`). Click the
**commits** link (clock icon) above the file list. **All of this part's commits must be
there.** If they are on your laptop but not on GitHub, you did not push, and I cannot see
them.

> **No commit, no credit.** A section with no commit gets 0. A commit that is not pushed
> before the next lecture starts does not count.

**Next part's warm-up:** retype your Stretch B1 (ask a name, say hi) from memory — including
the `import` line and the `Scanner`.

**Finished early? Start Part 04.** You don't have to wait for class.

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

- **Think Java** (free online book): [Chapter 3 — Input and Output](https://books.trinket.io/thinkjava2/chapter3.html).
  Read the parts about the `Scanner` class and reading input. The book also explains the
  `nextInt` / `nextLine` problem.
- **Tutoring:** bring your laptop and this page.
- **Office hours:** bring the error message and tell me what you already tried.
- **Classmates:** talk it over as much as you want. But **type your own code.**
