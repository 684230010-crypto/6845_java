public class CountEven {
    public static void main(String[] args) {
        int[] x = { 7, 9, -1, 4, 12, 9, 3, 2, -7, 2, 1, 9, -15, 24, 11, 13 };
        int even = 0;

        System.out.print("Even numbers found in array: ");
        for (int num : x) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                even++;
            }
        }

        System.out.println("Total number of even numbers = " + even);
    }
}