import java.util.Scanner;
class base
{
  int i;
}
class drived extends base
{
    int i;
    drived( int a, int b)
    {
        super.i=a;
        i=b;
    }
    void display()
    {
        System.out.println(" i="+super.i);
        System.out.println("i="+i);
    }
}
class supermembereg{
    public static void main(String args[]){
        drived d=new drived(10,20);
        d.display();
    }

}