import java.util.Stack;

public class TestQuick {
    public static void main(String[] args) {
        int a[] = {9, 4, 6, 8, 3, 7, 2, 1, 0, 5};
        quickSort1(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void quickSort(int[] a, int left, int right) {
        Stack<Pair> pairStack = new Stack<>();
        pairStack.push(new Pair(left, right));
        while (!pairStack.empty()) {
            Pair pair = pairStack.pop();
            int low = pair.left, high = pair.right;
            if (low > high) {
                continue;
            }
            int index = partition(a, low, high);
            pairStack.push(new Pair(low, index - 1));
            pairStack.push(new Pair(index + 1, high));
        }
    }

    public static void quickSort1(int[] a, int left, int right) {
        if (left > right) {
            return;
        }
        int index = partition(a, left, right);
        quickSort1(a, left, index - 1);
        quickSort1(a, index + 1, right);
    }

    private static int partition(int a[], int left, int right) {
        int low = left, high = right, key = a[left];
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
        return low;
    }

    static class Pair {
        private Integer left;
        private Integer right;

        public Pair(Integer left, Integer right) {
            this.left = left;
            this.right = right;
        }
    }
}
