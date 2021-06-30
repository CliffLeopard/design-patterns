package com.cliff.patterns.algorithm;

public class ShellSort {

    public static void main(String[] args) {
        int[] array = new int[]{10, 7, 3, 5, 1, 2, 9, 8, 4, 6};
        ShellSort.shellSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void shellSort(int[] array) {
        if (array == null || array.length < 2) return;
        int n = array.length;
        // 对每组间隔为 h的分组进行排序，刚开始 h = n / 2;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            //对各个局部分组进行插入排序
            for (int i = gap; i < n; i++) {
                // 将arr[i] 插入到所在分组的正确位置上
                insertI(array, gap, i);
            }
        }
    }

    /**
     * 将arr[i]插入到所在分组的正确位置上
     * arr[i]] 所在的分组为 ... arr[i-2*h],arr[i-h], arr[i+h] ...
     */
    private static void insertI(int[] arr, int gap, int i) {
        int temp = arr[i];
        int k;
        for (k = i - gap; k >= 0 && temp < arr[k]; k -= gap) {
            arr[k + gap] = arr[k];
        }
        arr[k + gap] = temp;
    }
}