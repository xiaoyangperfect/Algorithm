public class Main {

    private static void insertSort(int[] source) {
        for (int i = 0; i < source.length; i++) {
            for (int j = i; j > 0; j--) {
                if (source[j] < source[j-1]) {
                    int temp = source[j];
                    source[j] = source[j-1];
                    source[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 7, 9, 3, 5, 2, 8, 4};
        insertSort(a);
        for (int index : a)
            System.out.println(index);
    }
}
