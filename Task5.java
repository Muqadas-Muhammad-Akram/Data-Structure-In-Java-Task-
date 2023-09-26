public class Task5 {
    public static int[] findProduct(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        // Calculate the product of all elements on the left side of each index
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= arr[i];
        }

        // Calculate the product of all elements on the right side of each index
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] result1 = findProduct(arr1);
        System.out.println("Modified array 1:");
        for (int num : result1) {
            System.out.print(num + " ");
        }

        System.out.println(); // Print a newline

        int[] arr2 = {4, 2, 1, 5, 0};
        int[] result2 = findProduct(arr2);
        System.out.println("Modified array 2:");
        for (int num : result2) {
            System.out.print(num + " ");
        }
    }

}
