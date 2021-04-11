package collections;

import java.util.Set;
import java.util.TreeSet;

public class SortTreeSetUsingLambdaExpression {
	public static void main(String[] args) {
		Set<Integer> list=new TreeSet<>();
		list.add(1);
		list.add(3);
		list.add(7);
		list.add(2);
		list.add(9);
		System.out.println(list);
		
		System.out.println("Sorting in Descending Order....");
		
		Set<Integer> list1=new TreeSet<>((i1,i2)->i1>i2?-1:i1<i2?+1:0);
		list1.add(1);
		list1.add(3);
		list1.add(7);
		list1.add(2);
		list1.add(9);
		System.out.println(list1);
		
		
	}
}