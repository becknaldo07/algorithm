package com.github.becknaldo.algorithm.bubble;

import com.github.becknaldo.algorithm.data.ArrayData;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author 马飞海
 * @since 2022/9/1 下午5:46
 */
public class BubbleSort {

    /**
     * 冒泡排序
     * @param arr
     */
    public static int[] bubbleSort(int[] arr){
        System.out.println(Arrays.toString(ArrayData.arr));
        System.out.println("冒泡排序开始");
        int times = 0;
        for (int i=0;i<arr.length;i++) {
            //从数组第一个元素开始，与往后的每一个比较
            for (int j = i+1; j < arr.length; j++) {
                //从小到大排序，依次进行
                if (arr[i] > arr[j]) {
                    //交换数组位置
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    times++;
                    System.out.println("第"+times+"次之后："+Arrays.toString(arr));

                }
            }
        }
        return arr;

    }

    public static void main(String[] args) {

        BubbleSort.bubbleSort(ArrayData.arr);
    }
}
