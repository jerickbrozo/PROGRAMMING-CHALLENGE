import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num2 = input.nextInt();
        int total = num2 + num;
        System.out.println("The sum of " + num + " and " + num2 + " is " +total );
    }
}