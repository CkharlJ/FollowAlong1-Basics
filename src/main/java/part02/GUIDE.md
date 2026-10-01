# Part 02 Guide — Variables

**The video, written out step by step.**

This page teaches the same thing as the video from **22:20 to 35:00**. You can:

- **read this page instead of watching**, or
- **read it while you watch**, or
- **come back to it** when you forget how something works.

Either way, **you still type every line into `Variables.java` yourself.** Do not copy and
paste from this page. Each step has a time, like **(video 29:03)**, if you want to see him
do it.

---

## Step 1 — What is a variable? (video 22:20)

A **variable** is a name that holds a value. Think of it as a labeled box. You put a value
in the box, and from then on the name **acts like** the value inside it.

You have seen this in algebra: if `x = 5`, then `x + 1` is `6`. Java works the same way,
but a variable can hold more than numbers. It can hold a word, a whole sentence, or
`true`/`false`.

**The catch:** in Java, you must say **what kind** of value the box holds. That is called
the variable's **data type**.

---

## Step 2 — The data types (video 23:20)

There are **eight primitive data types**, plus one special one, `String`. The ones with a
⭐ are the ones you will use most.

| Type | What it holds | Example |
|---|---|---|
| ⭐ `boolean` | only `true` or `false` | `true` |
| `byte` | a small whole number, −128 to 127 | `100` |
| `short` | a whole number, about −32,000 to 32,000 | `30000` |
| ⭐ `int` | a whole number, about −2 billion to 2 billion | `123` |
| `long` | a **very** big whole number. Needs an `L` at the end | `3000000000L` |
| `float` | a decimal number, about 6–7 digits. Needs an `f` at the end | `3.14f` |
| ⭐ `double` | a decimal number, about 15 digits | `3.14159265358979` |
| ⭐ `char` | exactly **one** character, in **single** quotes | `'@'` |
| ⭐ `String` | text: a word or a sentence, in **double** quotes | `"Hello"` |

**Whole numbers vs decimals:** `byte`, `short`, `int` and `long` **cannot** hold a
decimal part. For a number like `3.14`, use `double` (or `float`).

**Why does `String` start with a capital S?** The eight primitive types (`int`, `double`,
`char`, …) are built into Java and start with a lowercase letter. `String` is a different
kind of type, called a **reference type**, and those start with a capital letter. We learn
more about reference types later.

---

## Step 3 — Three ways to talk about making a variable (video 27:49)

| Name | What it means | Example |
|---|---|---|
| **Declaration** | Make the box: say the type and the name | `int x;` |
| **Assignment** | Put a value in the box with `=` | `x = 123;` |
| **Initialization** | Do both at once | `int x = 123;` |

Every one of these lines ends with a `;`.

---

## Step 4 — Your first variable (video 29:03)

Open `part02/Variables.java`. First, type `main` inside the class's `{ }`, the same way you
did in part 01:

```java
    public static void main(String[] args) {

    }
```

Now, inside `main`, **declare** an `int` called `x`, then **assign** it `123`:

```java
        int x;
        x = 123;
```

Then print it. **No quotes** around `x`:

```java
        System.out.println(x);
```

**Run it.** Output:

```
123
```

The variable acts like the value inside it, so printing `x` prints `123`.

> You could also write `int x = 123;` on one line. That is **initialization**: declaring
> and assigning at the same time. Both ways work. Pick one — if you write both, you get
> `variable x is already defined`.

---

## Step 5 — Quotes or no quotes? (video 29:50)

Change the print line so `x` has quotes around it:

```java
        System.out.println("x");
```

**Run it.** Output:

```
x
```

With quotes, Java prints the **text** `x`. That is called a **string literal**: text typed
right into the code. Without quotes, Java prints the **value inside** the variable `x`.

Change it back to `System.out.println(x);` before you go on, or keep both lines.

---

## Step 6 — Text plus a variable (video 30:17)

You can join text and a variable with `+`. This is called **concatenation**.

```java
        System.out.println("My number is " + x);
```

**Run it.** Output:

```
My number is 123
```

Notice the **space** at the end of `"My number is "`, inside the quotes. Without it, you
get `My number is123`.

---

## Step 7 — `long` and `byte` (video 30:51)

An `int` can only go up to about 2 billion. For bigger numbers, use a `long`. **Put an `L`
at the end of the number.** (He uses his student debt as the example of a huge number.)

```java
        long debt = 3000000000L;
        System.out.println(debt);
```

Output:

```
3000000000
```

Forget the `L`, and you get:

```
error: integer number too large
```

**`byte` (video 31:34)** only holds −128 to 127:

```java
        byte b = 100;
        System.out.println(b);
```

Output: `100`. Try `130` instead, and you get:

```
error: incompatible types: possible lossy conversion from int to byte
```

"Lossy" means some of the number would be lost. Change it back to `100`.

He says beginners mostly use `int`, sometimes `long`, and rarely `byte` or `short`.

---

## Step 8 — Decimals: `float` and `double` (video 32:00)

An `int` cannot hold a decimal. Try `int x = 23.1;` and you get:

```
error: incompatible types: possible lossy conversion from double to int
```

**`float` (video 32:28).** Put an `f` at the end of the number:

```java
        float y = 3.14f;
        System.out.println(y);
```

Output: `3.14`. Forget the `f`, and you get:

```
error: incompatible types: possible lossy conversion from double to float
```

**`double`.** More precise, and no `f` needed. Most people use `double`:

```java
        double y2 = 3.14;
        System.out.println(y2);
```

Output: `3.14`.

> He changes `float y` into `double y` on the same line. If you keep the `float` line
> instead, give the `double` a different name, like `y2`.

---

## Step 9 — `boolean` and `char` (video 33:06)

A `boolean` holds only `true` or `false`:

```java
        boolean z = true;
        System.out.println(z);
```

Output: `true`. Try `boolean z = pizza;` and you get `error: cannot find symbol`. A
`boolean` cannot hold a word.

**`char` (video 33:46).** One character, in **single** quotes. The name does not have to be
one letter. He calls this one `symbol`:

```java
        char symbol = '@';
        System.out.println(symbol);
```

Output: `@`. Use double quotes by mistake (`"@"`), and you get:

```
error: incompatible types: String cannot be converted to char
```

---

## Step 10 — `String` (video 34:08)

A `String` holds text, in **double** quotes. **Capital S.**

```java
        String name = "Bro";
        System.out.println("Hello " + name);
```

**Run it.** Output:

```
Hello Bro
```

Put your own name in. Type `string` with a lowercase s, and you get
`error: cannot find symbol`.

That's the end of the video section. He says *"that is everything you need to know to get
started with variables in Java."*

---

## Your finished program

Your `Variables.java` should look something like this now. Your values can be different.
**Compare it to yours. Do not copy it.**

<details>
<summary>Click to compare</summary>

```java
package part02;

// (the comments at the top of your file)

public class Variables {
    public static void main(String[] args) {
        int x;
        x = 123;
        System.out.println(x);
        System.out.println("x");
        System.out.println("My number is " + x);

        long debt = 3000000000L;
        System.out.println(debt);

        byte b = 100;
        System.out.println(b);

        float y = 3.14f;
        System.out.println(y);
        double y2 = 3.14;
        System.out.println(y2);

        boolean z = true;
        System.out.println(z);

        char symbol = '@';
        System.out.println(symbol);

        String name = "Bro";
        System.out.println("Hello " + name);
    }
}
```

Output:

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

</details>

---

**Now go back to [README.md](README.md).** Make your Section A commit. Then do Section B:
put a comment above every line, **in your own words**. Do not copy the explanations from
this guide.
