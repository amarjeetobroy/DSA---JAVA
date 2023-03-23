	// pairs in array

	/* {2,4,6,8,10}

	(2,4) (2,6) (2,8) (2,10)
	(4,6) (4,8) (4,10)
	(6,8) (6,10)
	(8,10)    */


public class pairs{	
public static void printpairs(int numbers[]){
		for(int i=0;i<numbers.length;i++){
			int curr = numbers[i];

			for(int j=i+1;j<numbers.length;j++){
				System.out.print("("+ curr + "," + numbers[j] + ")");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int numbers[] = {2,4,6,8,10};
		printpairs(numbers);
	}
}

/* Output

 (2,4)(2,6)(2,8)(2,10)
(4,6)(4,8)(4,10)
(6,8)(6,10)
(8,10)

*/
