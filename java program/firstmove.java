package qspiderTest;

import java.util.*;

public class firstmove {

	public static void main(String[] args) {
		String s="move#hash#to#front";
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='#')
				 c++;
		}
        String [] s1=s.split("#");
        List al=new ArrayList<>();
        for(int i=0;i<c;i++)
        	al.add('#');
        for(String ch:s1)
        	al.add(ch);
        
        String res="";
        for(Object t:al)
        	res+=t;
        System.out.println(res);
	}

}
//	=============sir approach===========	
//StringBuilder hash=new StringBuilder();
//StringBuilder chars=new StringBuilder();
// 
//      for(char ch:s.toCharArray()) {
//	    if(ch=='#') hash.append(ch);
//	    else chars.append(ch);
//     }
//      System.out.println(hash+""+chars);
//	}
//}
//	========sanjay ========
//String s1="";
//for(int i=0;i<s.length();i++) {
//	if(s.charAt(i)=='#') {
//		s1=s.charAt(i)+s1;
//	}
//	else s1+=s.charAt(i);
//}
//System.out.println(s1);
//}
//}