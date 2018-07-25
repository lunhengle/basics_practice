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
    public Integer binarySearch(int[] a, int item, int left, int right) {
        if (item > a[right] || item < a[left]) {
            return null;
        }
        int middle = (left + right) / 2;
        if (a[middle] == item) {
            return middle;
        } else if (a[middle] < item) {
            return this.binarySearch(a, item, middle + 1, right);
        } else {
            return this.binarySearch(a, item, left, middle - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        BinarySearch binarySearch = new BinarySearch();
        Integer item = binarySearch.binarySearch(a, 7, 0, a.length - 1);
        System.out.println(item);
    }

}
