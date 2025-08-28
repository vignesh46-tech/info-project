package qspiderTest;

import java.util.Stack;

public class adjuremove {

	public static void main(String[] args) {
		Stack<Character> st=new Stack<>();
		String s="abababba";
		for(char ch:s.toCharArray()) {
			if(!st.isEmpty() && st.peek()==ch) 
				st.pop();
			else
			st.push(ch);
			
		}
		System.out.println(st);
	}

}
