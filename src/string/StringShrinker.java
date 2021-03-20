package string;

public class StringShrinker {
public static void main(String[] args) {
	String s="asss dddd f ghhh jj k"; // Expected O/P - a1s3 d4 f1 g1h3 j2 k1
	StringBuilder sb=new StringBuilder();
	int count=1;
	for(int i=0;i<s.length();i++)
	{
		if(i==s.length()-1 || s.charAt(i)!=s.charAt(i+1))
		{
			if(s.charAt(i)==' ')
				sb.append(s.charAt(i));
			else
			sb.append(s.charAt(i)).append(count);
			count=1;
		}
		else
		{
			count++;
		}
	}
	System.out.print(sb);
}
}
