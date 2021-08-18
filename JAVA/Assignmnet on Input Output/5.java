
import java.util.Scanner;
class Armstrong
{
 boolean findArmstrongNumber(int num)
 {
 int temp,digit,temp1,temp2;
 int sum = 0,count = 0,rem = 0;

 temp1 = temp2 = num;

 while(temp1 != 0)
 {
 rem = temp1 % 10;
 count++;
 temp1 = temp1 / 10;
 }

 digit = count;
 rem = 0;

 for( ;temp2 != 0;temp2 /= 10)
 {
 rem = temp2 % 10;
 temp = 1;

 count = digit;
 
 for( ;count != 0;count--)
 {
 temp = temp * rem;
 }

 sum = sum + temp;
 }

 if(num == sum)
 {
 return true;
 }
 else
 {
 return false;
 }
 }

 public static void main(String args[])
 {
 Armstrong a = new Armstrong();;
 Scanner sc = new Scanner(System.in);

 System.out.print("Enter the Number to checked whether Armstrong number or not : ");
 int num = sc.nextInt();

 if(a.findArmstrongNumber(num))
 {
 System.out.printf("%d is a Armstrong Number.",num);
 }
 else
 {
 System.out.println("Not Armstrong Number");
 }
 }
}
