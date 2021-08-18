
import java.util.Scanner;
class CharacterCount
{
 int giveCharacterCount(String str,char ch)
 {
 int count = 0;

 for(int i = 0 ; i < str.length() ; i++)
 {
 if(ch == str.charAt(i))
 {
 count++;
 } 
 }

 return count;
 }

 public static void main(String args[])
 {
 CharacterCount c = new CharacterCount();
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the String : ");
 String str = sc.next();

 System.out.print("Enter character to check in given String : ");
 char ch = sc.next().charAt(0);

 int count = c.giveCharacterCount(str,ch);

 System.out.printf("There are %d counts of %c character.",count,ch);
 }
}
