# Association in OOP (Java)

## Overview
Association describes a connection between objects where they collaborate, but do not control each other's lifetime.
It is a relationship of interaction, not inheritance.

In simple terms:
- one object can know about or use another object
- both objects can still exist on their own

## Core Traits
- models `uses-a` or `knows-a`
- usually promotes loose coupling
- can be one-way (unidirectional) or two-way (bidirectional)
- supports one-to-one, one-to-many, many-to-one, and many-to-many structures

## Types of Association
1. `One-to-one`: one `Person` linked with one `Passport`
2. `One-to-many`: one `Teacher` linked with many `Students`
3. `Many-to-one`: many `Students` linked to one `School`
4. `Many-to-many`: many `Teachers` linked with many `Students`

## Examples in This Folder
1. `Demo.java`:
- unidirectional association (`Teacher` uses `Course`)
- path: `Teacher -> Course`

2. `ManyToManyAssociationDemo.java`:
- many-to-many style by sharing `Participant` across multiple `Instructor` objects

3. `BidirectionalAssociationDemo.java`:
- two-way link between `Library` and `Book`
- `Library` keeps books; each `Book` also knows its library

## Why Use Association
- easier reuse of objects
- clean module boundaries
- realistic modeling of domain relationships
- reduced impact when one class changes internally

## Association vs Aggregation vs Composition
| Aspect | Association | Aggregation | Composition |
|---|---|---|---|
| Meaning | Interaction between peers | Has-a with external part object | Has-a with owned internal part |
| Ownership | No ownership implied | Weak ownership | Strong ownership |
| Lifecycle | Independent | Child independent | Child depends on parent |
| Typical code style | `a.use(b)` | `this.part = part;` | `this.part = new Part(...);` |

## Run
```bash
javac src/oops/objectrelations/association/*.java
java -cp src oops.objectrelations.association.Demo
java -cp src oops.objectrelations.association.ManyToManyAssociationDemo
java -cp src oops.objectrelations.association.BidirectionalAssociationDemo
```
# backdated commit 2026-05-01 #18
# backdated commit 2026-05-05 #19
# backdated commit 2026-05-06 #11
# backdated commit 2026-05-07 #12
# backdated commit 2026-05-07 #18
# backdated commit 2026-05-15 #16
# backdated commit 2026-05-18 #5
# backdated commit 2026-05-21 #8
# backdated edit 2026-05-01 #9
# backdated edit 2026-05-04 #2
# backdated edit 2026-05-04 #11
# resumed backdated edit 2026-05-15 #15
# resumed backdated edit 2026-05-18 #10
# resumed backdated edit 2026-05-18 #15
# resumed backdated edit 2026-05-20 #3
# resumed backdated edit 2026-05-20 #12
# resumed backdated edit 2026-05-15 #15
# resumed backdated edit 2026-05-18 #10
# resumed backdated edit 2026-05-18 #15
# resumed backdated edit 2026-05-20 #3
# resumed backdated edit 2026-05-20 #12
