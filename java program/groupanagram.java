package qspiderTest;

import java.util.*;

public class groupanagram {

	public static void main(String[] args) {
		String[] a= {"eat","tea","ate","nat","bat"};
		





HashMap<String,List<String>> hm=new HashMap<>();
for(int i=0;i<a.length;i++) {
	char [] ch=a[i].toCharArray();
	Arrays.sort(ch);
	String key=new String(ch);
	List<String> val=new ArrayList<>();
	val.add(a[i]);
	if(!hm.containsKey(key)) 
	    hm.put(key, val);	
	else 
	    hm.get(key).add(a[i]);	
	    
	System.out.println(hm);
}}}