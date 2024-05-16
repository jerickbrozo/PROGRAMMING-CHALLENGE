import java.util.Scanner;
import java.lang.StringBuilder;

public class StrBuild{

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder str = new StringBuilder(s);

            if (str.length() < 10) {
                System.out.println("Please enter 10 characters");
                System.out.print("Enter a string: ");
                return;
            }
            if (str.length() > 10) {
                System.out.println("Please enter less than 10 characters");
                System.out.print("Enter a string: ");
                return;
            }

        System.out.println("Length: " + str.length());
        System.out.println("First char: " + str.charAt(0));
        System.out.println("Last char: " + str.charAt(str.length()-1));
        System.out.println("First occurrence if a: "+ str.indexOf("a"));
        System.out.println("Show the index of 3 to 6: " + str.substring(3,6));
        System.out.println("Add 123 to end of the String: " + str.append("123"));
        System.out.println("Insert \"xyz\" to index 4: " + str.insert(4, "xyz"));
        System.out.println("Delete the index 2 to 4: " + str.delete(2,4));
        System.out.println("Delete the char index 8: " + str.deleteCharAt(8));
        System.out.println("Reverse the input String: " + str.reverse());

    }
}

