/**
 * Created by vindhya on 4/29/16.
 */
interface i1
{
    int i=10;
    void i11();
    void i22();
}
interface i2
{
    //int i=50;
    void i21();
    void i22();
}
interface i3 extends i1,i2
{
    void i31();
    void i32();
}

public class JavaInterface implements i1,i2{

    public void i11()
    {System.out.println("Interface i11");}
    public void i22()
    {System.out.println("Interface i12"+i);}

    public void i21()
    {System.out.println("Interface i11");}
    public static void main(String args[])
    {
        System.out.println("Interface Testing");
        JavaInterface j=new JavaInterface();
        j.i11();
        j.i22();
        j.i21();
    }
}
