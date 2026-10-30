 class CommonElements {
    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "Oracle", "JAVA"};

        System.out.println("Input:");
        System.out.println("Array 1: [Python, JAVA, C++, SQL]");
        System.out.println("Array 2: [MySQL, SQL, Oracle, JAVA]");
        System.out.print("Output: common element is: [");

        boolean first = true;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    if (!first) {
                        System.out.print(", ");
                    }
                    System.out.print(array1[i]);
                    first = false;
                    break;
                }
            }
        }

        System.out.println("]");
    }
}