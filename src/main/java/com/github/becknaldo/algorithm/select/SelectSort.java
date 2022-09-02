package com.github.becknaldo.algorithm.select;

import com.github.becknaldo.algorithm.data.ArrayData;

import java.util.Arrays;

/**
 * 选择排序
 * @author 马飞海
 * @since 2022/9/1 下午8:13
 */
public class SelectSort {

    public static void select(int[] arr){
        System.out.println(Arrays.toString(ArrayData.arr));
        System.out.println("选择排序开始");
        int times = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    times++;
                    System.out.println("第"+times+"次之后："+Arrays.toString(arr));

                }

            }
        }
    }

    public static void main(String[] args) {
        SelectSort.select(ArrayData.arr);
    }
}
