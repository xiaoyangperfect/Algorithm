public class MergeSort {

    private static void merge(int[] source, int min, int mid, int max) {
        int[] current = new int[max - min + 1];
        int right = mid + 1;
        int index = 0;
        int low = min;
        while (min <= mid && right <= max) {
            if (source[min] > source[right]) {
                current[index] = source[right];
                right++;
            } else {
                current[index] = source[min];
                min++;
            }
            index++;
        }

        while (min <= mid) {
            current[index] = source[min];
            min++;
            index++;
        }
        while (right <= max) {
            current[index] = source[right];
            right++;
            index++;
        }

        for (int i = 0; i < current.length; i++) {
            source[low + i] = current[i];
        }
    }

    private static void sort(int[] source, int min, int max) {
        if (min < max) {
            int index = (min + max) / 2;
            sort(source, min, index);
            sort(source, index + 1, max);
            merge(source, min, index, max);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 7, 9, 3, 5, 2, 8, 4};
        sort(a, 0, a.length - 1);
        for (int index : a)
            System.out.println(index);
    }
}
