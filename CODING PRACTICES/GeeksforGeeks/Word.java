/* Given a 2D board of letters and a word. Check if the word exists in the board. The word can be constructed from letters of adjacent cells only. ie - h
orizontal or vertical neighbors. The same letter cell can not be used more than once.

Example 1:

Input: board = {{a,g,b,c},{q,e,e,l},{g,b,k,s}},
word = "geeks"
Output: 1
Explanation: The board is-
a g b c
q e e l
g b k s
The letters which are used to make the
"geeks" are colored.
Example 2:

Input: board = {{a,b,c,e},{s,f,c,s},{a,d,e,e}},
word = "sabfs"
Output: 0
Explanation: The board is-
a b c e
s f c s
a d e e
Same letter can not be used twice hence ans is 0
Your Task:
You don't need to read or print anything. Your task is to complete the function isWordExist() which takes board and word as input parameter and returns boolean value true if word can be found otherwise returns false.

Expected Time Complexity: O(N * M * 4L) where N = No. of rows in board, M = No. of columns in board, L = Length of word
Expected Space Compelxity: O(L), L is length of word.
*/


class Solution
{
    public boolean isWordExist(char[][] board, String word)
    {
        int N=board.length;
        int M=board[0].length;
        
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(board[i][j]==word.charAt(0)){
                    board[i][j]='.';
                    int a=recurse(word,board,i,j,1);
                    if(a==1) return true;
                    else board[i][j]=word.charAt(0);
                }
            }
        }
        return false;
        
    }
    
    static int recurse(String word,char arr[][],int i,int j,int k){
        if(k==word.length()) return(1);
      //  System.out.println(k);
       if(i<arr.length-1 && arr[i+1][j]==word.charAt(k)){
           arr[i+1][j]='.';
           int ans=recurse(word,arr,i+1,j,k+1);
           if(ans==1) return(1);
           else arr[i+1][j]=word.charAt(k);
           
       }
       if(i>0 && arr[i-1][j]==word.charAt(k)){
           arr[i-1][j]='.';
           int ans=recurse(word,arr,i-1,j,k+1);
           if(ans==1) return(1);
           else arr[i-1][j]=word.charAt(k);
       }
       if(j<arr[0].length-1 &&arr[i][j+1]==word.charAt(k)){
           arr[i][j+1]='.';
           int ans=recurse(word,arr,i,j+1,k+1);
           if(ans==1) return(1);
           else arr[i][j+1]=word.charAt(k);
       }
       if(j>0 && arr[i][j-1]==word.charAt(k)){
           arr[i][j-1]='.';
           int ans=recurse(word,arr,i,j-1,k+1);
           if(ans==1)  return(1);
           else arr[i][j-1]=word.charAt(k);
       }
       return(0);
    }
}

/*
For Input: 
3 4 
a g b c 
q e e l 
g b k s 
geeks
Your Output: 
1
Expected Output: 
1
*/
