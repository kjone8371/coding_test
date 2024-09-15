package 코딩테스트_연습;

import java.util.Stack;

public class 올바른괄호 {

    // 스택을 활용한 코드
//    boolean solution(String s) {
//        Stack<Character> stack = new Stack<>();
//
//        for(int i = 0; i < s.length(); i++){
//            if(s.charAt(i) == '('){
//                stack.push('(');
//            }else if(s.charAt(i) == ')'){
//                if (stack.isEmpty()) {
//                    return false;
//                }
//                stack.pop();
//            }
//        }
//        return stack.isEmpty();
//    }


    // 그냥 하는 코드
    boolean solution(String s) {
        int openCount = 0;
        int closeCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openCount++;
            } else if (s.charAt(i) == ')') {
                closeCount++;
            }
            if (openCount < closeCount) {
                return false;
            }
        }
        if (openCount == closeCount) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        올바른괄호 p = new 올바른괄호();
        System.out.println(p.solution("()()"));
    }
}
