import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> list = new ArrayList<>();
	    	System.out.println("Before set");
	    list.add(1);
	    list.add(2);
	    list.add(3);
	    list.add(4);
	    list.add(5);
		System.out.println(list);
        System.out.println("After set");
        list.set(2, 10);
        System.out.println(list);
    
	}
}
/* Output
  Before set
[1, 2, 3, 4, 5]
After set
[1, 2, 10, 4, 5]
  */
