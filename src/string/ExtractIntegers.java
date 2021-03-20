package string;

import java.util.ArrayList;
import java.util.List;

public class ExtractIntegers {
public static void main(String[] args) {
	String s="ab cc 4 d  1897 5 22  k3k1 88 9d";
	StringBuilder sb=new StringBuilder();
	List<String> list=new ArrayList<>();
	for(int i=0;i<s.length();i++)
	{
		char character = s.charAt(i);
		if(((int)character)>48  && ((int)character) < 58)
		{
			sb.append(character);
		}
		else
		{
			if(!sb.isEmpty()) {
				list.add(sb.toString());
				sb.delete(0, sb.length());
			}
		}
	}
	System.out.println(list);
}
}
