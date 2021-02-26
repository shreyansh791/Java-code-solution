package string;

public class ReverseStringWithoutSpecialCharacters {
public static void main(String[] args) {
	String s="s!h@r#e#y!@!ansh";	
	int start=0;
	int end=s.length()-1;
	char[] charArray = s.toCharArray();
	while(start<end)
	{
		if(!Character.isAlphabetic(charArray[start]))
		{
			start++;
		}
		else if(!Character.isAlphabetic(charArray[end]))
		{
			end--;
		}
		else
		{
			char temp=charArray[start];
			charArray[start]=charArray[end];
			charArray[end]=temp;
			start++;
			end--;
		}
	}
	System.out.println(charArray);
}
}
