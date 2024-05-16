import java.util.Scanner;

public class ArraysSumAndAve {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of arrays: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter number to store in array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            System.out.println("You entered: " + arr[i]);
            System.out.print("Enter more: ");

        }

        int sum = 0;
        for (int number : arr) {
            sum += number;

        }

        double average = (double) sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }
}

