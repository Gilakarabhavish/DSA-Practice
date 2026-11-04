# 🚀 DSA Practice Journey

![Started](https://img.shields.io/badge/Started-1%20Nov%202026-blue)
![Goal](https://img.shields.io/badge/Goal-7--8%20problems%20per%20day-orange)
![Language](https://img.shields.io/badge/Language-Java-yellow)

> Solving **7-8 DSA problems every day**, in public. Every solution includes my approach and its time and space complexity, so this repo shows how I think, not just the final code.

---

## 📌 About this repo

- **Goal:** build strong problem-solving fundamentals through consistent daily practice.
- **Pace:** 7-8 problems per day.
- **Started:** 1 November 2026
- **Platform:** [LeetCode](https://leetcode.com)
- **Language:** Java

Progress is visible through the commit history and the contribution graph on my profile.

---

## 🗂️ Topics covered

- Math and Geometry
- Bit Manipulation
- Arrays and Matrix
- Two Pointers
- Sliding Window
- Hashing and Prefix Sum
- Strings and Pattern Matching
- Searching and Binary Search
- Sorting and Intervals
- Linked List
- Stacks and Queues
- Recursion and Backtracking
- Trees (Binary Trees, BST, Trie, Segment Tree)
- Heaps and Priority Queues
- Greedy
- Graphs
- Dynamic Programming

---

## 📁 Folder structure

Solutions are organised **week by week**. Each week folder contains one folder per day (day 1 to day 7), and each day folder contains that day's code files.

```
dsa-practice/
├── README.md
├── week-01/
│   ├── day-1/
│   │   ├── 0009-palindrome-number.java
│   │   ├── 0066-plus-one.java
│   │   └── ...
│   ├── day-2/
│   ├── day-3/
│   ├── day-4/
│   ├── day-5/
│   ├── day-6/
│   └── day-7/
├── week-02/
│   ├── day-1/
│   ├── day-2/
│   └── ...
├── week-03/
│   └── ...
└── week-n/
    └── ...
```

**File naming:** `<4-digit problem number>-<problem-slug>.java`
Example: `0009-palindrome-number.java`

---

## 🧾 Solution format

Every solution file starts with a short header:

```java
/*
 * Problem: 9. Palindrome Number
 * Link: https://leetcode.com/problems/palindrome-number/
 * Difficulty: Easy
 * Topic: Math
 *
 * Approach:
 *   Reverse only the second half of the number and compare it with the
 *   first half. This avoids converting to a string and avoids overflow.
 *
 * Time: O(log n)   Space: O(1)
 *
 * Notes:
 *   Negative numbers and numbers ending in 0 (except 0 itself) can
 *   never be palindromes, so they are rejected up front.
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return x == reversed || x == reversed / 10;
    }
}
```

The class is not marked `public`, so the file name can start with a number.

---

## 🔁 How I work through each problem

1. Read the problem and try it on my own first.
2. Write down the brute-force idea, then look for a better approach.
3. If I'm stuck, read a hint or editorial, then close it and re-write the solution from scratch.
4. Add the header with my approach, complexity and notes.
5. Save the file in that day's folder and commit with a message like `Week 1 Day 1: solved 7 problems (math)`.

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

- LinkedIn: [Gilakara Bhavish](www.linkedin.com/in/gilakara-bhavish)
- GitHub: [@gilakarabhavish](https://github.com/Gilakarabhavish)

Suggestions on better approaches are always welcome. Feel free to open an issue.

---

⭐ If this repo helps you, consider giving it a star.
