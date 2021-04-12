package string;

public class LongestPalindromeSubString {
	public static void main(String[] args) {
		String s="abba";
		int maxSubstring=0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				boolean palindrome = isPalindrome(s.substring(i, j + 1));
				if(palindrome)
				{
				if(maxSubstring<s.substring(i, j + 1).length())
				{ 
					maxSubstring=s.substring(i, j + 1).length();
					System.out.println(s.substring(i, j + 1)+" max length is "+maxSubstring);
				}
				}
			}
			System.out.println();
		}
	}

	private static boolean isPalindrome(String s) {
	StringBuilder sb=new StringBuilder(s);
//	System.out.println("sb --->"+string+" reverse is "+sb.reverse());
	if(s.equals(sb.reverse().toString()))
	{
		System.out.println(s);
		return true;
	}
	else
		return false;
		
	}
}
