class Main {

    public static void main(String[] args) {
        invertArray();
        System.out.println();
        fillArray();
        System.out.println();
        fillArray2();
        System.out.println();
        fillDiagonal();
        System.out.println();
        int[] arr = initArray(10, 5);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println();
        findMinMax();
    }

    static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void fillArray2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] = arr[i] * 2;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillDiagonal() {
        int[][] arr = new int[11][11];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i == j) || (i == arr.length - 1 - j))
                    arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] initArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void findMinMax() {
        int[] arr = {1, 5, 3, 2, 11, 4, -5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        int min = Integer.MAX_VALUE;
        int max = - Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}







