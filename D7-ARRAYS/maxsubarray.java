
	//Max subarray sum 2

public class maxsubarray{	
public static void kadanes(int numbers[]){
		int MS = Integer.MIN_VALUE;
		int cs = 0;
		for(int i=0;i<numbers.length;i++){
			cs = cs + numbers[i];
			if(cs<0){
				cs = 0;
			}
			MS = Math.max(cs,MS);
		}
		System.out.println("our max subarray sum is: " + MS);
	}
	public static void main(String[] args) {
		int numbers[]={-2,-3,4,-1,-2,1,5,-3};
		kadanes(numbers);
	}
}
/* Output 
  our max subarray sum is: 7
  */
