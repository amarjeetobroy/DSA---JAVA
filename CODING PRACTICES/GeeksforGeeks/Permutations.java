/*Given a string S. The task is to print all unique permutations of the given string in lexicographically sorted order.

Example 1:

Input: ABC
Output:
ABC ACB BAC BCA CAB CBA
Explanation:
Given string ABC has permutations in 6 
forms as ABC, ACB, BAC, BCA, CAB and CBA .
Example 2:

Input: ABSG
Output:
ABGS ABSG AGBS AGSB ASBG ASGB BAGS 
BASG BGAS BGSA BSAG BSGA GABS GASB 
GBAS GBSA GSAB GSBA SABG SAGB SBAG 
SBGA SGAB SGBA
Explanation:
Given string ABSG has 24 permutations.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function find_permutaion() which takes the string S as input parameter and returns a vector of string in lexicographical order.

Expected Time Complexity: O(n! * n)
Expected Space Complexity: O(n! * n)
*/
class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        List<String> ans = new ArrayList<String>();
        getPerm(0,S.length(),S,ans);
        HashSet<String> set = new HashSet<String>();
        for(String i:ans)
        {
            set.add(i);
        }
        ans.clear();
        for(String i:set)
        {
            ans.add(i);
        }
        Collections.sort(ans);
        return ans;
    }
    public void getPerm(int ind,int n,String str,List<String> ans)
    {
        if(ind==n-1)
        {
            ans.add(str);
            return;
        }
        for(int i=ind;i<n;i++)
        {
            str=swap(str,i,ind);
            getPerm(ind+1,n,str,ans);
            str=swap(str,i,ind);
        }
    }
    public String swap(String s,int i,int j)
    {
        char arr[]=s.toCharArray();
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
        String res = new String(arr);
        return res;
    }
}
/* Output
For Input: 
ABC
Your Output: 
ABC ACB BAC BCA CAB CBA
Expected Output: 
ABC ACB BAC BCA CAB CBA
*/
