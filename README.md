# 🚀 DSA Practice Journey

![Started](https://img.shields.io/badge/Started-1%20Nov%202026-blue)
![Goal](https://img.shields.io/badge/Goal-10%20problems%20per%20day-orange)
![Language](https://img.shields.io/badge/Language-Java-yellow)

> Solving **10 DSA problems every day**, in public. Every solution includes my approach and its time and space complexity, so this repo shows how I think, not just the final code.

---

## 📌 About this repo

- **Goal:** build strong problem-solving fundamentals through consistent daily practice.
- **Pace:** 10 problems per day.
- **Started:** 1 November 2026
- **Platform:** [LeetCode](https://leetcode.com)
- **Language:** Java

Progress is visible through the commit history and the contribution graph on my profile.

---

## 🗂️ Topics covered

Solutions are organised by topic:

- Arrays
- Strings
- Hashing
- Two Pointers
- Sliding Window
- Binary Search
- Linked List
- Stack and Queue
- Recursion and Backtracking
- Trees
- Heap / Priority Queue
- Graphs
- Greedy
- Dynamic Programming

---

## 📁 Folder structure

```
dsa-practice/
├── README.md
├── arrays/
│   ├── 0001-two-sum.java
│   └── 0121-best-time-to-buy-and-sell-stock.java
├── strings/
├── hashing/
├── two-pointers/
├── sliding-window/
├── binary-search/
├── linked-list/
├── stack-queue/
├── backtracking/
├── trees/
├── heap/
├── graphs/
├── greedy/
└── dp/
```

**File naming:** `<4-digit problem number>-<problem-slug>.java`
Example: `0001-two-sum.java`

---

## 🧾 Solution format

Every solution file starts with a short header (the class is not marked `public`, so the file name can start with a number):

```java
/*
 * Problem: 1. Two Sum
 * Link: https://leetcode.com/problems/two-sum/
 * Difficulty: Easy
 * Topic: Arrays, Hash Map
 * Date solved: 2026-11-02
 *
 * Approach:
 *   Store each number's index in a HashMap. For every number, check
 *   whether (target - number) has already been seen.
 *
 * Time: O(n)   Space: O(n)
 *
 * Notes:
 *   My first idea was a nested loop (O(n^2)). The HashMap removes the
 *   second loop.
 */
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (seen.containsKey(need)) {
                return new int[] { seen.get(need), i };
            }
            seen.put(nums[i], i);
        }
        return new int[] {};
    }
}
```

---

## 🔁 How I work through each problem

1. Read the problem and try it on my own first.
2. Write down the brute-force idea, then look for a better approach.
3. If I'm stuck, read a hint or editorial, then close it and re-write the solution from scratch.
4. Add the header with my approach, complexity and notes.
5. Commit and push with a message like `Day N: solved 10 problems (topic1, topic2)`.

---

## 🧠 Common patterns

A quick reference of the patterns I use most often:

| Pattern | When to use it | Example problem |
|---|---|---|
| Hash map | Need O(1) lookups ("have I seen this before?") | Two Sum |
| Two pointers | Sorted array, pair or triplet conditions | 3Sum |
| Sliding window | Longest or shortest subarray/substring with a condition | Longest Substring Without Repeating Characters |
| Binary search | Sorted data, or "minimum X such that..." with a monotonic check | Koko Eating Bananas |
| Fast and slow pointers | Cycle detection, middle of a linked list | Linked List Cycle |
| BFS / DFS | Trees, grids and graph traversal | Number of Islands |
| Backtracking | Generate all combinations, permutations or subsets | Subsets |
| Dynamic programming | Overlapping subproblems and optimal substructure | Climbing Stairs |

---

## 🤝 Connect

- LinkedIn: [Gilakara Bhavish](<www.linkedin.com/in/gilakara-bhavish>)
- GitHub: [@gilakarabhavish](https://github.com/Gilakarabhavish)

Suggestions on better approaches are always welcome. Feel free to open an issue.

---

⭐ If this repo helps you, consider giving it a star.
