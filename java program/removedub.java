package qspiderTest;

import java.util.*;

public class removedub {

	public static void main(String[] args) {
		String []a= {"a","b","c","a","c","b"};
		Set  hs=new HashSet<>();
		List al=new ArrayList<>();
		for(String k:a) {
			//if(!(al.contains(k))) //0(n) bcz arraylist
			if(!(al.contains(k)))  //0(1) bcz hashset
				al.add(k);
			    hs.add(k);
		}
		System.out.println(al);
	}

}
