package qspiderTest;

import java.util.Arrays;

public class keyreverse {

	public static void main(String[] args) {
		int [] a= {16,17,4,3,5,2,6,7,9};
	    int k=2;
	    int i=0,j=k-1;
	    while(j<a.length){
	      while(i<j) {
	        int temp=a[i];
	         a[i]=a[j];
	         a[j]=temp;
	         i++;
	         j--;
	         
	   }
	  i=k+i-1;
	  j=k+j+1;
	   
	}
	   j=a.length-1;   
	   while(i<j) {
		   int temp=a[i];
	         a[i]=a[j];
	         a[j]=temp;
	         i++;
	         j--; 
	   }
	    
	   System.out.println(Arrays.toString(a));
	}
}
//		for(int f=0;f<a.length;f+=k) {
//			int i=f;
//			int j=Math.min(f+k-1, a.length-1);
//			 while(i<j) {
//			     int temp=a[i];
//			      a[i]=a[j];
//			      a[j]=temp;
//			       i++;
//			       j--;
//			   }
//			  
//		}
//		 System.out.println(Arrays.toString(a));
//	}}

//		
		//SWAP ADJUCENT ELEMENT
//		for(int i=0;i<a.length-1;i+=2) {
//			int temp=a[i+1];
//		      a[i+1]=a[i];
//	          a[i]=temp;
//			
//		}
//		 System.out.println(Arrays.toString(a));
//	}
//}
