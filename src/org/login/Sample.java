package org.login;
import java.util.*;
public class Sample {
public static void main(String[] args) {
	String s = "victoriasecret";
	char[] c = s.toCharArray();
	Map<Character, Integer> m = new LinkedHashMap();
	for(int i=0; i<c.length; i++) {
		if(m.containsKey(c[i])) {
			m.put(c[i], m.get(c[i])+1);
		}
		else {
			m.put(c[i], 1);
		}
	}
	System.out.println(m);
	
}
}
