import java.util.Scanner;
public class countWords
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.nextLine();
        int count=Length(a);
        System.out.println("Number of words is :"+count);
    }
    static int Length(String s)
    {
        int c=0;
        for (int i = 0;i<=(s.length()-1);i++)
        {
            if(  ( (i>0)&& (s.charAt(i)!=' ') &&(s.charAt(i-1)==' ')) || ((s.charAt(i)!=' ')&&(i==0)) )
                c++;
        }
        return c;
    }
}