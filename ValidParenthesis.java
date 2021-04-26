package LeetcodeEasy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//Using a hash map to input each individual pair of parenthesis, then looping through
//the string and adding the chars to the stack when they appear
//If the  char  value pair is in the hash map, then check if the stack is empty 
//or if when it is popped is equal to the beginning string
public class ValidParenthesis {
	static Map<Character, Character> mappings = new HashMap<>();
    static {
        mappings.put('(', ')');
        mappings.put('[', ']');
        mappings.put('{', '}');
    }
    
    public boolean isValid(String s) {
        Stack<Character> parenthesis = new Stack <>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mappings.containsKey(c)) {
                parenthesis.push(mappings.get(c));
            }
            
            else if (mappings.containsValue(c)) {
                if (parenthesis.isEmpty() || parenthesis.pop() != c) {
                    return false;
                }
            }
            
        }
        
        return parenthesis.isEmpty();
    }
}
