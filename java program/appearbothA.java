package qspiderTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class appearbothA {

	public static void main(String[] args) {
		int [] a= {1,2,2,2,1};
		int [] b= {2,2};
		HashMap<Integer,Integer>  hm=new HashMap<>();
		for(int ele:a)
			hm.put(ele,hm.getOrDefault(ele, 0)+1);
		ArrayList<Integer> res=new ArrayList<>();
		for(int ele:b) {
			if(hm.containsKey(ele)  && hm.get(ele)>0) {
				res.add(ele);
				hm.put(ele, hm.get(ele)-1);
			}
		}
		int [] res1=new int[res.size()];
		for(int i=0;i<res.size();i++)
		{
			res1[i]=res.get(i);
		}
		System.out.println(Arrays.toString(res1));
		
	}

}
