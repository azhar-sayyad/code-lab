# Abstraction in Java

## Core Idea
Abstraction means exposing only what a class should do and hiding how it does it.
This keeps code simpler for users of the class.

Java mainly supports abstraction through:
1. `abstract` classes
2. `interface`

## Why Abstraction Helps
- Keeps implementation details isolated
- Makes code easier to extend
- Reduces coupling between modules
- Improves maintainability in large projects

## Abstract Class Approach
An abstract class can contain both:
- abstract methods (must be implemented by child classes)
- concrete methods (shared logic ready to use)

Use abstract classes when child classes share state/fields and partial behavior.

In this project:
- `abstract_class/Appliance.java` defines shared brand logic
- child classes provide their own `powerOn()` implementation

## Interface Approach
An interface defines a pure contract that implementations must follow.

Use interfaces when:
- unrelated classes need a common behavior contract
- you want flexible substitution of implementations

In this project:
- `interfaces/PaymentGateway.java` is the contract
- UPI, Card, and Net Banking classes provide different implementations

## Abstract Class vs Interface (Practical View)
- Choose abstract class for shared base code/state
- Choose interface for pluggable behavior across different class families

## Real Benefit
With abstraction, caller code depends on contracts (`Appliance`, `PaymentGateway`) instead of concrete classes. That makes change safer and faster.
# backdated commit 2026-05-04 #18
# backdated commit 2026-05-18 #7
