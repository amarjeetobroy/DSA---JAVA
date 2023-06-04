/* Given a mathematical equation that contains only numbers and +, -, *, /. Print the equation in reverse, such that the equation is reversed, but the numbers remain the same.
It is guaranteed that the given equation is valid, and there are no leading zeros.

Example 1:

Input:
S = "20-3+5*2"
Output: 2*5+3-20
Explanation: The equation is reversed with
numbers remaining the same.
Example 2:

Input: 
S = "5+2*56-2/4"
Output: 4/2-56*2+5
Explanation: The equation is reversed with
numbers remaining the same.
Your Task:
You don't need to read input or print anything. Your task is to complete the function reverseEqn() which takes the string S representing the equation as input and returns the resultant string representing the equation in reverse.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(|S|).

Constraints:
1<=|S|<=105
The string contains only the characters '0' - '9', '+', '-', '*', and '/'.

*/

class Solution
{
   
    String reverseEqn(String S)
    {
        // your code here
        StringBuilder reverseString=new StringBuilder();
        int firstDigit=-1;
        for(int i=S.length()-1;i>=0;i--)
        {
            //System.out.println("Character at Index:: "+i+", is:: "+S.charAt(i));
            if(S.charAt(i)>='0' && S.charAt(i)<='9')
            {
                //System.out.println("In Number Condition");
                if(i>0 && S.charAt(i-1)>='0' && S.charAt(i-1)<='9')
                {
                    //System.out.println("In Next Number Condition");
                    firstDigit=i+1;
                    continue;
                }
                else
                {
                    //System.out.println("In Single Number Condition");
                    if(firstDigit>0)
                    {
                        reverseString.append(S.substring(i,firstDigit));
                        firstDigit=-1;
                    }
                    else
                    {
                        reverseString.append(S.charAt(i));
                    }
                }
            }
            else
            {
                //System.out.println("In Operator Condition");
                if(firstDigit>0)
                {
                    reverseString.append(S.substring(i,firstDigit));
                }
                firstDigit=-1;
                reverseString.append(S.charAt(i));
            }
        }
        return reverseString.toString();
    }
}

/*

For Input: 
20-3+5*2
Your Output: 
2*5+3-20
Expected Output: 
2*5+3-20
*/

 
