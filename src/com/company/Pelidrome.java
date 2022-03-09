package com.company;

public class Pelidrome {
    public static void main(String[] args) {
        String s = "indnia";

        System.out.println(isPalidrome(s));
    }

    public static boolean isPalidrome(String s){
        int i = 0;
        int j = s.length()-1;

        while(i != j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }




}
