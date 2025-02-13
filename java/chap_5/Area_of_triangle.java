import java.util.*;
class Area_of_triangle{
    public static void main (String args[])
    {
        int b,h;
        double ans;
        Scanner s=new Scanner(System.in);
        System.out.println("enter two vlaue");
        b=s.nextInt();
        h=s.nextInt();
        ans=(b*h)/2;
        System.out.println("Area="+ans);
    }

}
