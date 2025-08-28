package qspiderTest;

import java.util.HashSet;

public class mingapchar {

	public static void main(String[] args) {
		String s="abcdabcc";
		int min=Integer.MAX_VALUE,k=0;
		for(int i=0;i<s.length();i++) {
			int min1=Math.abs(i-s.indexOf(s.charAt(i),i+1));	
			if(min1<min) {
			 min=min1;	
			 k=i;
			}
		
	}
		System.out.println(s.charAt(k));
	}
}
