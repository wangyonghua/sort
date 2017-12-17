package com.sort.types;

public class QuickSort {
    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int privot = partition(a, low, high);  //将表一分为二
            quickSort(a, low, privot - 1);          //递归对低子表递归排序
            quickSort(a, privot + 1, high);        //递归对高子表递归排序
        } else {
            System.out.println("排序结束");
        }
    }

    public static int partition(int a[], int low, int high) {
        int privot = a[low];
        while (low < high) {
            //从右边开始
            while (a[high] > privot && low < high) high--;

            if (low < high) {
                a[low++] = a[high];
            }

            while (a[low] < privot && low < high) low++;

            if (low < high) {
                a[high--] = a[low];
            }
        }
        a[low] = privot;
        print(a);
        return low;
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] source = {10, 7, 9, 6, 7, 32, 65, 89};
        QuickSort.quickSort(source, 0, source.length - 1);
    }
}
