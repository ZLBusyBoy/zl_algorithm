/*
 * InsertionSort.java  * Created on  2019/3/3
 * Copyright (c) 2019 YueTu
 * YueTu TECHNOLOGY CO.,LTD. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * YueTu Ltd. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you
 * entered into with YueTu Ltd.
 */
package InsertionSort;

/**
 * @author ling.zhang
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {4,5,6,1,3,2};
        insertionSort(a,6);
        System.currentTimeMillis();
    }

    // 插入排序，a 表示数组，n 表示数组大小
    public static void insertionSort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 1; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
            // 查找插入的位置
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    a[j+1] = a[j];  // 数据移动
                } else {
                    break;
                }
            }
            a[j+1] = value; // 插入数据
        }
    }

}
