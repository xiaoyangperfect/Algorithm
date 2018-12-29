public class PartitionSearch {
    private static int search(int[] source, int low, int hight, int target) {
        if (low > hight) {
            return -1;
        }
        int index = (low + hight) / 2;
        if (source[index] == target) {
            return index;
        }
        if (source[index] < target) {
            return search(source, index+1, hight, target);
        } else {
            return search(source, low, index + 1, target);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(search(a, 0, a.length -1, 7));
    }
}
