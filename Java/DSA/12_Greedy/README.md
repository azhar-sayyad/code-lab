# Greedy Algorithm: Maximum and Minimum Difference
# Greedy Algorithms in Java

## 📌 Problem Statement
---

## 1. ⚖️ Maximum and Minimum Difference (Pairing $2N$ Elements)

### 📌 Problem Statement
Given an array of $2N$ integers, partition them into $N$ pairs $(a_1, b_1), (a_2, b_2), \dots, (a_N, b_N)$ such that:
1. **Maximum Difference**: The sum $\sum_{i=1}^{N} |a_i - b_i|$ is **maximized**.
2. **Minimum Difference**: The sum $\sum_{i=1}^{N} |a_i - b_i|$ is **minimized**.

### 💡 Greedy Intuition
First, sort the array in ascending order: $arr[0] \le arr[1] \le \dots \le arr[2N - 1]$.
* **Minimizing**: Pair adjacent elements $\rightarrow (arr[0], arr[1]), (arr[2], arr[3]), \dots$
* **Maximizing**: Pair elements from opposite ends $\rightarrow (arr[0], arr[2N-1]), (arr[1], arr[2N-2]), \dots$

### ⏱️ Complexity
* **Time Complexity**: $O(n \log n)$ (due to sorting)
* **Space Complexity**: $O(1)$

---

## 💡 Greedy Intuition
## 2. 🎒 Fractional Knapsack Problem

First, **sort the array in ascending order**:
$$arr[0] \le arr[1] \le arr[2] \le \dots \le arr[2N - 1]$$
### 📌 Problem Statement
Given $n$ items, each with a **weight** $w_i$ and a **value/profit** $v_i$, and a knapsack with maximum weight capacity $W$. Find the maximum total value that can be put into the knapsack, allowing **fractions** of items to be taken.

### 1. To Minimize the Difference Sum
To make $|a_i - b_i|$ as small as possible, elements in each pair must be as close to each other as possible on the number line.
* In a sorted array, the closest neighbor to any element is the element directly adjacent to it.
* **Strategy**: Pair adjacent elements:
  $$(arr[0], arr[1]), (arr[2], arr[3]), \dots, (arr[2i], arr[2i+1])$$
* **Formula**:
  $$\text{minDiff} = \sum_{i=0}^{N-1} (arr[2i+1] - arr[2i])$$
### 💡 Greedy Strategy
1. Calculate the **value-to-weight ratio** for each item:
   $$\text{ratio}_i = \frac{v_i}{w_i}$$
2. **Sort items in descending order** of their ratio (highest density first).
3. Iterate through sorted items:
   - If the entire item fits ($\text{remainingCapacity} \ge w_i$):
     - Take the whole item: $\text{profit} += v_i$
     - $\text{remainingCapacity} -= w_i$
   - Otherwise (item is larger than remaining capacity):
     - Take a **fraction** of the item to fill the knapsack:
       $$\text{profit} += \text{ratio}_i \times \text{remainingCapacity}$$
     - Knapsack is full $\rightarrow$ set $\text{remainingCapacity} = 0$ and **`break`**!

---

### 2. To Maximize the Difference Sum
To make $|a_i - b_i|$ as large as possible, we must subtract the smallest $N$ elements from the largest $N$ elements.
* **First Half (Smallest $N$ elements)**: $arr[0 \dots N-1]$
* **Second Half (Largest $N$ elements)**: $arr[N \dots 2N-1]$
* **Strategy**: Pair each small element with a large element. Pairing $(arr[i], arr[2N - 1 - i])$ or $(arr[i], arr[N + i])$ yields the exact same maximum sum:
  $$\text{maxDiff} = \sum_{i=0}^{N-1} (arr[2N - 1 - i] - arr[i])$$
### ⚠️ Common Bugs in Fractional Knapsack

---
#### 1. Missing `break` after taking a fraction
```java
// ❌ BUG:
} else {
    profit += items[i].ratio * capacity;
    // Without 'break', next items will ALSO take fractions of remaining capacity!
}

## 🔍 Visual Example ($2N = 6$ elements)
// ✅ FIX:
} else {
    profit += items[i].ratio * remainingCapacity;
    remainingCapacity = 0;
    break; // Knapsack is completely full!
}
```

Array: `[1, 3, 6, 20, 40, 50]` ($N = 3$)
#### 2. Ascending vs. Descending Sort Order
In Java, `Double.compare(a, b)` sorts in **ascending** order. For greedy choice, we need **descending** order (largest ratio first):
```java
// Descending order (b before a):
Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));
```

### Minimum Difference:
* Pairs: `(1, 3)`, `(6, 20)`, `(40, 50)`
* Sum: $(3 - 1) + (20 - 6) + (50 - 40) = 2 + 14 + 10 = \mathbf{26}$
#### 3. Integer Division Pitfall
```java
// ❌ Integer division truncates decimals!
this.ratio = value / weight; // 200 / 30 becomes 6.0 instead of 6.666...

### Maximum Difference:
* Pairs: `(1, 50)`, `(3, 40)`, `(6, 20)`
* Sum: $(50 - 1) + (40 - 3) + (20 - 6) = 49 + 37 + 14 = \mathbf{100}$
// ✅ Cast to double first:
this.ratio = (double) value / weight;
```

---

## ⚠️ Important Considerations
### 🔍 Step-by-Step Example

1. **Even vs. Odd Array Length**:
   - The problem statement inherently requires an **even number of elements ($2N$)** because all elements must be grouped into pairs.
   - If an array has an odd length, at least one element cannot be paired.
2. **Integer Overflow**:
   - If numbers are large, the cumulative difference sums can exceed $2 \times 10^9$ (`Integer.MAX_VALUE`). Always use `long` for the sums.
3. **`Math.abs` is Optional**:
   - Since the array is sorted, $arr[j] \ge arr[i]$ and $arr[2i+1] \ge arr[2i]$, so `Math.abs` is not strictly necessary.
* **Capacity**: `50`
* **Items**:
  | Item | Weight | Value | Ratio ($v/w$) | Action Taken | Profit Added | Remaining Capacity |
  |---|---|---|---|---|---|---|
  | Item 3 | 10 | 1000 | **100.0** | Take 100% | +1000 | 40 |
  | Item 1 | 30 | 600 | **20.0** | Take 100% | +600 | 10 |
  | Item 0 | 20 | 200 | **10.0** | Take fraction ($10/20 = 0.5$) | $+ (10 \times 10.0) = \mathbf{100}$ | 0 (Full $\rightarrow$ Stop) |
  | Item 2 | 50 | 150 | **3.0** | Skipped | 0 | 0 |

**Total Maximum Profit**: $1000 + 600 + 100 = \mathbf{1700.0}$

---

## ⏱️ Complexity Analysis
### ⏱️ Complexity

| Metric | Complexity | Rationale |
|---|---|---|
| **Time Complexity** | $O(n \log n)$ | Dominated by `Arrays.sort()` |
| **Two-Pointer Pass** | $O(n)$ | Traverses half the array ($N$ iterations) |
| **Space Complexity** | $O(1)$ | In-place traversal (ignoring sorting stack) |

| **Time Complexity** | $O(n \log n)$ | Sorting items by ratio |
| **Greedy Selection** | $O(n)$ | Single pass through items |
| **Space Complexity** | $O(n)$ | Array of `Item` objects |
