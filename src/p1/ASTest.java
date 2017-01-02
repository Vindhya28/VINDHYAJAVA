package p1;
import java.lang.*;


public class ASTest
{
    public static void main(String args[])
    {
        Accessspecifiers p11= new Accessspecifiers();
        System.out.println("Public"+p11.pub );
        System.out.println("Protected"+p11.proc);
        System.out.println("Default"+p11.def);
        System.out.println("Static"+Accessspecifiers.stat);
    }

}
