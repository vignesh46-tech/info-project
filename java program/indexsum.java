package qspiderTest;

import java.util.Arrays;

public class indexsum {

	public static void main(String[] args) {
		 int [] a = {2,1,-1};
	    int [] []	aa = {{1, 3}, {0, 5}, {2, 4} };
//	    for(int i=0;i<aa.length;i++) {
//	    	induxsum(aa[i],a);
//	    }		
//
//	}
//	static void induxsum(int [] a,int [] a1) {
//		int sum=0;
//		for(int i=a[0];i<=a[1];i++) {
//			sum+=a1[i];
//		}
//		System.out.println("Sum from " + a[0] + " to " + a[1] + " = " + sum);
//
//	}

	int [] sum=new int[a.length];
	int n=0;
	sum[n]=a[n];
	for(int i=1;i<sum.length;i++) {
		sum[i]=sum[n++]+a[i];
	}
	 System.out.println(Arrays.toString(sum)); 
//	 int res=0;
//	for(int i=0;i<aa.length;i++) {
//		if(aa[i][0]!=0)  res=sum[aa[i][1]]-sum[aa[i][0]-1];
//		else res=sum[aa[i][1]];
//		System.out.println("Sum from " + aa[i][0] + " to " + aa[i][1] + " = " + res);
//	}
	    
	    
	    
	    
	    
	    
	}
}
