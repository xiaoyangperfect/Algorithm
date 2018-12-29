public class QuickSort {

    private static int singleSort(int[] source, int min, int max) {
        int index = source[min];
        while (min < max) {
            while (min < max && index <= source[max]) {
                max--;
            }
            source[min] = source[max];
            while (min < max && index >= source[min]) {
                min++;
            }
            source[max] = source[min];
        }
        source[min] = index;
        return max;
    }

    private static void sort(int[] source, int min, int max) {
        if (min < max) {
            int index = singleSort(source, min, max);
            sort(source, min, index - 1);
            sort(source, index + 1, max);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 7, 9, 3, 5, 2, 8, 4};
        sort(a, 0, a.length - 1);
        for (int index : a)
            System.out.println(index);
    }
}
