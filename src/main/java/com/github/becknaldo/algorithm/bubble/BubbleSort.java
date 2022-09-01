package com.github.becknaldo.algorithm.bubble;

import java.util.Arrays;

/**
 * @author 马飞海
 * @since 2022/9/1 下午5:46
 */
public class BubbleSort {

    /**
     * 冒泡排序
     * @param arr
     */
    public static int[] bubbleSort(int[] arr){
        for (int i=1;i<arr.length;i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr,j);
                }

            }
        }

        return arr;

    }

    public static void swap(int[] arr, int index){
        int temp = arr[index+1];
        arr[index+1] = arr[index];
        arr[index] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,10,7,15,9,11,20,1};
        System.out.println(Arrays.toString(arr));
        BubbleSort.bubbleSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
