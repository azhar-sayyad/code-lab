# Encapsulation in Java

## Simple Definition
Encapsulation means keeping data and related behavior in one class, and controlling how outside code can read or change that data.

In practice, Java encapsulation is usually done with:
- `private` fields
- public methods (getters/setters or action methods)
- validation rules before updating state

## Why It Matters
- Protects object data from unsafe direct changes
- Keeps business rules in one place
- Makes classes easier to test and maintain
- Allows internal implementation changes without breaking other code

## Example 1: Student Profile (Validated Update)
```java
class StudentProfile {
    private String name;
    private int semester;

    public StudentProfile(String name, int semester) {
        this.name = name;
        setSemester(semester);
    }

    public String getName() {
        return name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        if (semester >= 1 && semester <= 8) {
            this.semester = semester;
        } else {
            System.out.println("Semester must be between 1 and 8.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        StudentProfile s = new StudentProfile("Riya", 3);
        System.out.println(s.getName() + " - Sem " + s.getSemester());
        s.setSemester(10); // invalid, blocked
        System.out.println("Current Sem: " + s.getSemester());
    }
}
```

Expected output:
```text
Riya - Sem 3
Semester must be between 1 and 8.
Current Sem: 3
```

## Example 2: Wallet with Controlled Operations
```java
class Wallet {
    private double balance;

    public Wallet(double openingBalance) {
        if (openingBalance >= 0) {
            balance = openingBalance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Amount should be positive.");
        }
    }

    public void spend(double amount) {
        if (amount <= 0) {
            System.out.println("Amount should be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
        }
    }
}
```

In this design, no external code can directly do `wallet.balance = -500;`, which keeps the object valid.

## Access Modifiers and Encapsulation
- `private`: Best for hiding fields
- `protected`: Useful when subclasses need controlled access
- `public`: Exposes only the safe operations

## Notes for Your `Capsule.java`
Your class already uses private fields with getters/setters, which is the core encapsulation pattern.  
If you also make `rollNo` private and update it through a method with validation, encapsulation becomes stronger.
# backdated commit 2026-05-04 #6
# backdated commit 2026-05-05 #12
# backdated commit 2026-05-15 #3
# backdated commit 2026-05-21 #7
# backdated commit 2026-05-21 #15
# backdated edit 2026-05-01 #6
# backdated edit 2026-05-06 #1
# resumed backdated edit 2026-05-07 #4
# resumed backdated edit 2026-05-14 #1
# resumed backdated edit 2026-05-14 #9
# resumed backdated edit 2026-05-07 #4
# resumed backdated edit 2026-05-14 #1
# resumed backdated edit 2026-05-14 #9
