class Solution {
    public boolean isValid(String s) {

        if(s == null || s.length()%2 != 0)
            return false;
        
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            Character ch = s.charAt(i);
            if(ch=='[' || ch=='{' || ch=='(')
                stack.push(ch);
            else {
                if(stack.isEmpty())
                    return false;

                char top = stack.pop();
                if(ch == ']' && top != '[')
                    return false;
                if(ch == '}' && top != '{')
                    return false;
                if(ch == ')' && top != '(')
                    return false;
            }
        }
        return stack.isEmpty();
        
    }
}
