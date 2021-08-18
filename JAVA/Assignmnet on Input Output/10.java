
class ExplainFinal
{
 final int a = 10;
 final static float b;
 final char ch;
 final int c = Gun();
 
 final void Fun()
 {
 System.out.println("Final Fun() Method of Another Class");
 }
 
 static
 {
 b = 10;
 }

 {
 ch = 'A';
 }

 int Gun()
 {
 System.out.println("Non Static Gun Method");
 return 10;
 }
 
 void Run()
 {
 System.out.println("Non Static Run Method ");
 System.out.println("Value of Final variable a : "+ a);
 }
 
 public static void main(String args[])
 {
 ExplainFinal ef = new ExplainFinal();
 ef.Fun();
 ef.Run();
 }
}
