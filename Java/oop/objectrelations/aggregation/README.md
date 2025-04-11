# Aggregation in Java

## Concept
Aggregation is a `has-a` relationship where one class keeps a reference to another class, but does not own its lifecycle.
The dependent object is created outside and then linked to the container.

## Main Properties
- `has-a` relation with weak ownership
- child object survives independently of container
- object sharing is possible across multiple containers
- usually leads to looser coupling than composition

## Code Signal
The parent receives an already-created object:
```java
this.professor = professor;
```

## Examples in This Folder
1. `Demo.java`:
- Simple aggregation using `Team` and reusable `Player`.

2. `AggregationDemo.java`:
- `University` aggregates `Professor` objects.
- Professors can still be used directly outside `University`.

3. `InterfaceAggregationDemo.java`:
- `UniversityFlexible` aggregates `Teachable` references.
- Demonstrates interchangeable implementations (`Professor`, `GuestLecturer`).

## Aggregation vs Composition
| Aspect | Aggregation | Composition |
|---|---|---|
| Ownership | Weak (reference only) | Strong (owner controls part) |
| Object creation | Typically external | Typically internal |
| Child lifecycle | Independent | Dependent on parent |
| Reuse across parents | Common | Usually limited |

## When Aggregation Fits
- shared entities across modules
- service/plugin style design
- domain models where part should outlive container

## Run
```bash
javac src/oops/objectrelations/aggregation/*.java
java -cp src oops.objectrelations.aggregation.Demo
java -cp src oops.objectrelations.aggregation.AggregationDemo
java -cp src oops.objectrelations.aggregation.InterfaceAggregationDemo
```
# backdated commit 2026-05-05 #15
# backdated commit 2026-05-11 #9
# backdated commit 2026-05-18 #10
# backdated commit 2026-05-18 #17
# backdated commit 2026-05-19 #4
# backdated edit 2026-05-04 #1
# resumed backdated edit 2026-05-07 #10
# resumed backdated edit 2026-05-08 #16
# resumed backdated edit 2026-05-13 #16
# resumed backdated edit 2026-05-15 #7
# resumed backdated edit 2026-05-19 #3
# resumed backdated edit 2026-05-07 #10
# resumed backdated edit 2026-05-08 #16
# resumed backdated edit 2026-05-13 #16
# resumed backdated edit 2026-05-15 #7
# resumed backdated edit 2026-05-19 #3
