package qspiderTest;
import java.util.*;
public class rev {

	public static void main(String[] args) {
		int n=123456;
		int c=String.valueOf(n).length()/2;
		int f=(int)(n/Math.pow(10, c));
		int s=0;
		while(c>0) {
			s=s*10+(n%10);
			n/=10;
			c--;
		}
		System.out.println(s+""+f);
	}

}
