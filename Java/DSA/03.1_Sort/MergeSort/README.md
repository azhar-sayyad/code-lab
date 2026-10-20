# 🌿 Merge Sort

> *(Implementation coming soon)*

## How it works
**Divide and Conquer.** Recursively split the array into two halves until each half has one element (trivially sorted), then **merge** the halves back together in sorted order.

```
                [38, 27, 43, 3, 9, 82, 10]
               /                           \
        [38, 27, 43]               [3, 9, 82, 10]
        /           \              /              \
    [38, 27]       [43]       [3, 9]          [82, 10]
    /      \                  /    \           /      \
  [38]    [27]             [3]    [9]       [82]    [10]
    \      /                  \    /           \      /
    [27, 38]                  [3, 9]           [10, 82]
        \           /              \              /
        [27, 38, 43]               [3, 9, 10, 82]
               \                           /
               [3, 9, 10, 27, 38, 43, 82]
```

---

## Complexity

| Case        | Time       | Reason                                               |
|-------------|------------|------------------------------------------------------|
| **Best**    | O(n log n) | Always splits and merges — no early exit             |
| **Average** | O(n log n) | log n levels × O(n) work per level                  |
| **Worst**   | O(n log n) | Guaranteed — input doesn't affect the structure      |
| **Space**   | O(n)       | Needs a temporary array during merge step            |

---

## Stability: ✅ Stable
During merge, when two equal elements are compared, the left half's element is chosen first — preserving original order.

---

## In-Place: ❌ No
Requires O(n) auxiliary space for the temporary merge buffer.

---

## When to Use

| Scenario                        | Verdict  |
|---------------------------------|----------|
| Need guaranteed O(n log n)      | ✅ Great  |
| Need stability                  | ✅ Great  |
| Sorting linked lists            | ✅ Great  |
| Memory is very constrained      | ❌ Avoid  |

---

## Files
- [`MergeSort.java`](MergeSort.java) — *(coming soon)*

