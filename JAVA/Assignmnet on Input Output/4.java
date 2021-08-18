/*Write a java program to accept one string from user and print all characters
from string. (Using BufferedReader class). charAt(i)*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class PrintCharacters
{
 void print() throws IOException
 {
 System.out.println("Enter any String : ");
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 String str = br.readLine();

 for(int i = 0; i < str.length();i++)
 {
 char ch = str.charAt(i);
 System.out.printf("Character at position %d is %c \n",i,ch);
 }
 }

 public static void main(String args[]) throws IOException
 {
 PrintCharacters p = new PrintCharacters();

 
p.print();

 }
}
