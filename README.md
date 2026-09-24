# Program Assignment 1: Employee Salary Increase

**Due:** October 8, 2026 at 11:59 PM

## Deliverables

You must submit two items:

1.  **Algorithm Design Report**
    -   Submit through the Blackboard Ultra submission box.
    -   **Important:** You must use the same report format used in
        class.
2.  **Code Submission**
    -   Submit the GitHub repository link through Blackboard Ultra.

------------------------------------------------------------------------

# Overview

Certain employees in a company, Company, Inc., are being considered for
a special pay increase.

You are provided with an input file named:

``` text
EmpData.txt
```

The file contains information about an employee:

1.  Last name
2.  First name
3.  Current salary
4.  Percentage pay increase

The data is organized as follows:

``` text
Miller Andrew 65789.87 5
```

For example:

-   **Last name:** Miller
-   **First name:** Andrew
-   **Current salary:** \$65,789.87
-   **Pay increase:** 5%

Company, Inc., wants to see the employees' new salary based on the
percentage pay increase.

## Sample Expected Output

``` text
Employee name: Miller, Andrew
Current salary: $65789.87
% pay rise: 5%
==== New salary amount: $69079.36
```

------------------------------------------------------------------------

# GitHub and IntelliJ IDEA Workflow

For this assignment, you will use the following workflow:

``` text
Fork → Clone → IntelliJ → Code → Test → Commit → Push
```

> **Important:** You should work in **your own fork** of the
> instructor's repository. Do not push your assignment directly to the
> instructor's repository.

## Step 1: Fork the Instructor Repository

1.  Open the GitHub repository link provided by your instructor.
2.  Make sure you are signed in to your GitHub account.
3.  Click **Fork** near the top-right of the repository page.
4.  Select your GitHub account as the destination.
5.  Click **Create fork**.

GitHub will create your own copy of the instructor's repository.

Your fork should have a URL similar to:

``` text
https://github.com/YourUsername/RepositoryName
```

### Verify Your Fork

Before continuing, make sure the repository belongs to **your GitHub
account**.

You should be working in:

``` text
YourUsername/RepositoryName
```

and **not**:

``` text
InstructorUsername/RepositoryName
```

------------------------------------------------------------------------

# Step 2: Clone Your Fork

After creating your fork, clone **your fork**, not the instructor's
repository.

1.  Open your fork on GitHub.
2.  Click **Code**.
3.  Select **HTTPS**.
4.  Copy the repository URL.

It should look similar to:

``` text
https://github.com/YourUsername/RepositoryName.git
```

------------------------------------------------------------------------

# Step 3: Open the Repository in IntelliJ IDEA

1.  Open **IntelliJ IDEA**.
2.  From the Welcome screen, select **Clone Repository**.

If you already have a project open:

1.  Select **File**.

2.  Select **New**.

3.  Select **Project from Version Control**.

4.  Select **Git** if necessary.

5.  Paste the URL for **your fork**.

6.  Choose where you want to store the project on your computer.

7.  Click **Clone**.

For example:

``` text
https://github.com/YourUsername/RepositoryName.git
```

> **Important:** Confirm that the URL contains your GitHub username
> before clicking Clone.

------------------------------------------------------------------------

# Step 4: Open and Verify the Project

After cloning:

1.  Allow IntelliJ IDEA to open the project.
2.  If IntelliJ asks whether you trust the project, select **Trust
    Project** when appropriate.
3.  Allow IntelliJ to finish loading and indexing the project.

You should see the instructor-provided starter files.

Your project may look similar to:

``` text
RepositoryName/
├── README.md
├── EmpData.txt
└── src/
    └── ...
```

The exact file structure may vary depending on the instructor-provided
starter code.

------------------------------------------------------------------------

# Step 5: Use the Instructor-Provided Starter Code

Your program **must use the instructor-provided starter code**.

You must also:

-   Maintain the basic `JOptionPane` design.
-   Make your changes within the provided project structure.
-   Do not replace the starter design with a completely different
    program structure.

The assignment specifically requires the use of the instructor-provided
starter code and the basic `JOptionPane` design.

------------------------------------------------------------------------

# Program Requirements

Your program must:

1.  Use the instructor-provided starter code.
2.  Maintain the basic `JOptionPane` design.
3.  Read employee information from `EmpData.txt`.
4.  Process the employee name.
5.  Calculate the employee's new salary.
6.  Write the results to `EmpDataOutput.dat` using the required output
    format.
7.  Format monetary values to two decimal places.
8.  Display appropriate information to the user through the provided
    `JOptionPane` interface.

The `JOptionPane` output interface must mirror the same output format
described in the sample output.

------------------------------------------------------------------------

# Input File

Your program should read employee information from:

``` text
EmpData.txt
```

Each employee record contains:

``` text
LastName FirstName CurrentSalary PercentageIncrease
```

Example:

``` text
Miller Andrew 65789.87 5
```

------------------------------------------------------------------------

# Output File

Your program must create:

``` text
EmpDataOutput.dat
```

The output must contain the required employee information and the
calculated new salary.

Monetary values must be formatted to **two decimal places**.

------------------------------------------------------------------------

# Salary Calculation

For each employee, calculate the new salary using the employee's current
salary and percentage pay increase.

For example:

``` text
Current salary = 65789.87
Pay increase = 5%
```

The resulting new salary should be:

``` text
69079.36
```

Your program should perform this calculation for every employee
contained in the input file.

------------------------------------------------------------------------

# Testing Your Program

After implementing your solution, test your program using the provided
input data.

Verify that:

-   [ ] All tested employees are processed.
-   [ ] Employee names are displayed correctly.
-   [ ] Current salaries are read correctly.
-   [ ] Percentage increases are interpreted correctly.
-   [ ] New salaries are calculated correctly.
-   [ ] Monetary values contain two decimal places.
-   [ ] The output file is created.
-   [ ] The output contains the required information.
-   [ ] The program terminates normally without errors.

------------------------------------------------------------------------

# Required Test Data

Test your program using the following employee records:

``` text
Miller Andrew 65789.87 5
Green Sheila 75892.56 6
Sethi Amit 74900.50 6.1
```

Make sure that **all three employees** are processed correctly.

------------------------------------------------------------------------

# Testing in IntelliJ IDEA

1.  Open the provided Java program in IntelliJ IDEA.
2.  Make sure `EmpData.txt` is available in the expected project
    location.
3.  Run the program using the green **Run ▶** button.
4.  Enter any information requested by the provided `JOptionPane`
    interface.
5.  Verify the displayed results.
6.  Check that `EmpDataOutput.dat` is created.
7.  Open or inspect the output file to verify that the required
    information was written correctly.
8.  Repeat testing as needed until the program runs normally without
    errors.

------------------------------------------------------------------------

# Commit Your Work

After your program has been completed and tested, save your changes.

In IntelliJ IDEA:

1.  Select **Git**.
2.  Select **Commit**.
3.  Review the files that have changed.
4.  Enter a meaningful commit message.

For example:

``` text
Complete Program Assignment 1
```

5.  Click **Commit**.

------------------------------------------------------------------------

# Push Your Work to GitHub

After committing your changes:

1.  Select **Git**.
2.  Select **Push**.
3.  Verify that the destination is **your GitHub fork**.
4.  Click **Push**.

Your workflow should be:

``` text
IntelliJ IDEA
     |
     | Commit
     v
Local Git Repository
     |
     | Push
     v
Your GitHub Fork
```

> **Do not push to the instructor's repository.**

------------------------------------------------------------------------

# Verify Your GitHub Submission

Open your GitHub repository in a web browser.

Verify that:

-   Your completed Java source code is present.
-   Your latest commit appears in the repository.
-   Your changes have been pushed successfully.
-   The required starter files remain in the repository.
-   Your program files are available for your instructor to review.

Your repository should be similar to:

``` text
YourUsername/RepositoryName
│
├── README.md
├── EmpData.txt
├── EmpDataOutput.dat
└── src/
    └── [your Java source files]
```

The exact project structure may vary based on the instructor-provided
starter code.

------------------------------------------------------------------------

# Understanding Your GitHub Workflow

The complete workflow for this assignment is:

``` text
Instructor GitHub Repository
            |
            | FORK
            v
Your GitHub Repository
        (Your Fork)
            |
            | CLONE
            v
Your Computer
     IntelliJ IDEA
            |
            | CODE
            v
    Run & Test Program
            |
            | COMMIT
            v
  Local Git Repository
            |
            | PUSH
            v
Your GitHub Repository
      (Updated Fork)
```

## Remember

**Fork → Clone → IntelliJ → Code → Test → Commit → Push**

------------------------------------------------------------------------

# Important: Do Not Push to the Instructor Repository

### Correct Workflow

``` text
Instructor Repository
        |
       FORK
        |
        v
Your Repository
        |
      CLONE
        |
        v
     IntelliJ
        |
       CODE
        |
       TEST
        |
     COMMIT
        |
       PUSH
        |
        v
Your Repository
```

### Incorrect Workflow

``` text
Instructor Repository
        |
      CLONE
        |
        v
     IntelliJ
        |
       CODE
        |
       PUSH
        |
        v
Instructor Repository
```

Always make sure you are pushing to **your own fork**.

------------------------------------------------------------------------

# Submission Checklist

## Algorithm Design Report

-   [ ] Algorithm design report completed.
-   [ ] The required class report format was used.
-   [ ] Report submitted through the Blackboard Ultra submission box.

## Java Program

-   [ ] Instructor-provided starter code used.
-   [ ] Basic `JOptionPane` design maintained.
-   [ ] `EmpData.txt` read correctly.
-   [ ] Employee names processed correctly.
-   [ ] Current salaries read correctly.
-   [ ] Percentage increases interpreted correctly.
-   [ ] New salaries calculated correctly.
-   [ ] Monetary values formatted to two decimal places.
-   [ ] `EmpDataOutput.dat` created.
-   [ ] Required output information written to the output file.
-   [ ] `JOptionPane` output mirrors the required output format.
-   [ ] All three required test records processed.
-   [ ] Program terminates normally without errors.

## GitHub

-   [ ] Instructor repository forked.
-   [ ] My fork was cloned.
-   [ ] Project opened in IntelliJ IDEA.
-   [ ] Changes committed.
-   [ ] Changes pushed to my GitHub fork.
-   [ ] GitHub repository verified.
-   [ ] GitHub repository link submitted through Blackboard Ultra.

------------------------------------------------------------------------

# Final Reminder

Before submitting, make sure you can trace your work through this
workflow:

``` text
FORK
  ↓
CLONE
  ↓
INTELLIJ
  ↓
CODE
  ↓
TEST
  ↓
COMMIT
  ↓
PUSH
  ↓
VERIFY ON GITHUB
  ↓
SUBMIT GITHUB LINK ON BLACKBOARD
```

Your **algorithm design report** is submitted through Blackboard Ultra,
while your **code submission** is submitted through the GitHub link
shared on Blackboard Ultra.
