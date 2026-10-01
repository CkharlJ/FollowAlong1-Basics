# Part 00 — Setup

**We do this together in class · about 40 minutes · No AI**

There is no new Java in this part. You set up the project you will use for **all 20
parts.** You also hand it in once, so that from now on, handing in takes
a few short commands.

There are **7 steps**. Do them in order. Each step ends with a **✅ Check**.
**Do not start the next step until the check works.** If it does not work, ask for help
now, while we are all together.

---

## Step 1 — Make your own copy on GitHub (a "fork")

You **cannot** change my repo. A **fork** is your own copy of it, on GitHub. You can change
your fork, and I can see it. **Without a fork, you have no way to hand in work.**

1. Go to **github.com/DSU-CSCI-121-F26/FollowAlong1-Basics**.
2. Click **Fork** (top right of the page).
3. Click **Create fork**.
4. On your new fork, click the **Actions** tab.
5. Click the green button **I understand my workflows, go ahead and enable them.**
   (This turns on the automatic check you will see later. If you skip it, the check never
   shows up.)

**✅ Check:** Look at the top left of the page. It should say
`your-username / FollowAlong1-Basics`, and under it, in small letters,
*forked from DSU-CSCI-121-F26/FollowAlong1-Basics*.

If it says `DSU-CSCI-121-F26 / FollowAlong1-Basics` at the top, you are still on **my** repo.
Go back and click **Fork** again.

---

## Step 2 — Download your copy to your laptop

Open a **terminal** (on Mac: the Terminal app; on Windows: Git Bash). Type these four
lines, one at a time. Press Enter after each one.

```bash
git clone https://github.com/YOUR-USERNAME/FollowAlong1-Basics.git
cd FollowAlong1-Basics
git remote add upstream https://github.com/DSU-CSCI-121-F26/FollowAlong1-Basics.git
git remote -v
```

In the **first line only**, replace `YOUR-USERNAME` with your GitHub username.

What each line does:

1. `git clone` downloads **your fork** to your laptop.
2. `cd` moves into the new folder.
3. `git remote add upstream` connects your folder to **my** repo, so you can get each new
   part. Type this line exactly as shown. **Do not** put your username in it.
4. `git remote -v` shows where your folder is connected.

**✅ Check:** The last command prints **four lines**.

- The two lines that start with `origin` show **your username**.
- The two lines that start with `upstream` show `DSU-CSCI-121-F26`.

If the `origin` lines say `DSU-CSCI-121-F26`, you downloaded my repo instead of your fork.
Delete the `FollowAlong1-Basics` folder and start again at Step 1.

---

## Step 3 — Open the project in IntelliJ

1. In IntelliJ, click **File → Open**.
2. Choose the `FollowAlong1-Basics` folder you just downloaded.
3. If IntelliJ asks, click **Trust Project**.

**If IntelliJ says the "JDK" is missing or "misconfigured":** The JDK is the part that runs
Java. Click **Setup SDK** and choose any version **21 or higher**. If there are none to
choose, click **Download JDK**, pick version **21**, and click **Download**. Wait until the
progress bar at the bottom of the screen finishes.

**✅ Check:** In the Project panel on the left, open
`src` → `main` → `java` → `part00` → `Main`. On the left edge of the code, next to the line
`public static void main`, there is a **green ▶**.

**No green ▶?** Right-click `pom.xml` (near the bottom of the Project panel) →
**Maven** → **Reload project**. Wait a few seconds and look again.

---

## Step 4 — Turn off the autocomplete and the AI

Normally, IntelliJ writes code for you while you type:

- **Grey text** appears ahead of your cursor, guessing what comes next.
- **A list pops up** while you type, so you can pick instead of typing.
- **Shortcuts** turn `sout` into `System.out.println`.

That helps people who already know Java. It stops **you** from learning it. And on a paper
test, none of it is there. So for all 20 parts, **your hands type every letter.**

This takes about 3 minutes. You only do it once.

**First, open Settings:**

- **Mac:** click **IntelliJ IDEA** in the menu bar at the top of the screen →
  **Settings…** (or press `⌘ ,`)
- **Windows:** click **File → Settings…** (or press `Ctrl Alt S`)

The Settings window has a **search box** at the top left. In each step below, you type
something into that box to find the right page.

### 4a · Turn off the AI plugins

1. Click **Plugins** on the left.
2. Click the **Installed** tab at the top.
3. Look for each plugin below. If you have it, **uncheck** its box. You might not have all
   of them. That is fine.

| Plugin | What it does |
|---|---|
| **JetBrains AI Assistant** | An AI chat, and grey text that writes code for you |
| **Junie** | An AI that writes code for you |
| **GitHub Copilot** | Grey text that writes code for you |
| **Full Line Code Completion** | Finishes whole lines for you. It comes with IntelliJ |

4. Click **OK**. If IntelliJ asks to **restart**, click yes.

### 4b · Stop the pop-up list

1. Open Settings again.
2. In the search box, type: `suggestions as you type`
3. **Uncheck** the box **Show suggestions as you type**.
4. Click **Apply**.

### 4c · Stop the grey text

1. In the search box, type: `inline completion`
2. **Uncheck every box** on that page.
3. Click **Apply**.

### 4d · Turn off the shortcuts

1. In the search box, type: `live templates`
2. On that page there is **a second search box**, just above the list. Type each word
   below into it, one at a time. Each time, **uncheck** the one that shows up:

   `sout` · `soutv` · `psvm` · `main` · `fori` · `iter`

3. Now go back to the **first** search box (top left) and type: `postfix`
4. **Uncheck** **Enable postfix completion**.
5. Click **Apply**.

### 4e · Type your own closing brackets and quotes

1. In the search box, type: `insert paired`
2. **Uncheck** **Insert paired brackets**.
3. **Uncheck** **Insert pair quote**.
4. Click **OK**.

Now when you type `{`, IntelliJ will **not** add the `}` for you. You type it. On a paper
test, nobody adds it for you either.

### ✅ Check — takes 20 seconds

Open `part00/Main.java`. Click on an empty line inside `main`. Try each of these:

| Type this | What should happen | If something else happens |
|---|---|---|
| `Sys`, then wait 2 seconds | **Nothing.** No list pops up | Do 4b again |
| `sout`, then press `Tab` | **Nothing.** It still says `sout` | Do 4d again |
| `String s = "` | You see **only one** `"` | Do 4e again |
| Any word, then wait | **No grey text** appears after your cursor | Do 4a and 4c again |

Now delete what you typed.

**Last part:** go back to **Settings → Plugins → Installed**. Take a **screenshot** that
shows the AI plugins unchecked. Save it as `plugins-off.png` inside the `part00` folder
(`src/main/java/part00/plugins-off.png`).

> **Is this on purpose, to make it harder?** Yes. But IntelliJ will still underline your
> mistakes in red. And if you click on a mistake and press `⌥ Enter` (Mac) or `Alt Enter`
> (Windows), it will still suggest a fix. You are turning off the part that **writes** your
> code. You are keeping the part that **checks** it.

---

## Step 5 — Run your first program

1. Open `part00/Main.java`.
2. Find the words `YOUR NAME`. Replace them with your real name. Keep the quote marks
   around it.
3. Click the **green ▶** next to `public static void main`. Choose **Run 'Main.main()'**.

The first time can take up to a minute.

**✅ Check:** The **Run** window at the bottom shows exactly this, but with your name:

```
=== Part 00 ===
Hello from Jordan Smith
If you can read this, your setup works.
```

> ⚠️ **Important from now on:** always run your code with the **▶ next to
> `main`**. **Do not** use the ▶ at the top of the IntelliJ window. The top one runs
> whatever you ran **last time**, which might be a different file.
>
> **Shortcut:** click inside the file, then press `Ctrl Shift R` (Mac) or `Ctrl Shift F10`
> (Windows). This runs the file you are looking at.

---

## Step 6 — Your first test: red, then green

Starting with **part 06**, each part's **challenge** is **two small problems** in a file called
`Challenge.java`. A **test** checks your answers for you.

- **Red ✗** means your answer is wrong.
- **Green ✔** means your answer is right.

You never write a test. You only run it and read what it says. Let's try one now, while
you can get help.

### 6a · Run the test (it will be red)

1. In the Project panel, open `src` → `test` → `java` → `part00` → `ChallengeTest`.
2. Click the **green ▶** next to `class ChallengeTest`. Choose **Run 'ChallengeTest'**.
3. The Run window shows **two red ✗**. That is expected. Click the one called
   `greetingJordan`. You will see:

```
expected: <Hello, Jordan!> but was: <>
```

This is how every test talks to you:

- **expected** is the right answer: `Hello, Jordan!`
- **but was** is what your code gave back. Right now, nothing: `<>`

### 6b · Fix the code

1. Open `src` → `main` → `java` → `part00` → `Challenge`.

   **Shortcut:** from the test file, press `⌘ ⇧ T` (Mac) or `Ctrl ⇧ T` (Windows) to jump
   straight to `Challenge.java`. Press it again to jump back.

2. Find the line that ends with `// YOUR CODE`. Change it to this:

```java
        return "Hello, " + name + "!";
```

**Type it. Do not copy and paste.** Watch for the comma, the space after the comma, and the
`!` at the end.

### 6c · Run the test again (now green)

Go back to `ChallengeTest.java`. Click the **green ▶** next to `class ChallengeTest` again.

**✅ Check:** Both tests show a **green ✔**, and the Run window says **Tests passed: 2**.

Still red? Click it and compare **expected** with **but was**. The difference is usually
one small thing, like a missing space or `!`.

---

## Step 7 — Hand it in: commit and push

You do not send me anything. No Canvas post, no link, no email. **A program I run checks
every fork of this repo and reads your commit messages.** That is how I see what you
finished, and when. So handing in is just two things: **commit** with the right message,
then **push**.

In the terminal (inside the `FollowAlong1-Basics` folder), type these three lines, one at a
time:

```bash
git add -A
git commit -m "part00 setup: tools ready and first test passing"
git push
```

What they do:

1. `git add -A` gets all your changed files ready to save.
2. `git commit -m "..."` saves a snapshot, with a message that says what you finished.
3. `git push` uploads it to your fork on GitHub. **Until you push, I cannot see it.**

**Type commit messages exactly as shown,** including the part number and the colon. Every
part's instructions give you the exact messages. If a message is different, my program will
not find it, and that part gets no credit.

**✅ Check:** Go to **your fork** on GitHub (`github.com/your-username/FollowAlong1-Basics`).
Near the top of the file list you see your latest commit message:
`part00 setup: tools ready and first test passing`. Click the **commits** link (it has a
clock icon and a number) to see all of them.

After a minute or two, a **green ✔** appears next to your commit. It only means your code
has no errors that stop it from compiling. A **red ✗** means something has a typo that
Java cannot understand. Click the ✗ to see which file.

---

## Next: Part 01

We start Part 01 together in class. In IntelliJ, open `part01` → `README.md`. Every part
after that works the same way.

The list of all 20 parts, and the class plan, is on the [main page](../../../../README.md).
