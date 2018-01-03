package strings;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StringExercises {

	public String reverseRecursive(String str) {
		if(str == null || str.isEmpty()) return "";
		int len = str.length();
	//	return str.substring(len-1, len) + 
		return str.charAt(len-1) +
			   reverseRecursive(str.substring(0,len-1));	
	}
	public String reverse(String str) {
		StringBuilder sb =new StringBuilder();
		for(int i=str.length()-1; i >= 0;i-- ){
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	public String reverse1(String str) {
		Deque<Character> stack=new ArrayDeque();
		for(int i=0; i< str.length();i++){
			stack.push(str.charAt(i));
		}
		StringBuilder sb=new StringBuilder();
		//Interesting java.util.Stack doesnt work
		for(char c:stack){
			sb.append(c);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		StringExercises se=new StringExercises();
        System.out.println(se.reverse1("abc"));
        System.out.println(se.reverse1(""));
        System.out.println(se.reverse1("a"));
	}

}
