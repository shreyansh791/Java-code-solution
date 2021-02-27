package array;

import java.util.Arrays;

public class SumOfPairs {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 8, 7 };
		int target = 10;
		Arrays.sort(a);
		int start=0;
		int end =a.length-1;
		while(start<end)
		{
			if(a[start]+a[end]==target)
			{
				System.out.println(a[start]+" : "+a[end]);
				start++;
				end--;
			}
			else if(a[start]+a[end]>target)
			{
				end--;
			}
			else if(a[start]+a[end]<target)
			{
			start++;	
			}
			
		}
		
	}
}
