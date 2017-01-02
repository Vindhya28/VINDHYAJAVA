package p1;
import java.lang.*;

public class Accessspecifiersp1 extends Accessspecifiers
{

    public void test()
    {
        System.out.println("Public23123"+pub );
        System.out.println("Protected"+proc);
        System.out.println("Default"+def);
        System.out.println("Static"+stat);
    }

    public static void main(String args[])
    {
        Accessspecifiersp1 p11= new Accessspecifiersp1();
        p11.test();

    }

}


