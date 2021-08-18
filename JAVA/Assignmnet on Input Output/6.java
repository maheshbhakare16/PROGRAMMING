class Alphabets
{
 void printAlphabets()
 {
 System.out.print("UpperCase Alphabets : ");
 for(int i = 65 ; i <= 90 ; i++)
 {
 System.out.printf(" %c, ",i);
 }
 System.out.print("\nLowerCase Alphabets : ");
 for(int i = 97 ; i <= 122 ; i++)
 {
 System.out.printf(" %c,  ",i);
 }
 }

 public static void main(String args[])
 {
 Alphabets a = new Alphabets();

 a.printAlphabets();
 }
}
