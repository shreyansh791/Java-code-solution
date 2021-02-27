package array;

public class LeftRotateArrayBy1Element {
	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 7, 9 }; // 3,5,7,9,1
		int start=a[0];
		for(int i=1;i<a.length;i++)
		{
			a[i-1]=a[i];
		}
		a[a.length-1]=start;
		for (int temp : a)
			System.out.print(temp);
	}
}
