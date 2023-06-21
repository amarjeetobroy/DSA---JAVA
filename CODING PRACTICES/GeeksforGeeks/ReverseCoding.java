/* You will be given an integer n, your task is to return the sum of all natural number less than or equal to n.

As the answer could be very large, return answer modulo 109+7.

Example 1:

Input:
n = 6
Output:
21
Explanation:
1+2+3+4+5+6 = 21
Example 2:

Input:
n = 4
Output:
10
Explanation:
1+2+3+4 = 10
Your Task:
You don't need to read input or print anything. Your task is to complete the function sumOfNaturals() which takes a single integer n as input and returns sum of all numbers x upto n, i.e., 1 <= x <= n.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1) */
class Solution {
    static int sumOfNaturals(int n) {
        // code here
        long ans=0;
       int mod=(int)(Math.pow(10,9)+7);
   
    for(int i=1; i<=n; i++){
        ans=ans+i;
    }
    return (int)(ans%mod);
    }
};
/* For Input: 
6
Your Output: 
21
Expected Output: 
21
  */
