import java.util.Stack;

public class TestMiddleSearch {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer item = middleSearch1(a, 6, 0, a.length - 1);
        System.out.println(item);
    }

    public static Integer middleSearch(int[] a, int key, int left, int right) {
        if (key < a[left] || key > a[right]) {
            return null;
        }
        int middle = (left + right) / 2;
        if (key == a[middle]) {
            return middle;
        } else if (key < a[middle]) {
            return middleSearch(a, key, left, middle - 1);
        } else {
            return middleSearch(a, key, middle + 1, right);
        }
    }

    public static Integer middleSearch1(int[] a, int key, int left, int right) {
        if (key < a[left] || key > a[right]) {
            return null;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(left);
        stack.push(right);
        while (!stack.empty()) {
            int low = stack.pop();
            int high = stack.pop();
            int middle = (low + high) / 2;
            if (key == a[middle]) {
                return a[middle];
            } else if (key < a[middle]) {
                stack.push(low);
                stack.push(middle - 1);
            } else {
                stack.push(middle + 1);
                stack.push(high);
            }
        }
        return null;
    }
}
