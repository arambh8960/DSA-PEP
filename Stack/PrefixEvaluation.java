import java.util.*;

class Main {

    public static int prefixEval(String s){

        // Step 1: create stack
        Stack<Integer> st = new Stack<>();

        // Step 2: traverse from right to left
        for(int i = s.length() - 1; i >= 0; i--){

            char ch = s.charAt(i);

            // Step 3: if operand push
            if(Character.isDigit(ch)){
                st.push(ch - '0');
            }
            else{   // Step 4: operator

                int op1 = st.pop();
                int op2 = st.pop();

                int result = 0;

                if(ch == '+') result = op1 + op2;
                else if(ch == '-') result = op1 - op2;
                else if(ch == '*') result = op1 * op2;
                else if(ch == '/') result = op1 / op2;

                // Step 5: push result
                st.push(result);
            }
        }

        // Step 6: last remaining element is answer
        return st.pop();
    }

    public static void main(String[] args){
        String s = "-+7*45+20";   // example prefix
        System.out.println(prefixEval(s));
    }
}
