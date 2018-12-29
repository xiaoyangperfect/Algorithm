public class InsertSort {
    private static void sort(int[] source) {
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < i; j++) {
                if (source[i] < source[j]) {
                    int temp = source[i];
                    source[i] = source[j];
                    source[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 7, 9, 3, 5, 2, 8, 4};
        sort(a);
        for (int index : a)
            System.out.println(index);
    }
}
