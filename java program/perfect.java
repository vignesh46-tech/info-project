package qspiderTest;

public class perfect {

	public static void main(String[] args) {
		int n=5,s=0;
		for(int i=1;i<n/2;i++) {
		    if(n%i==0)
		    	s+=i;
		}
		if(n==s)
			System.out.println("perfect");
		else
			System.out.println("no perfect");
			
	}

}
