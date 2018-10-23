public class TestMiddle {
    public static void main(String[] args) {
        int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer key=middleSearch(a,9,0,a.length-1);
        System.out.println(key);
    }

    public static Integer middleSearch(int a[], int item, int left, int right) {
        if (left > right) {
            return null;
        }
        int middle = (left + right) / 2;
        if (a[middle] == item) {
            return middle;
        } else if (item > a[middle]) {
            return middleSearch(a, item, middle + 1, right);
        } else {
            return middleSearch(a, item, left, middle - 1);
        }
    }
}
