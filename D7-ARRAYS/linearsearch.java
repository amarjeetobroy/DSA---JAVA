// linear search
	// find the index of element in a given array

public class linearsearch{	
public static int linearSearch(int numbers[],int key){
		for(int i=0;i<numbers.length;i++){
			if(numbers[i] == key){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int numbers[] = {2,5,6,9,10,56,8,96,32};
		int key = 10;
		int index = linearSearch(numbers,key);
		if(index == -1){
			System.out.println("key is not found");
		}else{
			System.out.println("key is found : "+index);
		}
	}
}

/* Output
 key is found : 4
 */
