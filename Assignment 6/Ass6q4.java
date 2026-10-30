 class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 5, 6, 6, 7};

        System.out.println("Input: [1, 2, 5, 5, 6, 6, 7]");

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;

            // Check if element was already printed previously
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                continue;
            }

            // Look ahead for duplicates
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element: " + arr[i]);
                    break;
                }
            }
        }
    }
}