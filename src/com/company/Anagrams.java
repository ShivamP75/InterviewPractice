package com.company;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "manan";
        String s2 = "naman";

        System.out.println(isAnagram(s1, s2));
    }
    public static boolean isAnagram(String s1, String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        s1 = new String(c1);
        s2 = new String(c2);
        return s1.equals(s2);
    }

}
