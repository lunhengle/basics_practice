public class TestQuick {
    public static void main(String[] args) {
        int[] a = {4, 3, 7, 6, 8, 9, 0, 1, 2, 5};
        System.out.println("before======");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("after=======");
        quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void quickSort(int[] a, int left, int right) {
        if (left > right) {
            return;
        }
        int low = left;
        int high = right;
        int key = a[left];
        while (low < high) {
            while (low < high && key <= a[high]) {
                high--;
            }
            while (low < high && key >= a[low]) {
                low++;
            }
            if (a[low] > a[high]) {
                int temp = a[low];
                a[low] = a[high];
                a[high] = temp;
            }
        }
        a[left] = a[low];
        a[low] = key;
        quickSort(a, left, low - 1);
        quickSort(a, low + 1, right);
    }
}
