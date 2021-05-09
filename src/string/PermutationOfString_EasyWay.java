package string;

public class PermutationOfString_EasyWay {
	public static void main(String[] args) {
		String str = "ABC";
		printPermutation(str,"");
	
	}

	private static void printPermutation(String ques, String asf) {
		if(ques.length()==0)
			System.out.println(asf);
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String qlp = ques.substring(0, i);
			String qrp = ques.substring(i+1);
			printPermutation(qlp+qrp, asf+ch);
		}
		
	}
	
}