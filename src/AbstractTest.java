/**
 * Created by vindhya on 4/29/16.
 */
public class AbstractTest {
    public static void main(String args[])
    {
        ab1 a =new ab1() {
            @Override
            void dispab1() {

            }
        };
                a.disp();
        a.dispab1();
    }
}

abstract class ab1
{
    int a;
    void disp()
    {System.out.println("Abstract Class 2");}
    abstract void dispab1();
}

class ab2 extends ab1
{
    void dispab1()
    {
        System.out.println("Helena in ab2");
    }
}

