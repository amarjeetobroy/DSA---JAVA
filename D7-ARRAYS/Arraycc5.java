	// Max subarray sum

import java.util.Scanner;
public class Arraycc{	
public static void maxsubarraysum(int numbers[]){
		int currsum=0;
		int Maxsum = Integer.MIN_VALUE;

		for (int i=0; i<numbers.length;i++){
			int start =i;
			for(int j=i;j<numbers.length;j++){
				int end=j;
				currsum=0;
				for(int k=start;k<=end;k++){
					currsum=+numbers[k];
				}
				System.out.println(currsum);
				if(Maxsum <currsum){
					Maxsum = currsum;
				}
			}
		}
		System.out.println("max sum = "+ Maxsum);
	}
	public static void main(String[] args) {
		int numbers[]={1,-2,6,-1,3};
		maxsubarraysum(numbers);
	}

  /* Output
     1
-2
6
-1
3
-2
6
-1
3
6
-1
3
-1
3
3
max sum = 6
*/
