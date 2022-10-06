import java.util.Scanner;
public class ForLoop
{
    public static void main(String[] args)
    {
        //create a Scanner object
        Scanner sc = new Scanner(System.in);
        //prompt the user to enter the number of terms
        System.out.print("Enter the number of terms using for loop: ");
        int n = sc.nextInt();
        //print the series
        System.out.print("The series is: ");
        for (int i = 1; i <= n; i++)
        {
            System.out.print(10*i + " ");
        }
    }
}
