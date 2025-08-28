package qspiderTest;

import java.util.*;

public class uniquemail {

	public static void main(String[] args) {
		String [] sa= {"test.email+alex@leetcode.com","test.e.mail+bobcathy@leetcode.com","testemail+david@lee.tcode.com"};
		HashSet hs=new HashSet<>();
	    for(int i=0;i<sa.length;i++)  hs.add(uniqueemail(sa[i]));	
	        
	    System.out.println(hs);
	}
	static String uniqueemail(String s) {
        String [] s1=s.split("@");
        String s2=s1[0];
//        String [] s5=s2.split("\\.");
//        System.out.println(Arrays.toString(s5));
        StringBuilder s3=new StringBuilder();
        for(int i=0;i<s2.length()-1;i++) {
         if(s.charAt(i)!='+') {
        	if(s.charAt(i)!='.')
        	   s3.append(s.charAt(i));
         }
         else break;
        }
        String res=s3+"@"+s1[1];
       return res;
        //System.out.println(res);
        
//        System.out.println(Arrays.toString(s3));
	}

}
//{"testemail@leetcode.com","testemail@lee.tcode.com"}