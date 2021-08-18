
class SwapNumber
{
 void swapNumbers(String args[])
 {
 System.out.println("Original numbers are: "+args[0]+" , "+args[1]);

 int first = Integer.parseInt(args[0]);
 int second = Integer.parseInt(args[1]);

 int temp = first;
 first = second;
 second = temp ;
 
 System.out.printf("Swap Numbers Are : %d , %d ",first,second);
 }

 public static void main(String args[])
 {
 SwapNumber sn = new SwapNumber();

 sn.swapNumbers(args);
 }
}
