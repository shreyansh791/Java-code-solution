package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharactersInGivenString {
	public static void main(String[] args) {
		String s = "cnssjcnss";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			} else {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}
		}
		System.out.println("First non repeated Character is "+
		map.entrySet().stream().filter(i -> i.getValue() == 1).findFirst().get().getKey());
	}
}
