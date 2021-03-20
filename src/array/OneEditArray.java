package array;

public class OneEditArray {
	public static boolean oneEditArray(String s1,String s2) {
		if(Math.abs(s1.length()-s2.length())>1 && s1.equals(s2))
		{
			return false;
		}
		
		String shorter=s1.length()<s2.length()?  s1:s2;
		String longer=s1.length()>s2.length()?  s1:s2;
		int s=0;
		int l=0;
		int count=0;
		while(s<shorter.length() && l<longer.length())
		{
			if(s1.charAt(s)!=s2.charAt(l))
			{
				count++;
				if(count>1)
				{
					
					return false;
				}
				if(shorter.length()==longer.length())
				{
					s++;
				}
			}
			else
			{
				s++;
			}
			l++;
		}
		return true;
	}
	
	public static void main(String[] args) {
		boolean oneEditArray = oneEditArray("lkkve","live");
		System.out.println(oneEditArray);
	}
}
