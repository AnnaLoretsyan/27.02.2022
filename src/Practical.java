import java.util.Stack;

public class Practical {
    public static void main(String[] args) {
        System.out.println(reversString("abc"));



    }
    public static String reversString(String str) {
         Stack<Character> stack= new Stack<Character>();
             String revers = new String();
             for(int i = 0;i<str.length() ;i++){
                 Character character= str.charAt(i);
                 stack.push(character);
             }
             while (!stack.empty()){
                 revers+=stack.pop();


         }
             return revers;
    }
}
