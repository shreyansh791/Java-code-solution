package array;

import java.util.Arrays;

public class DuplicateNumbersInArray {
public static void main(String[] args) {
	int a[]= {1,2,3,1,3,4,1,4,3,1,3,5,5,5,5,6};
	Arrays.sort(a);
	int count=1;
	for(int i=0;i<a.length;i++)
	{
		if(i==a.length-1 || a[i]!=a[i+1])
		{
			System.out.println(a[i]+"::: "+count);
			count=1;
		}
		else
		{
			count++;
		}
	}
}
}
