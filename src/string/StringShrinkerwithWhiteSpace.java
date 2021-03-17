package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class StringShrinkerwithWhiteSpace {
public static void main(String[] args) {
	int countSpace=0;
	String s="asss dddd f ghhh jj k";
	Map<String,Object> map=new LinkedHashMap<>();
	for(int i=0;i<s.length();i++)
	{
		if(!map.containsKey(""+s.charAt(i)) && s.charAt(i)!=' ')
		{
			map.put(""+s.charAt(i), 1);
		}
		else if(s.charAt(i)== ' ')
		{
			map.put(""+(countSpace++), " ");
		}
		else if(s.charAt(i)!=' ')
		{
			map.put(""+s.charAt(i), 
					Integer.parseInt(String.valueOf(map.get(""+s.charAt(i))))+1);
		}
	}
		map.entrySet().stream().forEach(i->{
			if(i.getKey().matches("[0-9]")) {
				System.out.print(i.getValue());
			}else
			{
				System.out.print(i.getKey()+i.getValue());	
			}
			
		});
	
}
}
