package com.company;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2, 1, 3, 3};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
