import java.util.Scanner;
class small{
    public static void main(String args[])
    {
        int a,b;
        Scanner s=new Scanner (System.in);
        System.out.println("Enter two number");
        a=s.nextInt();
        b=s.nextInt();
        if(a>b)
        {
            System.out.println("a is gratest");
        }
        else
        {
            System.out.println(" b is gratest");
        }
}
}