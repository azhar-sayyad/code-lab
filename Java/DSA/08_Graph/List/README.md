# Graph Representation: Adjacency List

An **Adjacency List** represents a graph as a collection of lists. For every vertex $v$, we maintain a list of all vertices connected to $v$ by an edge.

In Java, using `Map<Integer, List<Integer>>` makes the graph flexible:
- Vertices don't have to be strictly `0` to `n - 1`.
- Vertices can be added dynamically without resizing a fixed array.

---

## 🌳 Example Graph

Edges: `(0, 1)`, `(0, 2)`, `(1, 3)`, `(3, 2)`

```text
    0 ─────── 1
    │         │
    │         │
    2 ─────── 3
```

### Representation in Memory:
```text
Vertex 0 -> [1, 2]
Vertex 1 -> [0, 3]
Vertex 2 -> [0, 3]
Vertex 3 -> [1, 2]
```

---

## 🆚 Adjacency List vs Adjacency Matrix

| Feature | Adjacency List | Adjacency Matrix |
|---|---|---|
| **Space Complexity** | $O(V + E)$ (Optimal for sparse graphs) | $O(V^2)$ (Heavy memory consumption) |
| **Add Edge** | $O(1)$ | $O(1)$ |
| **Check if Edge exists $(u, v)$** | $O(\text{degree}(u))$ | $O(1)$ |
| **Find all neighbors of $u$** | $O(\text{degree}(u))$ (Directly accessible) | $O(V)$ (Must scan entire row) |
| **Best Used When** | Sparse graph ($E \ll V^2$), dynamic nodes | Dense graph ($E \approx V^2$), frequent edge lookups |

---

## ⚠️ Common Java Collection Pitfalls

1. **`List` methods vs `Map` methods**:
   - `List`: Use `.add(item)` to append an element.
   - `Map`: Use `.put(key, value)` to insert a key-value mapping.
   - ❌ Calling `.put()` on `List` will throw a compiler error (`cannot find symbol method put`).

2. **`putIfAbsent` pattern**:
   ```java
   graph.putIfAbsent(vertex, new ArrayList<>());
   ```
   Ensures that a list exists for the vertex before calling `graph.get(vertex).add(...)`, preventing `NullPointerException`.

