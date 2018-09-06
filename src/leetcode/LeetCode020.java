package leetcode;

import java.util.Stack;

public class LeetCode020 {
    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }

    public static boolean isValid(String s) {
        Stack stack = new Stack();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == '[' || aChar == '{' || aChar == '(') {
                stack.push(aChar);
            } else {
                if (stack.empty()) return false;
                if (aChar == ']') {
                    if ('[' != (char) stack.pop()) return false;
                } else if (aChar == '}') {
                    if ('{' != (char) stack.pop()) return false;
                } else if (aChar == ')') {
                    if ('(' != (char) stack.pop()) return false;
                }
            }
        }
        return stack.empty();
    }

//    public static boolean isValid(String s) {
//        List<Character> list = new ArrayList<>();
//        char[] chars = s.toCharArray();
//        for (char aChar : chars) {
//            if (aChar=='['||aChar=='{'||aChar=='('){
//                list.add(aChar);
//            } else if (aChar==']'){
//                if (!list.contains('[')) return false;
//                else list.remove(new Character('['));
//            } else if (aChar=='}') {
//                if (!list.contains('{')) return false;
//                else list.remove(new Character('{'));
//            }else if (aChar==')') {
//                if (!list.contains('(')) return false;
//                else list.remove(new Character('('));
//            }
//        }
//        return list.isEmpty();
//    }
}
