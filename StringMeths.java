import java.util.Scanner;

public class StringMeths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("User input: [" + s + "] the length is: " +s.length());
        System.out.println("User input: ["+ s + "] String converted to uppercases: " + s.toUpperCase());
        System.out.println("User input: ["+ s + "] String converted to lowercases: " + s.toLowerCase());
        System.out.println("The first character of [" + s + "] is: " + s.charAt(0));
        System.out.println("The last character of [" + s + "] is: " + s.charAt(s.length()-1));
        System.out.println("The second character to the fifth character of [" + s + "] is: " + s.substring(1, 5));
    }
}