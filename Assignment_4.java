import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Assignment_4 {
    static boolean isValid(String input){
        ArrayList<Character> closing = new ArrayList<>();
        for(char closing_char:"])>}".toCharArray()) closing.add(closing_char);

        ArrayList<Character> opening = new ArrayList<>();
        for(char opening_char:"[(<{".toCharArray()) opening.add(opening_char);

        if(input.length() == 1 || closing.contains(input.charAt(0))){
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for(char input_cahr:input.toCharArray()){
            if(opening.contains(input_cahr)){
                stack.push(input_cahr);
            }
            else {
                if(stack.size()>0){
                    if(!(closing.indexOf(input_cahr) == opening.indexOf(stack.pop()))){
                        return false;
                    }
                }else{
                    return false;
                }

            }
        }
        if(stack.size()>0) return false;
        return true;
    }
    static void reverseSentence(String input){
        Stack<String>stack = new Stack<>();
        ArrayList<String> words= new ArrayList<String>(Arrays.asList(input.split(" ")));
        for(int i = words.size()-1;i>=0;i--){
            stack.push(words.get(i));
        }

        System.out.println(String.join(" ",stack));
    }
    static public void main(String[] args){
        reverseSentence("a b c d e f");
        System.out.println(isValid("()<>(){}[]"));
        System.out.println(isValid("[]["));

    }
}
