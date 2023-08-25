/* Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome
Example 2:

Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome
Your Task:
You don't need to read input or print anything. Complete the function isPalindrome()which accepts string S and returns an integer value 1 or 0.

Expected Time Complexity: O(Length of S)
Expected Auxiliary Space: O(1)
  */
class Solution {
    int isPalindrome(String S) {
        // code here
        StringBuilder str = new StringBuilder(S);
        str.reverse();
        String str1 = String.valueOf(str);
        if(S.equals(str1)){
            return 1;
        }
        
        return 0;
    }
};
/*
For Input: 
abba
Your Output: 
1
Expected Output: 
1
  */
