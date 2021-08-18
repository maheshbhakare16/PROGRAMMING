/*Write a java program to find out factorial of given number. (Using Scanner
class).*/
import java.util.Scanner;
class Demo
{
    int factorialOfNumber(int num)
    {
        int fact = 1;

        if(num > 0)
        {
            for(int i = 1;i <= num;i++)
            {
                fact = fact * i;
            }
        }

        return fact;
    }

    public static void main(String args[])
    {
        Demo d = new Demo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number whose Factorial to be Printed : ");
        int num = sc.nextInt();

        int fact = d.factorialOfNumber(num);

        System.out.printf("Factorial of %d is %d . " ,num,fact);
    }
}
