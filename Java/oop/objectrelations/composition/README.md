# Composition in Java

## Concept
Composition is a strong `has-a` relationship where the parent class owns and manages the part object.
The component is usually created inside the parent, so its lifecycle is tightly tied to that parent.

## Main Properties
- strong ownership
- component is not intended to be shared freely
- parent controls component initialization
- good for building complex objects from focused parts

## Code Signal
Internal creation inside the parent:
```java
this.engine = new EngineUnit(horsePower);
```

## Examples in This Folder
1. `Demo.java`:
- `SmartWatch` creates and owns `Battery`.

2. `CompositionDemo.java`:
- `Car` builds itself from internal `EngineUnit`, `WheelUnit`, and `TransmissionUnit`.

3. `InterfaceCompositionDemo.java`:
- `FlexibleCar` uses interface `PowerSource`.
- actual part type is chosen internally (`PetrolPowerSource` or `ElectricPowerSource`).

## Composition vs Inheritance
- Composition combines smaller objects.
- Inheritance extends behavior from a parent class hierarchy.
- Composition is often easier to evolve in large systems because parts can be changed with less hierarchy coupling.

## When Composition Fits
- parent cannot function without its parts
- part belongs exclusively to one parent object
- you want clear ownership and predictable lifecycle

## Run
```bash
javac src/oops/objectrelations/composition/*.java
java -cp src oops.objectrelations.composition.Demo
java -cp src oops.objectrelations.composition.CompositionDemo
java -cp src oops.objectrelations.composition.InterfaceCompositionDemo
```
# backdated commit 2026-05-04 #4
# backdated commit 2026-05-04 #16
# backdated commit 2026-05-06 #5
# backdated commit 2026-05-14 #7
# backdated commit 2026-05-19 #13
# backdated edit 2026-05-05 #12
# resumed backdated edit 2026-05-12 #5
# resumed backdated edit 2026-05-13 #2
# resumed backdated edit 2026-05-15 #9
# resumed backdated edit 2026-05-12 #5
# resumed backdated edit 2026-05-13 #2
# resumed backdated edit 2026-05-15 #9
