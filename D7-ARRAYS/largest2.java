
	// Largest numbers

	// find the largest number in a given array

public class largest{	
public static int getLargest(int numbers[]){
		int largest = Integer.MIN_VALUE;
		for(int i=0;i<numbers.length;i++){
			if(largest<numbers[i]){
				largest = numbers[i];
			}
		}
		return largest;
	}
	public static void main(String[] args) {
		int numbers[]={2,6,9,3,5,4,7};
		System.out.println("Largest number is: "+getLargest(numbers));
	}
}

/* Output
 Largest number is: 9
 */
