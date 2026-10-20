# 🃏 Insertion Sort

## How it works
Think of sorting a hand of **playing cards**. Start from the second element and treat it as the `key`. Shift all larger elements in the sorted left portion **one position to the right** to make room, then drop the `key` into its correct spot. Repeat until the whole array is sorted.

---

## Step-by-Step Example

```
Input:  [3, 0, -1, 5, 9, -3, 2, 1]
         ↑
         sorted portion = [3]

i=1  key=0  → shift 3 right   → [0,  3, -1,  5,  9, -3,  2,  1]
i=2  key=-1 → shift 3,0 right → [-1, 0,  3,  5,  9, -3,  2,  1]
i=3  key=5  → no shift needed → [-1, 0,  3,  5,  9, -3,  2,  1]
i=4  key=9  → no shift needed → [-1, 0,  3,  5,  9, -3,  2,  1]
i=5  key=-3 → shift all right → [-3,-1,  0,  3,  5,  9,  2,  1]
i=6  key=2  → shift 9,5,3     → [-3,-1,  0,  2,  3,  5,  9,  1]
i=7  key=1  → shift 9,5,3,2   → [-3,-1,  0,  1,  2,  3,  5,  9]

Output: [-3, -1, 0, 1, 2, 3, 5, 9]
```

---

## Complexity

| Case        | Time   | Reason                                              |
|-------------|--------|-----------------------------------------------------|
| **Best**    | O(n)   | Already sorted → inner `while` never runs           |
| **Average** | O(n²)  | ~n²/4 shifts on random input                        |
| **Worst**   | O(n²)  | Reverse sorted → every element shifts maximally     |
| **Space**   | O(1)   | In-place; only one `key` variable allocated         |

---

## Stability: ✅ Stable

The shift condition is **strictly greater than** (`arr[j] > key`), so equal elements are **never** moved past each other.

```
Example: [3a, 3b, 1]
After sort: [1, 3a, 3b]  ✅ — 3a still comes before 3b
```

---

## In-Place: ✅ Yes
No extra array. Only one variable (`key`) is needed beyond the array itself.

---

## When to Use

| Scenario                            | Verdict  |
|-------------------------------------|----------|
| Small arrays (n < 20)               | ✅ Great  |
| Nearly-sorted data                  | ✅ Great  |
| Online / streaming sort             | ✅ Great  |
| Embedded inside TimSort (Java sort) | ✅ Used   |
| Large unsorted datasets             | ❌ Avoid  |

> **Fun fact:** Java's `Arrays.sort()` for objects uses **TimSort**, which falls back to Insertion Sort for small sub-arrays because of its low constant factor and cache friendliness.

---

## Files
- [`InsertionSort.java`](InsertionSort.java) — implementation with full inline comments

