# Part 02 — Variables

**We start this together in class · due before the next lecture · No AI**

In part 01 you printed text that never changed. Now you learn **variables**: named boxes
that hold a value, like a number or a word. Almost every program from now on uses them.

**What you learn:**

- **variable**: a name that holds a value, like `age` holding `19`
- **data type**: what kind of value a variable holds — a whole number, a decimal, one
  letter, true/false, or text
- **declare, assign, initialize**: three words for making a variable and giving it a value
- **`+` with text**: joining text and variables together, like `"My number is " + x`

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
| **A · Follow along** | `Variables.java` | 25 | `part02 follow-along: variables and data types` |
| **B · Comments** | `Variables.java` | 25 | `part02 comments: explained every line of the follow-along code` |
| **C · Stretch** | `Stretch.java` | 25 | `part02 stretch: prediction, profile, and bug fixes` |
| **D · Challenge** | `Challenge.java` | 25 | `part02 challenge: character card with every data type` |

When you finish a section, you **commit** it with the message in the table. That commit is
how I know you finished it. **You do not send me anything on Canvas.** A program I run reads
your commit messages, so **type each one exactly as shown.**

> **No commit, no credit.** If a section has no commit, it gets **0**, even if the code is
> on your laptop. Everything must be **pushed before the next lecture starts.**

The warm-up and the in-class exercise are practice. They are not graded, but do them. They
make the rest easier.

---

## Warm-up — 5 minutes (practice, not graded)

1. Open `part01/Stretch.java`. Find your **Stretch B1**: the three-line card about you.
   Look at it for **30 seconds**.
2. Close it.
3. Open `part02/Warmup.java`. **Without looking back**, make it print your card again:

```
Jordan Smith
Computer Science
Class of 2029
```

(With your own name, major and year, of course.)

4. You have to type `public static void main(String[] args)` yourself again. Run it with
   the **green ▶** next to `main`.
5. If it does not match, try to fix it yourself first. Look back only if you are really
   stuck.

---

## Section A — Follow along (25 points)

*We start this together in class. Finish it on your own if we run out of time.*

**▶ [Open the video at 22:20](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1340s)**

**📖 Rather read than watch? Open [GUIDE.md](GUIDE.md)** in this folder. It is the same
lesson, written out step by step, with the output you should see after each step. You can
use the video, the guide, or both. Either way, you type every line yourself.

**Watch from about 22:20 to about 35:00.** That is about 13 minutes of video.

> The times might be off by a minute. Listen for what he says:
>
> - **Start** when he says *"let's talk about variables now."*
> - **Stop** right after he prints *"Hello Bro"* and says *"that is everything you need to
>   know to get started with variables."*

**The first 7 minutes are slides, not code** (about 22:20 to 29:00). He explains the data
types. Watch them — you need them — but there is nothing to type yet. Typing starts at
about **29:00**, when he says *"let's begin with creating an integer variable."*

### His screen looks different from yours

**His class is called `Main`. Yours is called `Variables`.** Open `part02/Variables.java`.
**Leave the `package part02;` line and the `public class Variables` line alone.** Type
everything else inside the class's `{ }`.

**You need `main` first.** His file already has it. Yours does not. Type
`public static void main(String[] args) { }` inside the class before you type anything
else.

**He changes the same lines over and over.** For example, he makes `y` a `float`, then
changes it to a `double`. You can do the same thing: change the line instead of adding a
new one. **If you add a new line instead, give the variable a new name.** Two variables in
the same `main` cannot have the same name. If they do, you get:

```
error: variable x is already defined in method main(String[])
```

**He types a few lines that are wrong on purpose**, to show you an error. For example, he
puts `130` in a `byte`. When you try these, IntelliJ underlines them in red. **Fix them or
delete them before you run.** Your program will not run while anything is red.

**Hovering over a red line** shows IntelliJ's message, which can be worded a little
differently from the messages in the **Stuck?** table below. The table shows the message
you get in the **Build** window when you click ▶. Both mean the same thing.

**His run button is round and green.** Yours is the **green ▶ next to `main`**. Choose
**Run 'Variables.main()'**.

### Check your output as you go

**Check 1 (about 29:40): print `x`.** He makes `int x = 123;` and prints it:

```
123
```

**Check 2 (about 30:00): `x` in quotes.** He prints `"x"` with quotes around it. Now Java
prints the **letter x**, not the value inside it:

```
x
```

Quotes mean "print this text exactly." No quotes means "print what is **inside** this
variable."

**Check 3 (about 30:17): text plus a variable.**

```
My number is 123
```

**Check 4 (about 30:51 to 33:00): long, byte, float, double.** Each prints its value:

```
3000000000
100
3.14
3.14
```

(The big number is the one you put in your `long`. Yours can be different. Remember the
`L` at the end.)

**Check 5 (about 33:06 to 34:08): boolean and char.**

```
true
@
```

**Check 6 (about 34:08 to 34:55): String.** He stores his name and prints it with
`"Hello "` in front:

```
Hello Bro
```

Put your own name in. Watch the space after `Hello` — it goes **inside** the quotes.

Here is the whole output if you keep every line, one after another:

```
123
x
My number is 123
3000000000
100
3.14
3.14
true
@
Hello Bro
```

### Stuck? Check these first

| What you see | What is usually wrong |
|---|---|
| `possible lossy conversion from int to byte` | The number is too big for a `byte`. A byte only holds −128 to 127 |
| `possible lossy conversion from double to int` | You put a decimal (like `23.1`) in an `int`. Use `double` |
| `possible lossy conversion from double to float` | A `float` needs an `f` at the end of the number: `3.14f` |
| `integer number too large` | A big number for a `long` needs an `L` at the end: `3000000000L` |
| `String cannot be converted to char` | A `char` uses **single** quotes: `'@'`, not `"@"` |
| `cannot find symbol` pointing at `string` | `String` needs a **capital S** |
| `cannot find symbol` pointing at a variable | The name is spelled differently from where you made it. `Name` and `name` are different |
| `variable x might not have been initialized` | You declared `x` but never gave it a value before printing it |
| `variable x is already defined` | You made two variables with the same name. Rename one |
| `';' expected` | You forgot the `;` at the end of the line |

### ✅ Commit Section A

When your output matches Check 6, type this in the terminal:

```bash
git add -A
git commit -m "part02 follow-along: variables and data types"
```

---

## In-class exercise — rover dashboard (together, not graded)

We do this one together in class, in `InClass.java`. Everyone types their own copy.

### Step 1 — Give the rover some variables

Inside `main`, under the `STEP 1` comment, make **five variables** for a rover, one of
each type:

| Name | Type | Value |
|---|---|---|
| `rover` | `String` | `"Sting"` |
| `battery` | `int` | `87` |
| `speed` | `double` | `1.5` |
| `mode` | `char` | `'C'` |
| `lightsOn` | `boolean` | `true` |

Print two lines about the rover. Then the rover drives, and its battery drops by 12.
**Change** `battery` (do not make a new variable) and print it again:

```
Rover Sting has 87% battery.
Speed: 1.5 m/s, mode C, lights on: true
After driving, battery is 75%.
```

Things to figure out together:

- Why is `87` an `int` but `1.5` a `double`?
- `char` uses **single** quotes: `'C'`. `String` uses **double** quotes: `"Sting"`.
- To change `battery`, write `battery = battery - 12;` with **no** `int` in front. With
  `int` in front, Java says `variable battery is already defined`.
- `+` glues text and variables together. Where do the spaces go?

### Step 2 — Fix the bugs

Under `STEP 2` there are three broken lines, inside a `/* ... */` comment so they don't
stop your program from running. One at a time:

1. Move **one** broken line up, above the `/*` line. Now Java can see it.
2. Read the **red error**. What is Java telling you?
3. Fix the line. Run the program.
4. Do the next line.

| Broken line | The error Java gives you |
|---|---|
| `int fuel = 87.5;` | `incompatible types: possible lossy conversion from double to int` |
| `char grade = "C";` | `incompatible types: String cannot be converted to char` |
| `System.out.println(Battery);` | `cannot find symbol` and, under it, `symbol: variable Battery` |

When all three are fixed, your program prints one more line under the report: `75`.

### ✅ Commit the in-class exercise

```bash
git add -A
git commit -m "part02 in-class: rover dashboard"
```

---

## Section B — Comment every line (25 points)

*On your own.*

Now explain your own code. In `Variables.java`, put a `//` comment **above every line of
code**, saying **in your own words** what that line does.

**Which lines need a comment?**

- **Yes:** every line that does something. That includes `public class Variables`,
  `public static void main(...)`, every line that makes a variable, and every
  `System.out...` line.
- **No:** lines that are only `}`, and empty lines.

**What makes a good comment?** Say what the line **does** and **why**. For variables, say
**what type** it is and **why that type** fits the value. Do not just repeat the code in
English.

| ❌ Not enough | ✅ Good |
|---|---|
| `// int x` | `// makes a box called x that can only hold whole numbers, no decimals` |
| `// x = 123` | `// puts 123 into x. This is called assignment` |
| `// prints x` | `// prints 123, the value inside x, because x has no quotes around it` |
| `// long` | `// a long can hold numbers too big for an int. The L at the end tells Java it's a long` |
| `// char` | `// a char holds exactly one character, in single quotes` |

Here is what a commented line looks like in your file:

```java
        // join the text and the value of name with +, so it prints Hello and then my name
        System.out.println("Hello " + name);
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
git commit -m "part02 comments: explained every line of the follow-along code"
```

---

## Section C — Stretch (25 points)

*On your own.*

Do these in `Stretch.java`. There is no `main` in that file yet. **Type it yourself.**

### Stretch A — guess first

1. Type this code inside `main`. **Do not run it yet.**

```java
int a = 7;
double b = 7;
System.out.println(a);
System.out.println(b);
System.out.println("a + b");
System.out.println("a: " + a);
System.out.println("" + a + a);
System.out.println(a + a + "!");
char c = 'A';
System.out.println(c);
boolean on = true;
System.out.println(on);
```

2. **Above that code**, write what you think each line will print. Put your guess inside a
   comment, like this:

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
7.0
a + b
a: 7
77
14!
A
true
```

- `b` is a `double`, so it always shows a decimal: `7.0`.
- `"a + b"` is in quotes, so it prints those exact characters. No math happens.
- `"" + a + a` starts with text, so Java **joins** them: `7` then `7` makes `77`.
- `a + a + "!"` starts with two numbers, so Java **adds** them first: `14`. Then it joins
  the `!`.

</details>

### Stretch B — use your variables

Put this code under your Stretch A code, in the same `main`.

**B1.** Make four variables about yourself — a `String`, an `int`, a `double` and a
`boolean` — and print each one on its own line, with a label:

```
Name: Jordan Smith
Age: 19
GPA: 3.4
Commuter: false
```

Keep it short: four variables, four `println` lines. **The next part's warm-up is this B1, from
memory.**

**B2.** Make **five** new variables, one of each of these types: `char`, `int`, `double`,
`boolean`, `String`. Then print **one** sentence that uses all five, joined with `+`. For
example:

```
J takes 4 classes in Computer Science, for 15.5 credit hours. Has a job: true
```

**B3.** This code has **four** mistakes. Type it exactly as it is, look at the red
underlines, and fix all four. Then run it.

```java
string city = "Dover";
long people = 4000000000;
char grade = "B";
float temp = 72.5;
System.out.println(city + " " + people + " " + grade + " " + temp);
```

If you click ▶ before all four are fixed, Java may tell you about only **one** mistake at a
time. Fix that one, and run again.

When it is fixed, it prints:

```
Dover 4000000000 B 72.5
```

Above each line you fixed, write a comment that says what was wrong.

### ✅ Commit Section C

```bash
git add -A
git commit -m "part02 stretch: prediction, profile, and bug fixes"
```

---

## Section D — Challenge (25 points)

*On your own.*

Do this in `Challenge.java`. Type `main` yourself again.

**Make a character card for a video game hero.** It can be any character you want: a
knight, a race car, a dragon, a basketball player. Your program must follow **all** of
these rules:

1. Above the line `public class Challenge`, a **multi-line comment** (`/*` ... `*/`) with
   your name and what your character is.
2. **At least 7 variables**, using **all** of these types at least once: `String`, `int`,
   `long`, `double`, `float`, `boolean`, `char`.
3. The `long` ends with `L`, and the `float` ends with `f`.
4. **At least one** variable is made in **two steps**: declared on one line
   (`String name;`), then assigned on the next line (`name = "Shadow Knight";`).
5. Prints a title line, then **one line per variable**, with a label.
6. Uses **`\t`** (from part 01) to line up the values.

Here is an example. **Make your own. Do not copy this one.**

```
===== CHARACTER CARD =====
Name:   Shadow Knight
Level:  12
Gold:   5000000000
Health: 87.5
Speed:  4.25
Flies:  false
Rank:   S
```

### ✅ Commit Section D

```bash
git add -A
git commit -m "part02 challenge: character card with every data type"
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
a1b2c3d part02 challenge: character card with every data type
e4f5a6b part02 stretch: prediction, profile, and bug fixes
c7d8e9f part02 comments: explained every line of the follow-along code
9d8c7b6 part02 in-class: rover dashboard
0a1b2c3 part02 follow-along: variables and data types
```

*(The letters and numbers at the start will be different for you. That is normal.)*
Press `q` to get out of the list.

**Missing one?** That section gets **0** right now. Go back, finish it, and make its
commit. You have until the next lecture starts.

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from the table, and add `--allow-empty` so Git lets you commit without
changing a file:

```bash
git commit --allow-empty -m "part02 comments: explained every line of the follow-along code"
```

### 3. Push

```bash
git add -A
git commit -m "part02 log"
git push
```

### 4. Check GitHub

Go to your fork on GitHub (`github.com/your-username/FollowAlong1-Basics`). Click the
**commits** link (clock icon) above the file list. **All of this part's commits must be
there.** If they are on your laptop but not on GitHub, you did not push, and I cannot see
them.

> **No commit, no credit.** A section with no commit gets 0. A commit that is not pushed
> before the next lecture starts does not count.

**Next part's warm-up:** retype your Stretch B1 (the four variables about you) from memory.

**Finished early? Start Part 03.** You don't have to wait for class.

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

- **Think Java** (free online book): [Chapter 2 — Variables and Operators](https://books.trinket.io/thinkjava2/chapter2.html).
  Read the parts about declaring variables, assignment, and printing variables.
- **Tutoring:** bring your laptop and this page.
- **Office hours:** bring the error message and tell me what you already tried.
- **Classmates:** talk it over as much as you want. But **type your own code.**
