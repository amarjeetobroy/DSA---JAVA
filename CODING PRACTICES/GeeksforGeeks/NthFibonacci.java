/*
Given a positive integer n, find the nth fibonacci number. Since the answer can be very large, return the answer modulo 1000000007.

Example 1:

Input: 
n = 2
Output: 
1 
Explanation: 
1 is the 2nd number of fibonacci series.
Example 2:

Input: 
n = 5
Output: 
5
Explanation: 
5 is the 5th number of fibonacci series.
Your Task:  
You dont need to read input or print anything. Complete the function nthFibonacci() which takes n as input parameter and returns nth fibonacci number.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1<= n <=105
  */
class Solution {
    static int nthFibonacci(int n){
        int a = 0;
        int b = 1;
        int c = 0;
        // code here
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        for(int i = 2; i <= n ; i++) {
            c = (a + b) %1000000007;
            a = b;
            b = c;
        }
      return c;
    }
}
/*
For Input: 
2
Your Output: 
1
Expected Output: 
1
  */
