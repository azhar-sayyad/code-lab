# 🫧 Bubble Sort

## How it works
Repeatedly compare **adjacent elements** and swap them if out of order. After each full pass, the largest unsorted element "bubbles up" to its final position. An early-exit flag (`isSorted`) stops the loop immediately if a full pass completes with zero swaps — meaning the array is already sorted.

---

## Step-by-Step Example

```
Input:  [10, 5, 8, 2, 3, 1, -3]

Pass 1 (i=0):
  [10,5]  → swap → [5, 10, 8,  2,  3,  1, -3]
  [10,8]  → swap → [5,  8,10,  2,  3,  1, -3]
  [10,2]  → swap → [5,  8, 2, 10,  3,  1, -3]
  [10,3]  → swap → [5,  8, 2,  3, 10,  1, -3]
  [10,1]  → swap → [5,  8, 2,  3,  1, 10, -3]
  [10,-3] → swap → [5,  8, 2,  3,  1, -3, 10]  ← 10 settled ✅

Pass 2 (i=1): → [5, 2, 3, 1, -3, 8, 10]        ← 8 settled ✅
Pass 3 (i=2): → [2, 3, 1, -3, 5,  8, 10]        ← 5 settled ✅
Pass 4 (i=3): → [2, 1, -3, 3,  5,  8, 10]       ← 3 settled ✅
Pass 5 (i=4): → [-3, 1,  2, 3,  5,  8, 10]      ← 2 settled ✅
Pass 6 (i=5): → [-3, 1,  2, 3,  5,  8, 10]      ← 1 settled ✅

Output: [-3, 1, 2, 3, 5, 8, 10]
```

---

## Complexity

| Case        | Time   | Reason                                          |
|-------------|--------|-------------------------------------------------|
| **Best**    | O(n)   | Already sorted → 1 pass, 0 swaps, early exit    |
| **Average** | O(n²)  | ~n²/4 comparisons on random input               |
| **Worst**   | O(n²)  | Reverse sorted → max swaps on every pass        |
| **Space**   | O(1)   | In-place, only a `temp` variable needed         |

---

## Stability: ✅ Stable

The swap condition is **strictly greater than** (`arr[j] > arr[j+1]`), so equal elements are **never** swapped. Their original relative order is always preserved.

```
Example: [3a, 3b, 1]  (3a and 3b are equal but distinguishable)
After sort: [1, 3a, 3b]  ✅ — relative order of 3a, 3b unchanged
```

---

## In-Place: ✅ Yes
No extra array is allocated. Only a single `temp` variable is used for swapping.

---

## When to Use

| Scenario                        | Verdict  |
|---------------------------------|----------|
| Teaching / learning sorting     | ✅ Great  |
| Nearly-sorted small arrays      | ✅ Good   |
| Large unsorted datasets         | ❌ Avoid  |
| Need stability                  | ✅ Safe   |

---

## Files
- [`BubbleSort.java`](BubbleSort.java) — implementation with full inline comments

