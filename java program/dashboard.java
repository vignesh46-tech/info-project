package qspiderTest;

public class dashboard {

	public static void main(String[] args) {
		int [] a= {4,2,1,7,8,1,2,8,180};
		int k=3,c=0,k1=0,f=0,sum=0;
		for(int i=0;i<a.length;i++) {
			
			sum+=a[i];
			c++;
			
			if(c==k ) {
			  if(sum>k1) 
				k1=sum;
				
			 c--;
			 sum-=a[f++];
		}
		}
		System.out.println(k1);
	}

}
