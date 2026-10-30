 class AverageArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.println("Input: [1, 2, 3, 4, 5]");
        System.out.println("Average value of array elements is : " + average);
    }
}