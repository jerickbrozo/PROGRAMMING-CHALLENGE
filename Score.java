import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of grades: ");
        int scores = input.nextInt();
        char grades;

        if (scores >= 90) {
            grades = 'A';
        } else if (scores >= 80 && scores < 90) {
            grades = 'B';
        } else if (scores >= 70 && scores < 80) {
            grades = 'C';
        } else if (scores >= 60 && scores < 70) {
            grades = 'D';
        } else {
            grades = 'F';
        }
        switch (grades) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("You Passed!!");
                break;
            case 'F':
                System.out.println("You Failed!!");
                break;
            default:
                System.out.println("Invalid grade");

        }

        System.out.println("Your grade is " + grades);
    }
}
