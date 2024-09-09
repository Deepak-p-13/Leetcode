class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char i :s.toCharArray())
        {
                if(i=='('|| i=='{'|| i=='[')
                {
                    stack.push(i);
                }
                else
                {
                    if(stack.isEmpty())
                    {
                       return false;
                    }
                    else
                    {
                        char top=stack.peek();
                        if(top=='(' && i==')' || top =='[' && i==']' || top=='{' && i=='}')
                        {
                            stack.pop();
                        }
                        else
                        {
                           return  false;
                        }
                    }
                }
        }
         return stack.isEmpty();
    }
}