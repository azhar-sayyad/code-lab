# Divide and Conquer: Min and Max (Tournament Method)

Finding the minimum and maximum element in an array of size $n$.

---

## 💡 Why Divide and Conquer?

In a standard linear scan:
- Finding Minimum: $n - 1$ comparisons
- Finding Maximum: $n - 1$ comparisons
- **Total Comparisons**: $2n - 2$

Using the **Divide and Conquer** (Tournament Method):
- Total Comparisons: $\approx \frac{3n}{2} - 2$
- For an array of 1,000 elements:
  - Linear Search: $1,998$ comparisons
  - Divide and Conquer: $1,498$ comparisons (**~25% fewer comparisons!**)

---

## 🌳 How It Works (Divide, Conquer, Combine)

```text
                        [0, 1, 2, 10, 5, 200, 5, 4, 3]
                                     /    \
                                    /      \
                      [0, 1, 2, 10, 5]    [200, 5, 4, 3]
                          /      \             /     \
                      [0, 1, 2]  [10, 5]    [200, 5]  [4, 3]
                       /    \
                    [0, 1]  [2]
```

### 1. Base Cases:
- **1 Element (`start == end`)**:
  Both min and max are that single element $\rightarrow$ `(arr[start], arr[start])` *(0 comparisons)*.
- **2 Elements (`start + 1 == end`)**:
  Compare the 2 elements directly $\rightarrow$ 1 comparison:
  ```java
  if (arr[start] < arr[end]) {
      return new MinMaxVal(arr[start], arr[end]);
  } else {
      return new MinMaxVal(arr[end], arr[start]);
  }
  ```

### 2. Recursive Steps:
1. **Divide**: Find mid-point: `mid = start + (end - start) / 2`.
2. **Conquer**:
   - `leftResult = findMinMax(arr, start, mid)`
   - `rightResult = findMinMax(arr, mid + 1, end)`
3. **Combine**:
   - `overallMin = Math.min(leftResult.min(), rightResult.min())`
   - `overallMax = Math.max(leftResult.max(), rightResult.max())`

---

## ⚠️ 3 Critical Bugs in the Original Code

### 1. Operator Precedence Bug (`StackOverflowError`)
```java
// What was written:
int mid = start + end / 2; // ❌ Division happens BEFORE addition!
```
* In Java, `/` has higher precedence than `+`. This means `start + (end / 2)`.
* When `start = 5` and `end = 9`, `mid = 5 + 4 = 9`.
* Calling `findMinMax(arr, start, mid)` called `findMinMax(arr, 5, 9)` again, leading to **infinite recursion and crash**!
* **Fix**:
  ```java
  int mid = start + (end - start) / 2; // ✅ Safe and prevents integer overflow
  ```

---

### 2. Inverted Record Fields in the 2-Element Case
```java
record MinMaxVal(int min, int max) {} // 1st parameter is min, 2nd is max

// What was written:
if (arr[start] > arr[end]) {
    return new MinMaxVal(arr[start], arr[end]); // ❌ arr[start] is LARGER, but placed in 'min'!
} else {
    return new MinMaxVal(arr[end], arr[start]); // ❌ arr[end] is LARGER, but placed in 'min'!
}
```
* In both cases, the larger element was passed into the `min` field!
* **Fix**:
  ```java
  if (arr[start] < arr[end]) {
      return new MinMaxVal(arr[start], arr[end]);
  } else {
      return new MinMaxVal(arr[end], arr[start]);
  }
  ```

---

### 3. Array Index Out of Bounds in `main`
```java
int[] arr = {0, 1, 2, 10, 5, 200, 5, 4, 3}; // length is 9, last valid index is 8
MinMaxVal result = obj.findMinMax(arr, 0, 9); // ❌ Index 9 does not exist!
```
* **Fix**: Pass `arr.length - 1` (or use the overloaded helper `obj.findMinMax(arr)`).

---

## ⏱️ Complexity

| Metric | Complexity |
|---|---|
| **Time Complexity** | $O(n)$ |
| **Number of Comparisons** | $\approx \frac{3n}{2} - 2$ |
| **Space Complexity** | $O(\log n)$ (Call stack depth) |

