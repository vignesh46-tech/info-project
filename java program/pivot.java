package qspiderTest;

public class pivot {

	public static void main(String[] args) {
      //int [] a= {2,1,-1};
      int [] a= {1,3,7,6,5,6};
      int lsum=0,rsum=0,k=0;
      for(int i=0;i<a.length;i++)  lsum+=a[i]; 
      for(int i=0;i<a.length;i++) {
    	  lsum-=a[i];
    	  if(rsum==lsum) {
    		  k=i;
    	      break;
    	  }
    	  rsum+=a[i];
      }
      System.out.println(k);
	}
}