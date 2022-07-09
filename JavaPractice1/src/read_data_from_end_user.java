import java.util.Scanner;
public class read_data_from_end_user {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int num1, num2, sum;

        System.out.println("Enter First Number ");
        num1 = scan.nextInt();

        System.out.println("Enter Second Number ");
        num2 = scan.nextInt();

        sum = num1 + num2;

        System.out.println("The sum of Two numbers is: " + sum);
    }
}
