# Graph Representation: Adjacency Matrix

An **Adjacency Matrix** is a 2D array of size $V \times V$ (where $V$ is the number of vertices/nodes). The slot `mat[i][j]` represents an edge from vertex `i` to vertex `j`.

---

## 📌 Graph Types

### 1. Undirected Graph
An edge between `i` and `j` goes in both directions.
* If there is an edge between `0` and `1`:
  * `mat[0][1] = 1`
  * `mat[1][0] = 1`
* **Property**: The matrix is always **symmetric** along the diagonal (`mat[i][j] == mat[j][i]`).

```text
    0 ─── 1 ─── 2
           \   /
             3

Matrix:
    0  1  2  3
0 [ 0, 1, 0, 0 ]
1 [ 1, 0, 1, 1 ]
2 [ 0, 1, 0, 1 ]
3 [ 0, 1, 1, 0 ]
```

---

### 2. Directed Graph (Digraph)
Edges have direction (`src -> dest`).
* For edge `0 -> 1`:
  * `mat[0][1] = 1`
  * `mat[1][0] = 0` (unless a reverse edge `1 -> 0` also exists).
* **Property**: The matrix is generally **not symmetric**.

```text
    0 ──▶ 1 ──▶ 2
          │
          ▼
          3

Matrix:
    0  1  2  3
0 [ 0, 1, 0, 0 ]
1 [ 0, 0, 1, 1 ]
2 [ 0, 0, 0, 0 ]
3 [ 0, 0, 0, 0 ]
```

---

### 3. Weighted Graph
Instead of storing `1` for an edge, store the **weight / cost** of the edge.
* `mat[src][dest] = weight`
* Typically `0` (or $\infty$) represents "no edge".

```text
         (5)
    0 ──────── 1
              / \
          (2)/   \(7)
            ▼     ▼
            2     3
```

---

## ⏱️ Complexity

| Operation | Time Complexity | Space Complexity |
|---|---|---|
| **Add Edge** | $O(1)$ | $O(V^2)$ |
| **Remove Edge** | $O(1)$ | - |
| **Check if Edge exists (`hasEdge`)** | $O(1)$ | - |
| **Find all neighbors of a vertex** | $O(V)$ | - |

### When to use:
* ✅ **Dense graphs** (graphs where the number of edges $E \approx V^2$).
* ✅ When frequent $O(1)$ edge lookups (`hasEdge(u, v)`) are needed.
* ❌ Avoid for **sparse graphs** (where $E \ll V^2$), because it wastes $O(V^2)$ memory. Use an **Adjacency List** instead.

