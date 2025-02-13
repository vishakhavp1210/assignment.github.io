import java.util.Scanner ;
class swap_{
     public static void main( String args[])
     {
        int a,b;
        Scanner s=new Scanner ( System.in); 
        System.out.println("Enter two number");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("before swap");
        System.out.println(a+"\t"+b);
         a=a+b;
         b=a-b;
         a=a-b;
        System.out.println("after swap");
        System.out.println(a+"\t"+b);
     }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               