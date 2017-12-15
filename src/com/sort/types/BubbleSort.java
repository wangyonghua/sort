package com.sort.types;

/*
     冒泡排序
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] source) {
        for (int i = 0; i < source.length - 1; i++) {
            System.out.println("i:" + i);
            for (int j = 0; j < source.length - i - 1; j++) {
                System.out.println("j" + j);
                if (source[j] > source[j + 1]) {
                    int temp = source[j + 1];
                    source[j + 1] = source[j];
                    source[j] = temp;
                }
            }
        }
        return source;
    }

    public static void main(String[] args) {
        int[] source = {6, 7, 10, 7, 9, 32, 65, 89};
        int[] target = BubbleSort.bubbleSort(source);
        SortUtils.printAll(target);
    }
}
