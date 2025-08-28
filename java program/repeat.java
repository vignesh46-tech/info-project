package qspiderTest;
import java.util.*;
public class repeat {

	public static void main(String[] args) {
		int [] a= {0,0,0,-2,-1};
		int min=10;
		List al=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			if(al.contains(a[i])) min=Math.min(min, (int) al.indexOf(a[i]));
			else if(a[i]>0) al.add(a[i]);
		}
		if(al.size()==0) System.out.println(20);
		else System.out.println(a[min]);
	}

}
