import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<>();
	    	System.out.println("Before remove");
	    list.add(1);
	    list.add(2);
	    list.add(3);
	    list.add(4);
	    list.add(5);
		System.out.println(list);
        System.out.println("After remove");
        list.remove(2);
        System.out.println(list);
    
	}
}
/* Output
  Before remove
[1, 2, 3, 4, 5]
After remove
[1, 2, 4, 5]
  */
