package org.lhl.bascis.practice.algorithm.search;

/**
 * 二分查找法.
 *
 * @author lunhengle
 */
public class BinarySearch {

    /**
     * 二分查找.
     *
     * @param a     数组
     * @param item  要查找元素
     * @param left  左边界
     * @param right 右边界
     * @return 返回位置
     */
    public static Integer binarySearch(int[] a, int item, int left, int right) {
        if (item < a[left] || item > a[right]) {
            return null;
        }
        int middle = (left + right) / 2;
        if (item == a[middle]) {
            return middle;
        } else if (item < a[middle]) {
            return binarySearch(a, item, left, middle - 1);
        } else {
            return binarySearch(a, item, middle + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer item = binarySearch(a, 7, 0, a.length - 1);
        System.out.println(item);
    }

}
