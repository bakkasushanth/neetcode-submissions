class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> st = new Stack<>();
        int output = 0;
        for(int i =0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int a = st.pop();
                int b = st.pop();
                int result = a+b;
                st.push(result);
                }else if(tokens[i].equals("-")){
                   int a = st.pop();
                int b = st.pop();
                int result = b-a;
                st.push(result);
                }else if(tokens[i].equals("*")){
                    int a = st.pop();
                int b = st.pop();
                
                int result = a*b;
                st.push(result);
                }else if(tokens[i].equals("/")){
                   int a = st.pop();
                int b = st.pop();
                int result = b/a;
                st.push(result);
            }else{
                int a = Integer.parseInt(tokens[i]);
                st.push(a);
            }  
            
                }
return st.pop();
                }
               
}
