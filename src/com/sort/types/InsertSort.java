package com.sort.types;

/*
  插入排序
 */


public class InsertSort {

    public static void insertSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int insertNode = arr[i];
            while (j >= 0 && arr[j] > insertNode) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = insertNode;
            print(arr);
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 56, 67, 89, 54, 9, 10};
        insertSort(arr);
    }
}
