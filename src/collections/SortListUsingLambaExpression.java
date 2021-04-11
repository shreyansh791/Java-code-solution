package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListUsingLambaExpression {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add(8);
	list.add(18);
	list.add(48);
	list.add(91);
	list.add(15);
	list.add(17);
	System.out.println("In Ascending Order..");
	Collections.sort(list, (i1,i2)->i1>i2?+1:i1<i2?-1:0);
	System.out.println(list);
	System.out.println("In Descending Order..");
	Collections.sort(list, (i1,i2)->i1>i2?-1:i1<i2?+1:0);
	System.out.println(list);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
