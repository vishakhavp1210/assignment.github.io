import java.util.Scanner;
class swap{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the two number");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("Before swap");
        System.out.println(a+"\t"+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After awap");
        System.out.println (a+"\t"+b);
    }

}