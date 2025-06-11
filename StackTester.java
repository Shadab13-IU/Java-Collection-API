package mypkg;
import java.util.Stack;
class StackTester{
	public static void main(String[] arsg){
		Stack<String> st=new Stack<>();
		st.push("Lucknow");
		st.push("Kanpur");
		st.push("unnao");
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
}
