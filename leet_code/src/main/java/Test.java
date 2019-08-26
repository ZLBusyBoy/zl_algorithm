/*
 * Test.java  * Created on  2019/8/26
 * Copyright (c) 2019 YueTu
 * YueTu TECHNOLOGY CO.,LTD. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * YueTu Ltd. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you
 * entered into with YueTu Ltd.
 */

/**
 * @author ling.zhang
 */
public class Test {

    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>=high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = arr[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
    }


    public static void xuanze(int[] array,int n){
        for (int i=0;i<n;i++){
            int minKey = array[i];
            for (int j=i;j<n;j++){
                if (minKey > array[j]) {
                    int temp = array[j];
                    array[j] = minKey;
                    minKey = temp;
                }
            }
            array[i] = minKey;
        }
    }

    public static void charu(int[] array,int n){
        for (int i=1;i< n;i++){
            int newElement = array[i];
            int j = i-1;
            for (;j>=0;--j){
                if (newElement < array[j]){
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = newElement;

        }
    }


    public static void maopao(int[] array,int n){

        for (int i=0;i<n;i++){
            boolean hasChange = false;
            for (int j=0; j<n -1 - i;j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    hasChange = true;
                }

            }
            if (!hasChange){
                break;
            }
        }
    }

    public static void main(String[] args) {
 /*       int[] array = {10,2,23,14,55,26,17,8,19};
        xuanze(array,array.length);
        System.currentTimeMillis();
*/
        int[] arr = {10,2,23,14,55,26,17,8,19};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        //10 2 8 14 55 26 17 23 19
        //2 8 10 14 55 26 17 23 19

        // 2 8

        //       14

    }
}
