
class ExplainStatic
{
 static int a;
 static float b = Fun();

 static void Gun()
 {
 System.out.println("Static Gun Method");
 }

 static class Inner
 {
 static String str = "AVCOE";

 static void Run()
 {
 System.out.println("Inside static run of Inner Class");
 }
 }

 public static void main(String args[])
 {
 ExplainStatic.Inner.Run();
 System.out.println("Value of Static Variable a is : " +ExplainStatic.a);
 System.out.println("Static Main Method");
 ExplainStatic.Gun();
 System.out.println("Value of Static Variable b is : " +ExplainStatic.b);
 System.out.println("Value of Static Variable str In Static inner Class is : "+ExplainStatic.Inner.str);
 }

 static float Fun()
 {
 System.out.println("Static Fun Method");
 return 20;
 }

 static
 {
 System.out.println("Static Block");
 a = 10;
 }
}
