package qspiderTest;

public class array2d {

	public static void main(String[] args) {
		int [] [] a= {{6,2,3},{4,5,6},{2,7,9}};
		int l=Integer.MAX_VALUE;
		int h=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i][j]<l)
					l=a[i][j];
				if(a[i][j]>h)
					h=a[i][j];
			}
		}
		System.out.println(l+" "+h);

	}

}
