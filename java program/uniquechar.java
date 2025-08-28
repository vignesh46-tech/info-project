package qspiderTest;

public class uniquechar {

	public static void main(String[] args) {
		String s ="dddccdbba";
		 int c=0;
	       if(s.length()==1) System.out.println("break");
	        for(int i=0;i<s.length()-1;i++){
	            c=0;
	            for(int j=i+1;j<s.length();j++){
	               if(s.charAt(i)!='1' && s.charAt(i)==s.charAt(j)){
	                 c++;
	                 s=s.replace(s.charAt(j),'1');
	               }
	            }
	            System.out.println(s);
	             if(s.charAt(i)!='1'  && c==0) System.out.println(i);
	        }
	}

}
