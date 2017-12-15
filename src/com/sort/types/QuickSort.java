package com.sort.types;

public class QuickSort {
    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int privotLoc = partition(a, low, high);  //将表一分为二
            quickSort(a, low, privotLoc - 1);          //递归对低子表递归排序
            quickSort(a, privotLoc + 1, high);        //递归对高子表递归排序
        }
    }

    public static int partition(int a[], int low, int hign) {
        int standardKey = a[low];
        while (low < hign) {
            //从右边开始
            while (a[hign] > standardKey && low < hign) hign--;
            swap(a, low, hign);

            while (a[low] < standardKey && low < hign) low++;
            swap(a, low, hign);
        }
        System.out.println("low:" + low);
        return low;
    }

    public static void swap(int a[], int index, int index1) {
        int temp = a[index1];
        a[index1] = a[index];
        a[index] = temp;
    }

    public static void main(String[] args) {
        int[] source = {10, 7, 9, 6, 7, 32, 65, 89};
        QuickSort.quickSort(source, 0, source.length - 1);
        SortUtils.printAll(source);
    }
}
