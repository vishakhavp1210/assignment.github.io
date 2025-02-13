import java.util.Scanner;
class ifelse{
  public static void main(String args[])
  {
    int a,b;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the value");
    a=s.nextInt();
    b=s.nextInt();
    if(a<b)
    {
        System.out.println("b is small");
    }
    else{
     System.out.println("ais grater");
    }
  }

}  