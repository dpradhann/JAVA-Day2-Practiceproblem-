import java.util.Scanner;

public class Reverse_the_integer_Num
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();
        int reverse = 0, remainder;

        while (number > 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("The reverse of the given Number is: " + reverse);
    }
}