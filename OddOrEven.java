import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("Odd");
        } else if (number % 2 == 1){
            System.out.println("Even");
        }
        if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
        if (number == 0) {
            System.out.println("Zero");
        }
    }
}