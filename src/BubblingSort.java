public class BubblingSort {
    private static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
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


