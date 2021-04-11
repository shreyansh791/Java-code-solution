package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<NameComparator> list = new ArrayList<>();
		NameComparator NameComparator = new NameComparator("Shreyansh", 2);
		NameComparator NameComparator2 = new NameComparator("Aman", 1);
		NameComparator NameComparator3 = new NameComparator("Sanjeev", 5);
		NameComparator NameComparator4 = new NameComparator("Shekhar", 3);
		NameComparator NameComparator5 = new NameComparator("Bharat", 4);
		list.add(NameComparator);
		list.add(NameComparator2);
		list.add(NameComparator3);
		list.add(NameComparator4);
		list.add(NameComparator5);
//		Collections.sort(list,new NameComparator());
//		list.forEach(i->System.out.println(i.getName()));
		Collections.sort(list,(i1,i2)->i1.getName().compareTo(i2.getName())>1?-1:
			i1.getName().compareTo(i2.getName())<1?1:0);
		list.forEach(i->System.out.print(i.getName()+" "));
		
		

		
		List<IdComparator> list1 = new ArrayList<>();
		IdComparator id1 = new IdComparator("Shreyansh", 2);
		IdComparator id2 = new IdComparator("Aman", 1);
		IdComparator id3 = new IdComparator("Sanjeev", 5);
		IdComparator id4 = new IdComparator("Shekhar", 3);
		IdComparator id5 = new IdComparator("Bharat", 4);
		list1.add(id1);
		list1.add(id2);
		list1.add(id3);
		list1.add(id4);
		list1.add(id5);
		
		
		/*
		 * Collections.sort(list1,new IdComparator());
		 * list1.forEach(i->System.out.println(i.getId()));
		 */
		
		System.out.println();
		Collections.sort(list1,(i1,i2)->i1.getId()>i2.getId()?-1:i1.getId()<i2.getId()?1:0);
		list1.forEach(i->System.out.print(i.getId()+" "));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
