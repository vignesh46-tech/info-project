package qspiderTest;
import java.util.*;
public class compressstring {
	
	public static void main(String[] args) {
//		
//		String s="abbccdd";
//		int c=1;
//		StringBuilder sb=new StringBuilder();
//		for(int i=1;i<s.length();i++) {
//			char curr=s.charAt(i);
//			char pre=s.charAt(i-1);
//			if(curr==pre) c++;
//			else {
//				sb.append(pre);
//				if(c>1) {
//					sb.append(c);
//					c=1;
//				}
//			}
//		  if(i==s.length()-1) {
//			  sb.append(curr);
//			  if(c>1)  
//			    sb.append(c);  
//		  }
//		}
//			
//		System.out.println(sb);
//	
//}  //		char last=s.charAt(s.length()-1);
////	sb.append(last);
////if(c>1) {
////		sb.append(c);
//
//
////========OWN METHOD============	
//		
//	}
		String s="abbccc";
		int c=1;
		List a=new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					c++;
				}
			}
			if(c==1) {
				if(!a.contains(s.charAt(i)))
				   a.add(s.charAt(i));
			}
			else {
				if(!a.contains(s.charAt(i))) {
				   a.add(s.charAt(i));
				   a.add(c);
				}
				c=1;
			}
		}
		String s2="";
		for(Object t:a) {
			s2+=t;
		}
		System.out.println(s2);
	}
}


