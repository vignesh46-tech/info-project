package qspiderTest;

import java.util.*;

public class uniquepair {

	public static void main(String[] args) {
		int [] a= {1,2,3};
		int k=1;
		int c=0;
		List al=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++){
				if(Math.abs(a[i]-a[j])==k) {
					if(al.contains(a[i]) && al.contains(a[j])) {
					 continue;
					}
					else {
						c++;
						al.add(a[i]);
						al.add(a[j]);
					}
				}
			}
		}
		System.out.println(c);
		
//		HashMap<Integer,Integer> hs=new HashMap<>();
//		for(int ele:a) {
//			hs.put(ele, hs.getOrDefault(ele, 0)+1);
//		}
//		
//	 if(k==0) {
//		 for(int val:hs.values())
//			 if(val>1) c++;
//	 }
//	 else {
//		 for(int ele:hs.keySet()) 
//			 if(hs.containsKey(ele+k)) c++;
//	 }
//       System.out.println(c);
	}

}
