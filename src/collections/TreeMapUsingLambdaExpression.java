package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapUsingLambdaExpression {
public static void main(String[] args) {
	Map<Integer,String> map=new TreeMap<>((i1,i2)->i1>i2?-1:i1<i2?1:0);
	map.put(7, "Shreyansh");
	map.put(8, "Abhishek");
	map.put(9, "Preeti");
	map.put(1, "Manisha");
	map.put(2, "Asif");
	map.put(6, "Raj");
	System.out.println(map);
}
}
