package qspiderTest;

import java.util.*;

public class subsort {

	public static void main(String[] args) {
		String s="abdc";
	   List<String> al=new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			al.add(""+s.charAt(i));
			for(int j=i+1;j<s.length();j++) {
				al.add(s.charAt(i)+""+s.charAt(j));
				//al.add(s.substring(i, j+1));
			}
		}
		Collections.sort(al);
        System.out.println(al.getLast());
	}

}
