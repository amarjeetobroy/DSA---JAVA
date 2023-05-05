/* You are given a root node of a binary Tree and each node of the binary tree is assigned a value and you are also given an integer k and you have to return
the count of Good subtrees of this binary Tree . Good subtree is a subtree such that the number of distinct values in this subtree is less than or equal to k.

Note: Subtree of a node consists of that node and all nodes of the subtrees of left and right child  of that node  if they exist .

For Input: 
1 2 2 3 N 5 4
2
Your Output: 
4
Expected Output: 
4 */

class Solution
{
    public static int goodSubtrees(Node root,int k)
    {
          int[] count={0};
        HashSet<Integer> set=fun(root,k,count);
        return count[0];
    }
    public static HashSet<Integer> fun(Node root, int k,int[] count){
        if (root==null)
            return null;
        HashSet<Integer> left=fun(root.left,k,count);
        HashSet<Integer> right=fun(root.right,k,count);
        HashSet<Integer> mains=new HashSet<>();
        mains.add(root.data);

        if (left!=null){
            for (int j: left){
                mains.add(j);
            }
        }
        if (right!=null){
            for (int j: right){
                mains.add(j);
            }
        }
        if (mains.size()<=k)
            count[0]++;
        return mains;
    }
}
