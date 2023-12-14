package DSA;

import java.util.Arrays;
import java.util.HashMap;

public class FindTheDifference {

    public static void getDifference(String s, String t){
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        int i=0;
        int j=0;

        while (i<s1.length && j<t1.length){
            if (s1[i] == t1[j]){
                i++;
                j++;
                continue;
            }else {
                System.out.println(t1[j]);
                break;
            }
        }
        System.out.println(t1[j]);
    }

    public static void main(String[] args) {
        String s = "";
        String t = "w";
        getDifference(s,t);
    }
}
