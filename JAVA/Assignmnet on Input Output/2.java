
import java.util.Scanner;
class Prime
{
 int findPrimeNo(int num)
 {
 int count = 0;

 for(int i = 1;i <= num;i++)
 {
 if(num % i == 0)
 {
 count ++;
 }
 }

 if(count == 2)
 {
 return 1;
 }
 else
 {
 return 0;
 }
 }

    public static void main(String args[])
    {
        Prime p = new Prime();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number to be Checked Prime or Not : ");
        int num = sc.nextInt();
        
        if(p.findPrimeNo(num) != 0)
        {
            System.out.printf("%d is a Prime No." ,num);
        }
        else
        {
            System.out.println("not a prime number....");
        }
    }
}
