package string;

public class FirstNonRepeatedCharactersInGivenStringUsingArray {
	private static final int ASCII_CODE=256;
	public static int findNonRepeatedCharacter(String str) {
		
		int result[]=new int[ASCII_CODE];
		
		for(int i=0;i<str.length();i++)
		{
			result[str.charAt(i)]++;
		}
		
		for(int i=0;i<str.length();i++)
		{
			if(result[str.charAt(i)] == 1)
			{
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		String str="cnssjcnss";
		int findNonRepeatedCharacter = findNonRepeatedCharacter(str);
		System.out.println(findNonRepeatedCharacter==-1?"all characters are repeated or empty string "
				:str.charAt(findNonRepeatedCharacter));
		
		
	}
}
