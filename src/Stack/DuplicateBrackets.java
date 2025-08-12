package Stack;

import java.util.Scanner;
import java.util.Stack;

//((a+b)+((c+d))
//true

public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        Stack<Character> st = new Stack<>();
for(int i = 0; i< str.length(); i++) {
    char ch = str.charAt(i);
    if (ch == ')') {
        if (st.peek() == '(') {
            System.out.println("true");
            return;
        } else {
            while(st.peek() != '(') {
                st.pop();
            }
            st.pop();
        }
    } else {
        st.push(ch);
    }
}
        System.out.println("false");
    }
}
