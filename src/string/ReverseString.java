package string;

public class ReverseString {
	public static void main(String[] args) {
		new ReverseString().reverseString("Shreyansh".toCharArray());
		
	}

	private void reverseString(char[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			char temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println(arr);
	}
}
