package stack;
// The line `package stack;` is declaring that the Java file belongs to the `stack` package. Packages
// in Java are used to organize classes and interfaces into namespaces, which helps in avoiding naming
// conflicts and provides a way to group related classes together. In this case, the `DuplcateBracket`
// class is part of the `stack` package.
import java.util.*;


public class DuplcateBracket {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            String str = scn.nextLine();

            Stack<Character> st = new Stack<>();
            for(int i = 0; i<str.length();i++){
                char ch  = str.charAt(i);
                if (ch == ')'){
                    if (st.peek() == '(') {
                        System.out.println(true);
                        return ;
                    }
                    else {
                        while (st.peek()!='(') {
                            st.pop();
                        }
                        st.pop();
                    }
                } else{
                    st.push(ch);
                }
            }
            System.out.println(false);
        }
    }
}