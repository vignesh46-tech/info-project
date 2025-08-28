package qspiderTest;
import java.util.*;
public class findFLindex {

	public static void main(String[] args) {
		int [] a= {5,7,7,8,8,10};
		int t=6;
		int i=0,j=a.length-1;
		int f=-1, l=0;
		
		while( i!=f || j!=l) {
			if(i==a.length-1 ) break;
			if( a[i]==t) {
		       if(f==-1)  f=i;
			}
		    else if(f==-1) i++;
			
			if(a[j]==t) {
		      if(l==0)  l=j;
			}
		    else if(l==0) j--;
		}
			int [] res= {f,l};
		       System.out.println(Arrays.toString(res));
		
			
//		int f=-1;
//		int l=-1;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==t) {
//			if(f==-1) f=i;
//			l=i;
//		}
//		}
//       int [] res= {f,l};
//       System.out.println(Arrays.toString(res));
	}

}
