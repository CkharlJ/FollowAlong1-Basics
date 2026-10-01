# Part 01 — Printing text to the screen

**We start this together in class · due before the next lecture · No AI**

In this part you write your first Java program **starting from an empty file**, by typing along
with the video. By the end, you can print any text on the screen, in any shape you want.

**What you learn:**

- `print` and `println`: two ways to put text on the screen
- **escape sequences**: a backslash `\` plus a letter, for things that are hard to type
  inside quotes, like a new line or a tab
- **comments**: notes in your code that Java ignores

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
| **A · Follow along** | `Main.java` | 25 | `part01 follow-along: print, println, escape sequences, comments` |
| **B · Comments** | `Main.java` | 25 | `part01 comments: explained every line of Main.java` |
| **C · Stretch** | `Stretch.java` | 25 | `part01 stretch: prediction, card, and table` |
| **D · Challenge** | `Challenge.java` | 25 | `part01 challenge: picture with escape sequences` |

When you finish a section, you **commit** it with the message in the table. That commit is
how I know you finished it. **You do not send me anything on Canvas.** A program I run reads
your commit messages, so **type each one exactly as shown.**

> **No commit, no credit.** If a section has no commit, it gets **0**, even if the code is
> on your laptop. Everything must be **pushed before the next lecture starts.**

The warm-up and the in-class exercise are practice. They are not graded, but do them. They
make the rest easier.

---

## Warm-up — 5 minutes (practice, not graded)

1. Open `part00/Main.java`. Look at it for **30 seconds**.
2. Close it.
3. Open `part01/Warmup.java`. **Without looking back**, make it print the same three lines,
   with your name:

```
=== Part 00 ===
Hello from Jordan Smith
If you can read this, your setup works.
```

You have to type `public static void main(String[] args)` yourself. You will probably make
a mistake. **That is fine. That is what the warm-up is for.** A mistake you make and fix
now is one you will not make on a test.

4. Run it with the **green ▶** next to `main`.
5. If it does not match, try to fix it yourself first. Look back at `part00/Main.java` only
   if you are really stuck.

---

## Section A — Follow along (25 points)

*We start this together in class. Finish it on your own if we run out of time.*

**▶ [Open the video at 7:50](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=470s)**

**📖 Rather read than watch? Open [GUIDE.md](GUIDE.md)** in this folder. It is the same
lesson, written out step by step, with the output you should see after each step. You can
use the video, the guide, or both. Either way, you type every line yourself.

**Watch from about 7:50 to about 17:30.** That is about 10 minutes of video. It will take
you about 20 minutes, because you keep pausing to type. That is normal.

> The times might be off by a minute. Listen for what he says:
>
> - **Start** when he says *"a class is a collection of related code."*
> - **Stop** when he says *"it's time for this section on tips and tricks."*

### His screen looks different from yours

He uses a program called **Eclipse**. You use **IntelliJ**. The Java code is exactly the
same. The buttons and menus are different. Here is what to do when they don't match:

**Skip the first 7 minutes and 50 seconds.** That part is about installing things. You
already did that in Part 00.

**He makes a new file. You don't.** `part01/Main.java` already exists. Open it and type
there.

**Your file has one extra line at the top: `package part01;`** His does not. **Leave that
line alone.** It tells Java which part this file belongs to. Type everything else.

**He types `public static void main` at about 11:00.** (He says *"repeat after me."*) Type
it with him, inside the class's `{ }`.

**He runs his code with a round green button.** You run yours with the **green ▶ next to
`main`**. It shows up as soon as you finish typing `main`. Click it, then choose
**Run 'Main.main()'**.

**His output shows in a window called "Console."** Yours shows in the **Run** window at the
bottom. Same thing, different name.

**He deletes `main` to show you an error.** When you do this in IntelliJ, the green ▶ just
**disappears**. Try it. Watch the ▶ go away. Then type `main` back in.

**He copies and pastes a line.** **You type it.** Every time. Typing is how you learn it.

**You don't have to print the same words he does.** If he prints *I love pizza* and you
want to print *I love wings*, go ahead. What matters is that your output has the same
**shape** as his.

### Check your output as you go

After each part of the video, run your code. Your output should look like this.

**Check 1 (about 12:30): two `print` lines.** Both sentences come out stuck together on one
line:

```
I love pizzaIt's really good
```

**Check 2 (about 13:00): he changes them to `println`.** Now each sentence is on its own
line:

```
I love pizza
It's really good
```

**Check 3 (about 13:45): back to `print`, but with `\n` at the end of the first
sentence.** The output looks exactly like Check 2. That is the point: `\n` means "go to a
new line," just like `println` does.

**Check 4 (about 14:30): `println` and `\n` together.** Now there is an empty line in the
middle. **Before you run it, try to explain why.** Then run it:

```
I love pizza

It's really good
```

*(Why: `\n` moves to a new line, and then `println` moves to another new line. That's two.)*

**Check 5 (about 15:00 to 16:30): `\t`, `\"` and `\\`.**

- `\t` adds a **tab** (a gap) at the start of the first line.
- `\"` lets you print a quote mark `"` without ending the text.
- `\\` prints one backslash `\`.

Your output looks something like this:

```
        "I love pizza"

It's really good \
```

The gap from a tab can look wider or narrower on your screen. That is fine.

**Check 6 (about 16:30 to 17:30): comments.** He adds a comment with `//` and a longer one
with `/*` and `*/`. **Your output should not change at all.** Java ignores comments. If
your output changed, some text is outside the comment that should be inside it.

### Stuck? Check these first

| What you see | What is usually wrong |
|---|---|
| A red squiggly line at the end of a line | You forgot the `;` |
| `cannot find symbol` and the word `system` | `System` needs a **capital S** |
| `println` is underlined in red | Check the spelling. It is **p-r-i-n-t-l-n**. The letter after `print` is a lowercase **L**, not a capital I |
| `illegal escape character` | After a `\`, you typed something other than `n`, `t`, `"` or `\` |
| No green ▶ next to `main` | `main` is spelled wrong, or it is outside the class's `{ }` |
| You fixed your code, but the output did not change | You ran a **different file**. You probably clicked the ▶ at the **top** of the window. Use the ▶ **next to `main`** in the file you are working on |

### ✅ Commit Section A

When your output matches Check 6, type this in the terminal:

```bash
git add -A
git commit -m "part01 follow-along: print, println, escape sequences, comments"
```

---

## In-class exercise — rover status report (together, not graded)

We do this one together in class, in `InClass.java`. Everyone types their own copy.

### Step 1 — Print a status report

Inside `main`, under the `STEP 1` comment, print this report. Use `\t` to line up the
second column. **Do not line it up with spaces.**

```
=== ROVER STATUS ===
Name:           "Sting"
Battery:        87%
Mode:           CRUISE
Log file:       C:\rover\log.txt
Status:         All systems "go"
```

Things to figure out together:

- `Name:` and `Mode:` are short, so they need **two** tabs. The longer labels need one.
- `"Sting"` and `"go"` need `\"`.
- The backslashes in the file name need `\\`.
- Print the `Mode:` line with **`print` and `\n`** instead of `println`.

### Step 2 — Fix the bugs

Under `STEP 2` there are three broken lines, inside a `/* ... */` comment so they don't
stop your program from running. One at a time:

1. Move **one** broken line up, above the `/*` line. Now Java can see it.
2. Read the **red error**. What is Java telling you?
3. Fix the line. Run the program.
4. Do the next line.

| Broken line | The error Java gives you |
|---|---|
| `System.out.println("Battery: 87%")` | `';' expected` |
| `System.out.println("Name: "Sting"");` | `')' or ',' expected` |
| `System.out.println("Log file: C:\rover\log.txt");` | `illegal escape character` |

**A surprise in the last one:** Java points at `\l`, not `\r`. That is because `\r` is a
real escape sequence (it is called a *carriage return*), so Java accepts it. `\l` is not.
Either way, the fix is the same: use `\\` for every backslash you want to print.

### ✅ Commit the in-class exercise

```bash
git add -A
git commit -m "part01 in-class: rover status report"
```

---

## Section B — Comment every line (25 points)

*On your own.*

Now explain your own code. In `Main.java`, put a `//` comment **above every line of code**,
saying **in your own words** what that line does.

**Which lines need a comment?**

- **Yes:** every line that does something. That includes `public class Main`,
  `public static void main(...)`, and every `System.out...` line.
- **No:** lines that are only `}`, empty lines, and the comments you already typed from the
  video.

**What makes a good comment?** Say what the line **does** and **why the output looks the
way it does.** Do not just repeat the code in English.

| ❌ Not enough | ✅ Good |
|---|---|
| `// prints I love pizza` | `// prints the text, then println moves to a new line so the next text starts underneath` |
| `// print` | `// print does NOT move to a new line, so the next print sticks right onto the end of this one` |
| `// \t` | `// \t puts a tab gap before the text, and \" prints a quote mark instead of ending the text` |
| `// main` | `// this is where my program starts running. Java looks for exactly this line` |

Here is what a commented line looks like in your file:

```java
        // println shows the text and then moves down to the next line
        System.out.println("It's really good");
```

**Rules:**

1. **Your own words.** Do not copy sentences from the guide or the video. I want to know
   what **you** think the line does.
2. **Not sure what a line does?** Write your best guess, and add `(not sure)` at the end.
   An honest guess gets credit. A skipped line does not.
3. **Run it again when you're done.** Comments must not change the output. If it changed,
   a comment is missing its `//`.

### ✅ Commit Section B

```bash
git add -A
git commit -m "part01 comments: explained every line of Main.java"
```

---

## Section C — Stretch (25 points)

*On your own.*

Do these in `Stretch.java`. There is no `main` in that file yet. **Type it yourself.**

### Stretch A — guess first

1. Type this code inside `main`. **Do not run it yet.**

```java
System.out.print("A");
System.out.println("B");
System.out.print("C\n");
System.out.println("\tD\\");
System.out.println("\"E\"");
// System.out.println("F");
System.out.print("G");
System.out.println();
```

2. **Above that code**, write what you think it will print. Put your guess inside a
   comment, like this:

```java
/* MY GUESS:
   ...
*/
```

3. Now run it.
4. Were you wrong about any line? **Keep your wrong guess.** Under it, add a comment that
   says why you were wrong. Understanding a wrong guess teaches you more than a lucky right
   one.

<details>
<summary>Click to see the answer. Only after you have run it!</summary>

```
AB
C
        D\
"E"
G
```

- `A` and `B` are on the same line, because `print` does not go to a new line.
- `F` never prints, because its line is a comment.
- To print `D\`, the code needs `\\`. One `\` by itself starts an escape sequence.

</details>

### Stretch B — a card and a table

Put this code under your Stretch A code, in the same `main`.

**B1.** Print a card about yourself. Use one `println` for each line:

```
Jordan Smith
Computer Science
Class of 2029
```

**B2.** Print **the same card again**, but this time use **only one** `System.out.print`
(not `println`). You will need `\n`.

**B3.** Print the lines below. Use `\t` (tab) to line up the columns. **Do not use spaces
to line them up.**

```
Day     Class           Time
Mon     CSCI-121        2:00 PM
Tue     CSCI-121        3:00 PM
My teacher said "type it yourself."
My code lives in C:\Users\jordan\csci121
```

**Hint:** the word `Class` is shorter than `CSCI-121`. So in the first line, you need
**two** tabs after `Class` to make `Time` line up.

### ✅ Commit Section C

```bash
git add -A
git commit -m "part01 stretch: prediction, card, and table"
```

---

## Section D — Challenge (25 points)

*On your own.*

Do this in `Challenge.java`. Type `main` yourself again.

**Draw a picture** made of text. It can be anything: a robot, a car, a face, your initials,
a pet. Your picture must follow **all** of these rules:

1. **At least 5 lines tall.**
2. Above the line `public class Challenge`, a **multi-line comment** (`/*` ... `*/`)
   with your name and what the picture is.
3. Uses **at least one `\t`** (tab).
4. Uses **at least one `\"`** (a printed quote mark).
5. Uses **at least one `\\`** (a printed backslash).
6. Uses **at least one `print` with `\n`** instead of `println`.

Here is an example. **Make your own. Do not copy this one.**

```
   +--------+
   | O    O |
   |   --   |
   +--------+
    ()    ()
"Beep." \o/
```

The last line of the example is the tricky one. It has quote marks **and** a backslash, so
it needs two different escape sequences.

### ✅ Commit Section D

```bash
git add -A
git commit -m "part01 challenge: picture with escape sequences"
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
a1b2c3d part01 challenge: picture with escape sequences
e4f5a6b part01 stretch: prediction, card, and table
c7d8e9f part01 comments: explained every line of Main.java
9d8c7b6 part01 in-class: rover status report
0a1b2c3 part01 follow-along: print, println, escape sequences, comments
```

*(The letters and numbers at the start will be different for you. That is normal.)*
Press `q` to get out of the list.

**Missing one?** That section gets **0** right now. Go back, finish it, and make its
commit. You have until the next lecture starts.

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from the table, and add `--allow-empty` so Git lets you commit without
changing a file:

```bash
git commit --allow-empty -m "part01 comments: explained every line of Main.java"
```


### 3. Push

```bash
git add -A
git commit -m "part01 log"
git push
```

### 4. Check GitHub

Go to your fork on GitHub (`github.com/your-username/FollowAlong1-Basics`). Click the
**commits** link (clock icon) above the file list. **All of this part's commits must be
there.** If they are on your laptop but not on GitHub, you did not push, and I
cannot see them.

> **No commit, no credit.** A section with no commit gets 0. A commit that is not pushed
> before the next lecture starts does not count.

**Next part's warm-up:** type your Stretch B1 card again, from memory.

**Finished early? Start Part 02.** You don't have to wait for class.

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

- **Think Java** (free online book): [Chapter 1](https://books.trinket.io/thinkjava2/chapter1.html).
  Read the parts about the Hello World program, printing two lines, and escape sequences.
- **Tutoring:** bring your laptop and this page.
- **Office hours:** bring the error message and tell me what you already tried.
- **Classmates:** talk it over as much as you want. But **type your own code.**
