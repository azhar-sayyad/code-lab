# Object Relations in Java

In this module, keep these three together because they all model object relationships.

## 1) Association
General relationship where objects know/use each other.
No ownership is implied.

Code pattern:
```java
teacher.teach(course);
```

## 2) Aggregation
A specialized has-a relation with weak ownership.
Child object is created outside and passed in.

Code pattern:
```java
this.child = child;
```

## 3) Composition
A stronger has-a relation with full ownership.
Child object is created inside the parent.

Code pattern:
```java
this.child = new Child(...);
```

## Quick Comparison
| Aspect | Association | Aggregation | Composition |
|---|---|---|---|
| Ownership | None implied | Weak | Strong |
| Child lifecycle | Independent | Independent | Dependent on parent |
| Reusability | High | High | Limited |
| Typical style | Method-level interaction | Constructor/setter injection | Internal object creation |

## Recommended Project Layout
- `src/oops/objectrelations/association`
- `src/oops/objectrelations/aggregation`
- `src/oops/objectrelations/composition`
# backdated commit 2026-05-07 #1
# backdated commit 2026-05-12 #15
# backdated edit 2026-05-01 #4
# backdated edit 2026-05-01 #12
# backdated edit 2026-05-04 #8
# backdated edit 2026-05-05 #10
# resumed backdated edit 2026-05-08 #20
# resumed backdated edit 2026-05-20 #9
# resumed backdated edit 2026-05-08 #20
# resumed backdated edit 2026-05-20 #9
