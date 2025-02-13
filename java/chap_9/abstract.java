abstract class addition{
int a,b;
abstract void calculate();
void getdata()
{
    a=10;
    b=12;
}
}
class sub extends addition{
    int c;
    void calculate()
    {
        c=a+b;
        System.out.println("c="+c);
    }
}
class add {
 public static void main(String args[])
 {
    sub s=new sub();
    s.getdata();
    s.calculate();
 }
}