import java.util.Scanner;

public class numLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOne;
        int numTwo;
        int numThree;
        System.out.print("Please enter number 1: ");
        numOne = scan.nextInt();
        System.out.print("Please enter number 2: ");
        numTwo = scan.nextInt();
        System.out.print("Please enter number 3: ");
        numThree = scan.nextInt();

        //if(numOne == numTwo && numOne == numThree){
         //   System.out.println("Number:"+ "[" + numOne + "]" + " Number:" + "[" + numTwo + "]" + " Number:" + "[" + numThree + "]");
          //  System.out.println("All number are equal");
        //}
        if(numOne > numTwo && numOne > numThree)
            System.out.println(numOne + " is the largest number.");

        else if (numTwo > numOne && numTwo > numThree)
            System.out.println(numTwo + " is the largest number.");
        
        else if (numThree > numOne && numThree > numTwo)
            System.out.println(numThree + " is the largest number.");
        else
            System.out.println("All number is equals.");
    }
}
