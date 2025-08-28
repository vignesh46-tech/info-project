package qspiderTest;

public class subsum {

	public static void main(String[] args) {
		int sum=0,target=13,c=0;
		int [] a= {1,2,33,7,6};
		if(issubsum(a,target)) System.out.println("true");
		else System.out.println("false");
//		for(int i=0;i<a.length;i++) {
//			sum=0;
//			for(int j=i;j<a.length;j++) {
//			  sum+=a[j];
//			  if(sum==target) {  
//				c++;
//				break;
//			  }
//			}
//		}
//      if(c==0) System.out.println("false");
//      else System.out.println("true");
	}
	//SLIDING WINDOW
	public static boolean issubsum(int [] a,int key) {
		int start =0,sum=0;
		for(int end=0;end<a.length;end++) {
			sum+=a[end];
			while(sum>key  && start<=end) {
				sum-=a[start++];
			}
			if(sum==key) return true;
		}
		return false;
	}

}
