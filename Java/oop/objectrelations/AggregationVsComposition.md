# Aggregation vs Composition in Java

Both represent a **has-a** relationship, but they differ in ownership and lifecycle.

## Aggregation
In aggregation, dependency object is supplied from outside.

Typical style:
```java
this.child = child;
```

Behavior:
- parent references child
- child can exist independently
- same child can be reused by multiple parents

Project example:
- `aggregation/Team` uses externally created `Player`

## Composition
In composition, dependency object is created inside parent.

Typical style:
```java
this.child = new Child(...);
```

Behavior:
- parent owns child strongly
- child lifecycle is tied to parent
- child is usually not shared

Project example:
- `composition/SmartWatch` creates `Battery` internally

## Code-Level Comparison
| Aspect | Aggregation | Composition |
|---|---|---|
| Object creation | Outside parent | Inside parent |
| Ownership | Weak/reference-based | Strong/owner-based |
| Lifecycle | Independent | Dependent |
| Reuse | Easy to share | Usually private to one parent |
| Coupling | Looser | Tighter |

## When to Choose
- Use aggregation when you need sharing/reusability.
- Use composition when the part is an internal, non-detachable component.
# backdated commit 2026-05-04 #7
# backdated commit 2026-05-06 #2
# backdated commit 2026-05-13 #11
# backdated commit 2026-05-20 #4
# backdated edit 2026-05-04 #9
# resumed backdated edit 2026-05-13 #10
# resumed backdated edit 2026-05-15 #11
# resumed backdated edit 2026-05-20 #15
# resumed backdated edit 2026-05-13 #10
# resumed backdated edit 2026-05-15 #11
# resumed backdated edit 2026-05-20 #15
