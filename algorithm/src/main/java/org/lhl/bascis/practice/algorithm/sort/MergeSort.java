package org.lhl.bascis.practice.algorithm.sort;

/**
 * 快速排序算法.
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
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {0, 5, 6, 9, 4, 7, 3, 8, 2, 1};
        arr = sort(arr, 0, arr.length - 1);
        for (int value : arr) {
            System.out.println(value);
        }
    }

    /**
     * 分.
     *
     * @param arr   数组
     * @param left  左
     * @param right 右
     * @return 最终结果
     */
    public static int[] sort(int[] arr, int left, int right) {
        if (left == right) {
            return new int[]{arr[left]};
        }
        int middle = (left + right) / 2;
        int[] l = sort(arr, left, middle);
        int[] r = sort(arr, middle + 1, right);
        return merge(l, r);
    }

    /**
     * 合.
     *
     * @param l 左
     * @param r 右
     * @returnn 最终结果
     */
    public static int[] merge(int[] l, int[] r) {
        int[] result = new int[l.length + r.length];
        int p = 0;
        int lp = 0;
        int rp = 0;
        while (lp < l.length && rp < r.length) {
            result[p++] = l[lp] < r[rp] ? l[lp++] : r[rp++];
        }
        while (lp < l.length) {
            result[p++] = l[lp++];
        }
        while (rp < r.length) {
            result[p++] = r[rp++];
        }
        return result;
    }
}
