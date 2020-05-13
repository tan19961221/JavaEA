package club.banyuan.blog.java;
/*给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
        有效字符串需满足：
        左括号必须用相同类型的右括号闭合。
        左括号必须以正确的顺序闭合。
        注意空字符串可被认为是有效字符串。*/
import java.util.Stack;

public class Java2 {
    public boolean isValid(String s) {
        if (s==null){
            return false;
        }
        if (s.length()==0){
            return true;
        }
        Stack<Character> stack= new Stack<Character>();

        for(char c:s.toCharArray()){
            if (c==' '){
                continue;
            }

            if(c=='(' ||c=='['||c=='{')
                stack.push(c);

            else {
                if (stack.isEmpty()){
                    return false;
                }
                Character top=stack.peek();
                if( (top=='('&&c==')') || (top=='['&&c==']') || (top=='{'&&c=='}'))
                {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
