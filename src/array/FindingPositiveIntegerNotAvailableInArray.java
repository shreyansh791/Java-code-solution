package array;

import java.util.HashSet;
import java.util.Set;

public class FindingPositiveIntegerNotAvailableInArray {


    public int solution(int[] A) {
    	int N = A.length;
    	Set<Integer> set = new HashSet<>();
    	for (int a : A) {
    	    if (a > 0) {
    	        set.add(a);
    	    }
    	}
    	for (int i = 1; i <= N + 1; i++) {
    	    if (!set.contains(i)) {
    	        return i;
    	    }
    	}
		return N;
    }
public static void main(String[] args) {
	int A[] = {1,2,3,4,1,6};
	int solution = new Main().solution(A);
	System.out.println(solution);
}

}

