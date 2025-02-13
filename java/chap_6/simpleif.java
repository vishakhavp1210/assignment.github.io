import java.util.Scanner;
class check { 
  public static void main(String args[])
   {
     int n;
     Scanner s=new Scanner( System.in); 
     System.out.println("Enter the number");
     n=s.nextInt();
     if(n>0)
     {
        System.out.println("the laue is +ve");
     }
     if(n<0)
     {
        System.out.println("the value is -ve");
     }
   }
}
