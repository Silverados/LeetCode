package leetcode;

public class LeetCode771 {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(" " + (int) 'a' + " " + (int) 'z' + " " + (int) 'A' + " " + (int) 'Z');
    }

//    /**
//     * 43ms
//     * S 和 J 最多含有50个字母。
//     * J 中的字符不重复。
//     * 思路：->遍历S，计数字符出现的次数直接相加
//     */
//    public static int numJewelsInStones(String J, String S) {
//        int sum = 0;
//        char[] chars = J.toCharArray();
//        char[] chars1 = S.toCharArray();
//        for (char aChar : chars) {
//            for (char c : chars1) {
//                if (c == aChar) sum++;
//            }
//        }
//        return sum;
//    }

//    /**
//     * 35ms
//     * 不进行转换 直接用字符串
//     */
//    public static int numJewelsInStones(String J, String S) {
//        int sum = 0;
//        for (int i = 0; i < J.length(); i++) {
//            for (int j = 0; j < S.length(); j++) {
//                if(J.charAt(i) == S.charAt(j)) sum++;
//            }
//        }
//        return sum;
//    }

    //    /**
//     *
//     * 15ms
//     * 提高运行效率应该要减少循环的次数 -> 减少S的循环次数，争取遍历一次搞定
//     *
//     */
//    public static int numJewelsInStones(String J, String S) {
//        int sum = 0;
//        for (int i = 0; i < S.length(); i++) {
//            if (J.indexOf(S.charAt(i))!=-1){
//                sum++;
//            }
//        }
//        return sum;
//    }
    public static int numJewelsInStones(String J, String S) {
        int sum = 0;
        char[] chars = J.toCharArray();
        char[] chars1 = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars1.length; j++) {
                if (chars[i] == chars1[j]) sum++;
            }
        }
        return sum;
    }
}
