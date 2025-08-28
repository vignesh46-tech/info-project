package qspiderTest;

import java.util.*;

public class releasetime {

	public static void main(String[] args) {
		int [] re= {9,29,49,50};
		String s="cbcd";
		char key='0';
		List al=new ArrayList<>();
		al.add(re[0]);
		for(int i=1;i<re.length;i++) {
			al.add(Math.abs(re[i]-re[i-1]));
		}
		System.out.println(al);
		for(int i=1;i<al.size();i++) {
			int a=(int)al.get(i-1);
			int b=(int) al.get(i);
			if(a<=b) 
				if(s.charAt(i)-48>key-48) key=s.charAt(i);
	
		}
		System.out.println(key);
		
	}

}
