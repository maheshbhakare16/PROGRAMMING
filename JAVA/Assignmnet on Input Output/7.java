/*Write a java program to accept one integer from user and check whether
given number is divisible by 7 or not (using divisibility condition)*/
import java.util.Scanner;
class Divisibility
{
 boolean checkDivisibilty(int num)
 {
 int temp;
 temp = num;

 temp = temp % 10;
 temp = temp * 2;
 num = num / 10;
 num = num - temp;

 if(num == 0 && num % 7 == 0)
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
 Divisibility ds = new Divisibility();;
 Scanner sc = new Scanner(System.in);

 System.out.print("Enter the Number To checked Divisibilty by 7 : ");
 int num = sc.nextInt();

 if(ds.checkDivisibilty(num))
 {
 System.out.println("Number is Divisible ");
 }
 else
 {
 System.out.println("Number is Not Divisible ");
 }

 }
}
