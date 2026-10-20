# 🔍 Selection Sort

## How it works
Divide the array into a **sorted left** portion and an **unsorted right** portion. On each pass, scan the entire unsorted portion, find the **minimum** element, and swap it into the next sorted position. Two variants are implemented:

| Variant       | Behaviour                                     |
|---------------|-----------------------------------------------|
| `sortArray1`  | Always swaps (even if element is in place)    |
| `sortArray2`  | Skips swap when element is already at minIndex|

---

## Step-by-Step Example

```
Input:  [3, 0, -1, 5, 9, -3, 2, 1]

Pass 1 (i=0): min=-3 at idx=5 → swap [0]↔[5] → [-3,  0, -1,  5,  9,  3,  2,  1]
Pass 2 (i=1): min=-1 at idx=2 → swap [1]↔[2] → [-3, -1,  0,  5,  9,  3,  2,  1]
Pass 3 (i=2): min=0  at idx=2 → already here  → [-3, -1,  0,  5,  9,  3,  2,  1]  (sortArray2 skips)
Pass 4 (i=3): min=1  at idx=7 → swap [3]↔[7] → [-3, -1,  0,  1,  9,  3,  2,  5]
Pass 5 (i=4): min=2  at idx=6 → swap [4]↔[6] → [-3, -1,  0,  1,  2,  3,  9,  5]
Pass 6 (i=5): min=3  at idx=5 → already here  → [-3, -1,  0,  1,  2,  3,  9,  5]  (sortArray2 skips)
Pass 7 (i=6): min=5  at idx=7 → swap [6]↔[7] → [-3, -1,  0,  1,  2,  3,  5,  9]

Output: [-3, -1, 0, 1, 2, 3, 5, 9]
```

---

## Complexity

| Case        | Time   | Reason                                              |
|-------------|--------|-----------------------------------------------------|
| **Best**    | O(n²)  | Always scans entire unsorted portion — no early exit|
| **Average** | O(n²)  | ~n²/2 comparisons                                   |
| **Worst**   | O(n²)  | Same — time is always quadratic                     |
| **Space**   | O(1)   | In-place                                            |
| **Swaps**   | O(n)   | At most n−1 swaps (key advantage!)                  |

---

## Stability: ❌ Unstable

Long-range swaps can **reverse the order of equal elements**.

```
Example: [3a, 3b, 1]   (3a and 3b are equal but distinguishable)

Pass 1: min=1 at idx=2 → swap arr[0] & arr[2]
Result: [1, 3b, 3a]   ← 3a and 3b are REVERSED ❌
```

> A stable variant of Selection Sort exists (shift instead of swap), but the standard implementation above is unstable.

---

## In-Place: ✅ Yes
No extra array. Only a `temp` variable for swapping.

---

## Key Advantage: Minimum Swaps
Selection Sort performs at most **O(n) swaps** regardless of input. This makes it ideal when **write operations are expensive** (e.g., EEPROM, flash memory), even though its comparison count is the same O(n²) as other simple sorts.

---

## When to Use

| Scenario                          | Verdict  |
|-----------------------------------|----------|
| Write operations are expensive    | ✅ Great  |
| Small simple arrays               | ✅ OK     |
| Need stability                    | ❌ Avoid  |
| Large unsorted datasets           | ❌ Avoid  |

---

## Files
- [`SelectionSort.java`](SelectionSort.java) — both variants with full inline comments

