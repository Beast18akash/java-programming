
import java.util.*;

public class FirstProgram {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(20);
        st.push(30);
        st.pop();
        st.pop();
        st.push(90);
        st.pop();

        System.out.println(st);

    }
    
}
