import java.util.Arrays;

 class SortArray {
    public static void main(String[] args) {
        int[] arr = {100, 20, 30, 10, 50};

        System.out.println("Input: " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("Output: " + Arrays.toString(arr));
    }
}