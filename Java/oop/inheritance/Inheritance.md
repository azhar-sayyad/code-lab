# Inheritance in OOP (Java)

## Introduction
Inheritance is an OOP feature where one class can reuse fields and methods from another class.  
The class being reused is called the **parent/superclass**, and the class reusing it is the **child/subclass**.

It helps you avoid repeating the same code in multiple places.

This folder contains separate examples for each inheritance type.

## Folder Map
- `single/` - Single inheritance (`Car extends Vehicle`)
- `multilevel/` - Multilevel inheritance (`Dog extends Animal extends LivingThing`)
- `hierarchical/` - Hierarchical inheritance (`Developer` and `Designer` extend `Employee`)
- `multiple/` - Multiple inheritance style in Java using interfaces (`SmartPhone implements Camera, MusicPlayer`)
- `diamond/` - Diamond scenario via interfaces and default method conflict resolution

## Notes
- Java does not support multiple inheritance of classes.
- Multiple and diamond patterns are handled using interfaces.

## What Inheritance Gives You
- Reuse of common behavior
- Cleaner and shorter code
- Easy extension of existing classes
- Better organization of related classes

## Basic Syntax in Java
Use the `extends` keyword:

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is moving");
    }
}
```

## Example 1: Parent + Child
```java
class Person {
    String name;

    void introduce() {
        System.out.println("Hi, I am " + name);
    }
}

class Student extends Person {
    int marks;

    void showMarks() {
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ayaan";      // inherited field
        s.marks = 92;          // child field
        s.introduce();         // inherited method
        s.showMarks();         // child method
    }
}
```

Expected output:
```text
Hi, I am Ayaan
Marks: 92
```

## Types of Inheritance in Java
1. **Single Inheritance**: One child from one parent.
2. **Multilevel Inheritance**: A chain like `A -> B -> C`.
3. **Hierarchical Inheritance**: Multiple child classes from one parent.

Java classes do **not** support multiple inheritance directly (one class cannot extend two classes).

## Method Overriding
A child class can replace parent behavior by redefining the same method.

```java
class Notification {
    void send() {
        System.out.println("Sending generic notification");
    }
}

class EmailNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending email notification");
    }
}
```

## `super` Keyword
`super` is used inside a child class to access parent constructor, method, or field.

```java
class Device {
    Device() {
        System.out.println("Device created");
    }

    void powerOn() {
        System.out.println("Device power on");
    }
}

class Laptop extends Device {
    Laptop() {
        super(); // calls Device constructor
        System.out.println("Laptop ready");
    }

    @Override
    void powerOn() {
        super.powerOn(); // calls parent method first
        System.out.println("Laptop boot sequence");
    }
}
```

Expected output:
```text
Device created
Laptop ready
Device power on
Laptop boot sequence
```

## Relation to Your Current Code
Your files (`Parent`, `Child`, `GrandChild`) already demonstrate:
- Single inheritance (`Child extends Parent`)
- Multilevel inheritance (`GrandChild extends Child`)

That is a good practical start for understanding inheritance in Java.
# backdated commit 2026-05-08 #3
# backdated commit 2026-05-12 #6
# backdated commit 2026-05-15 #5
# backdated commit 2026-05-18 #16
# backdated commit 2026-05-19 #8
# backdated commit 2026-05-19 #15
# backdated commit 2026-05-19 #17
# backdated commit 2026-05-21 #16
# resumed backdated edit 2026-05-07 #3
# resumed backdated edit 2026-05-08 #4
# resumed backdated edit 2026-05-08 #6
# resumed backdated edit 2026-05-20 #16
# resumed backdated edit 2026-05-07 #3
# resumed backdated edit 2026-05-08 #4
# resumed backdated edit 2026-05-08 #6
# resumed backdated edit 2026-05-20 #16
