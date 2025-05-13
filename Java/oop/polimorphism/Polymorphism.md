# Polymorphism in Java

## Quick Idea
Polymorphism means one method name or one parent/interface reference can represent different behaviors.
It helps you design code that is easier to extend.

## Main Types
1. **Compile-time polymorphism** (method overloading)
2. **Run-time polymorphism** (method overriding)

## 1) Compile-Time Polymorphism
In overloading, methods share a name but differ in parameters.
The compiler decides the correct method during compilation.

Example pattern:
- `multiply(int, int)`
- `multiply(int, int, int)`
- `multiply(double, double)`

Why useful:
- clean API with one method name for related operations
- less naming clutter

## 2) Run-Time Polymorphism
In overriding, child classes provide their own version of a parent method.
When a parent reference points to different child objects, Java picks the method at runtime.

Example pattern:
- Parent: `Notification.send()`
- Children: `EmailNotification`, `SmsNotification`, `AppPushNotification`

Why useful:
- easy to add new behavior without changing old caller logic
- supports extensible architecture

## Interfaces and Polymorphism
Interfaces are heavily used for polymorphism. A single interface type can point to many implementations.
This is common in payment modules, logging, storage drivers, and strategy patterns.

## Folder Structure in This Project
- `compile/` -> overloading example
- `runtime/` -> overriding example

## Practical Benefit
When new requirements come, you often add a new class instead of editing existing stable code. That lowers risk and improves maintainability.
# backdated commit 2026-05-01 #9
# backdated commit 2026-05-18 #9
# backdated commit 2026-05-20 #14
# backdated commit 2026-05-20 #15
# backdated commit 2026-05-21 #3
# resumed backdated edit 2026-05-15 #1
# resumed backdated edit 2026-05-15 #1
