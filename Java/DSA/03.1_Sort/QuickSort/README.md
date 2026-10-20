# ⚡ Quick Sort

> *(Implementation coming soon)*

## How it works
**Divide and Conquer with a pivot.** Pick a pivot element, **partition** the array so all elements less than the pivot go left and all greater go right. Recursively sort each partition. No merge step needed — sorting happens in-place during partitioning.

```
Input: [10, 7, 8, 9, 1, 5]    pivot = 5 (last element)

Partition pass:
  i starts before arr[0]
  j scans left to right:
    arr[j]=10 > 5 → skip
    arr[j]=7  > 5 → skip
    arr[j]=8  > 5 → skip
    arr[j]=9  > 5 → skip
    arr[j]=1  < 5 → swap arr[++i] & arr[j] → [1, 7, 8, 9, 10, 5]
  Place pivot: swap arr[i+1] & pivot → [1, 5, 8, 9, 10, 7]
                                            ↑
                                         pivot at index 1 (final position)

Left partition:  [1]        → already sorted
Right partition: [8, 9, 10, 7] → recurse...

Final: [1, 5, 7, 8, 9, 10]
```

---

## Complexity

| Case        | Time       | Reason                                               |
|-------------|------------|------------------------------------------------------|
| **Best**    | O(n log n) | Pivot always splits array evenly                     |
| **Average** | O(n log n) | Random pivot → expected balanced splits              |
| **Worst**   | O(n²)      | Already sorted + last-element pivot → max recursion  |
| **Space**   | O(log n)   | Recursion stack depth (in-place, no extra array)     |

> **Worst case avoided** by using random pivot or median-of-three pivot selection.

---

## Stability: ❌ Unstable
Partitioning swaps elements across long distances, potentially reversing the order of equal elements.

---

## In-Place: ✅ Yes
Partitioning rearranges elements within the original array. Only O(log n) stack space for recursion.

---

## When to Use

| Scenario                         | Verdict  |
|----------------------------------|----------|
| General-purpose fast sorting     | ✅ Great  |
| Cache-friendly in-place sort     | ✅ Great  |
| Need stability                   | ❌ Avoid  |
| Input may be already sorted      | ⚠️ Use random pivot |

> **Fun fact:** Java's `Arrays.sort()` for **primitives** uses a **dual-pivot QuickSort** (Yaroslavskiy's algorithm), which is faster in practice than classic single-pivot QuickSort.

---

## Files
- [`QuickSort.java`](QuickSort.java) — *(coming soon)*

