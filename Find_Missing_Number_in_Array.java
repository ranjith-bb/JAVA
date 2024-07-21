import java.util.Scanner;
public class FindMissingNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array (from 1 to " + (n + 1) + "): ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int missingNumber = findMissingNumber(array, n + 1);
        System.out.println("The missing number is: " + missingNumber);
        scanner.close();
    }
    public static int findMissingNumber(int[] array, int totalNumbers) {
        int expectedSum = totalNumbers * (totalNumbers + 1) / 2;
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
