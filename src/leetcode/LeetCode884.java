package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode884 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(uncommonFromSentences("this apple is sweet", "this apple is sweets")));
    }

    public static String[] uncommonFromSentences(String A, String B) {
        Set<String> set = new HashSet<>();
        String[] a = A.split(" ");
        String[] b = B.split(" ");

        Set<String> dupSet1 = new HashSet<>();
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (!"".equals(a[i]) && a[i].equals(a[j])) {
                    dupSet1.add(a[j]);
                }
            }
        }

        Set<String> dupSet2 = new HashSet<>();
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (!"".equals(b[i]) && b[i].equals(b[j])) {
                    dupSet1.add(b[j]);
                }
            }
        }

        Set<String> tempSet = new HashSet<>(Arrays.asList(a));
        a = tempSet.toArray(new String[tempSet.size()]);
        tempSet = new HashSet<>(Arrays.asList(b));
        b = tempSet.toArray(new String[tempSet.size()]);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    a[i] = "";
                    b[j] = "";
                    break;
                }
            }
        }

        for (String s : a) {
            if (s != "") set.add(s);
        }
        for (String s : b) {
            if (s != "") set.add(s);
        }

        for (String s : dupSet1) {
            set.remove(s);
        }
        for (String s : dupSet2) {
            set.remove(s);
        }

        String[] result = set.toArray(new String[set.size()]);
        return result;
    }
}
