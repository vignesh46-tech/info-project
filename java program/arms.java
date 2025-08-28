package qspiderTest;

public class arms {

	public static void main(String[] args) {
		int s=153,c=0,n=s,k=0,b=0,t=s;
		while(0<s) {
			s/=10;
			c++;
		}
		System.out.println(c);
		while(n>0) {
			k=n%10;
			int a=1;
		for(int i=0;i<c;i++) {
			a*=k;
		}
        b+=a;
        n/=10;
     }
		if(t==b)
			System.out.println("arms");
		else 
			System.out.println("no arms");
	}
	
}
