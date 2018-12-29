public class SelectSort {

    private static void sort(int[] source) {
        for (int i = 0; i < source.length; i++) {
            int index = 0;
            for (int j = 0; j < source.length - i - 1; j++) {
                if (source[index] < source[j+1]) {
                    index = j+1;
                }
            }
            int temp = source[index];
            source[index] = source[source.length-1 - i];
            source[source.length-1-i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 7, 9, 3, 5, 2, 8, 4};
        sort(a);
        for (int index : a)
            System.out.println(index);
    }
}
