package org.lhl.basics.practice.algorithm.sort;

/**
 * 插入排序.
 * <p>
 * |排序方法	    | 时间复杂度（平均） |时间复杂度（最坏)	|时间复杂度（最好)  |空间复杂度	    |稳定性	|复杂性
 * |直接插入排序  |O(n2)	          |O(n2)	        |O(n)	          |O(1)	        |稳定	|简单
 * |希尔排序	    |O(nlog2n)	      |O(n2)	        |O(n)	          |O(1)	        |不稳定	|较复杂
 * |直接选择排序	|O(n2)	          |O(n2)	        |O(n2)	          |O(1)	        |不稳定	|简单
 * |堆排序	    |O(nlog2n)	      |O(nlog2n)	    |O(nlog2n)	      |O(1)	        |不稳定	|较复杂
 * |冒泡排序	    |O(n2)	          |O(n2)	        |O(n)	          |O(1)	        |稳定	|简单
 * |快速排序	    |O(nlog2n)	      |O(n2)	        |O(nlog2n)	      |O(nlog2n)	|不稳定	|较复杂
 * |归并排序	    |O(nlog2n)	      |O(nlog2n)	    |O(nlog2n)	      |O(n)	        |稳定	|较复杂
 * |基数排序	    |O(d(n+r))	      |O(d(n+r))	    |O(d(n+r))	      |O(n+r)	    |稳定	|较复杂
 *
 * @author lunhengle
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a = {9, 4, 8, 6, 1, 5, 3, 2, 0, 7};
        insertSort(a);
        for (int item : a) {
            System.out.println(item);
        }
    }

    private static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j;
            int temp = a[i];
            for (j = i; j > 0 && temp < a[j - 1]; j--) {
                a[j] = a[j - 1];
            }
            a[j] = temp;
        }
    }


}
