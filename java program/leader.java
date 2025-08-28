package qspiderTest;

import java.util.*;

public class leader {

	public static void main(String[] args) {
		int [] a= {16,17,4,3,5,2};
		List<Integer> al=new ArrayList<>();
		int lead=a[a.length-1];
		al.add(lead);
		for(int i=a.length-2;i>=0;i--) {
			if(a[i]>lead) {
				lead=a[i];
				al.add(lead);
			}
		}
		//System.out.println(al.reversed());
       //Collections.swap(al, 0, al.size()-1);
       System.out.println(al);
       //swap internally
       int i=0,j=al.size()-1;
		while(i<j) {
		int temp=al.get(i);
		al.set(i, al.get(j));
		al.set(j, temp);
		i++;
		j--;
		}
		System.out.println(al);
		
	}

}
