package com.sort.types;

public class SortUtils {
    public static String printAll(int[] target) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < target.length; i++) {
            stringBuilder.append(target[i] + ",");
        }
        String s = stringBuilder.toString();
        return s.substring(0, s.length() - 1);
    }
}
