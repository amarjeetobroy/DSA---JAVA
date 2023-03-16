//check if a number is Odd or Even


public class Bitmanipulation{
	public static void OddOrEven(int n){
		int bitMask = 1;
		if((n & bitMask) == 0){
			System.out.println("even number");
		}else{
			System.out.println("Odd number");
		}
	}
	public static void main(String[] args) {
		OddOrEven(7);
		OddOrEven(13);
		OddOrEven(28);
	}
}

/* Output
Odd number
Odd number
even number
*/
