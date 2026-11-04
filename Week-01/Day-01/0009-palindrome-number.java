/*
 * ============================================================
 *  Week 01 | Day 01 | Question 1 - LC 9: Palindrome Number
 *  Link: https://leetcode.com/problems/palindrome-number/
 *  Difficulty: Easy | Topic: Math
 * ============================================================
 *
 * GIVEN AND GOAL
 * --------------
 * - Given:  A signed 32-bit integer x.
 * - Find:   Return true if x reads the same from left to right and
 *           right to left; otherwise return false.
 * - Examples: 121 -> true, -121 -> false, 10 -> false.
 * - Constraint: -2^31 <= x <= 2^31 - 1
 *
 * THE IDEA, IN SIMPLE STEPS
 * -------------------------
 * 1. A negative number is not a palindrome: its minus sign would not
 *    appear at both ends.
 * 2. A positive number ending in 0 is not a palindrome, because its
 *    first digit cannot be 0. The number 0 itself IS a palindrome.
 * 3. Move digits from the end of x into rev. Stop after reversing
 *    approximately half the digits.
 * 4. Even number of digits: both halves must be equal.
 *    Odd number of digits: discard the middle digit from rev before
 *    comparing.
 *
 * Why reverse only half?
 *    Reversing the entire integer could exceed the 32-bit int range.
 *    Reversing just half avoids that problem and is enough to compare
 *    both sides.
 *
 * DRY RUN: x = 12321
 * -------------------
 *   Moment             | x     | rev | What happened?
 *   -------------------+-------+-----+---------------------------
 *   Start              | 12321 | 0   | Nothing has moved yet.
 *   After iteration 1  | 1232  | 1   | Moved the final 1.
 *   After iteration 2  | 123   | 12  | Moved the final 2.
 *   After iteration 3  | 12    | 123 | Moved the middle digit 3.
 *
 *   Now 12 > 123 is false, so the loop stops. x == rev is false, but
 *   x == rev / 10 is 12 == 12, so the result is true.
 *   Even-length example: 1221 stops with x = 12 and rev = 12, so the
 *   first comparison is true.
 *
 * EDGE CASES
 * ----------
 *   0    -> true  : the rejection condition allows zero; loop skipped.
 *   10   -> false : ends in zero but is not itself zero.
 *   -121 -> false : the first condition rejects negatives.
 *   1    -> true  : the odd-length check removes it as the middle digit.
 *
 * COMPLEXITY
 * ----------
 *   Time:  O(d), where d is the number of decimal digits (about half
 *          the digits are processed).
 *   Space: O(1)
 */

class PalindromeNumber { // Class that holds the solution (not public, so the file name can start with a number).

    public boolean isPalindrome(int x) { // Takes the number x and returns true if it is a palindrome, else false.

        if (x < 0 || (x % 10 == 0 && x != 0)) return false; // Reject negatives, and nonzero numbers ending in 0 (they can never be palindromes).

        int rev = 0; // Will hold the reversed second half of x, built digit by digit.

        while (x > rev) { // Keep going until we have moved about half of the digits.

            rev = rev * 10 + x % 10; // Shift rev one place left, then append x's last digit (x % 10).

            x /= 10; // Drop the last digit from x, since it has been moved into rev.

        } // End of loop: x now holds the first half and rev holds the reversed second half.

        return x == rev || x == rev / 10; // Even length: x == rev. Odd length: drop rev's middle digit with rev / 10.

    } // End of method.

    // For local testing only (not needed when submitting on LeetCode)
    public static void main(String[] args) { // Entry point so the Run button works in VS Code.
        PalindromeNumber s = new PalindromeNumber(); // Create an object to call the method on.
        System.out.println(s.isPalindrome(121));  // true  : reads the same both ways.
        System.out.println(s.isPalindrome(-121)); // false : negative numbers are rejected.
        System.out.println(s.isPalindrome(10));   // false : ends in 0 but is not 0.
    } // End of main.

} // End of class.