	// Print subArray
	// a continuous part of array

public class subarray{	
public static void printSubarray(int numbers[]){
		int ts=0;
		for(int i=0;i<numbers.length;i++){
			int start = i;
			for(int j=0;j<numbers.length;j++){
				int end = j;
				for(int k=start;k<=end;k++){
					System.out.print(numbers[k]+" ");
				}
				ts++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Total sabArray = "+ ts);
	}
	public static void main(String[] args) {
		int numbers[]={2,4,6,8,10};
		printSubarray(numbers);
	}
}

/* Output

 2
2 4
2 4 6
2 4 6 8
2 4 6 8 10


4
4 6
4 6 8
4 6 8 10



6
6 8
6 8 10




8
8 10





10

Total sabArray = 25

*/
