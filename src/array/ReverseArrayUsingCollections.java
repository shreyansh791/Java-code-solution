package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayUsingCollections {
	public static void main(String[] args) {
		Integer a[] = { 1, 3, 5, 7 };
		List<Integer> asList = Arrays.asList(a);
		Collections.sort(asList, Collections.reverseOrder());
		Integer[] array = asList.toArray(new Integer[a.length]);
		for(Integer i:a)
			System.out.print(i+" ");
	}
}
