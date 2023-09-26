public class Task4 {

    public static int[] findSum(int[] arr, int n) {
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    result[0] = arr[i];
                    result[1] = arr[j];
                    return result;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
        int n = 27;
        int[] result = findSum(arr, n);

        if (result[0] + result[1] == n) {
            System.out.println("Pair found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No such pair found.");
        }
    }

}
