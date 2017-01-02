/**
 * Created by vindhya on 4/26/16.
 */
package p2;
import p1.Accessspecifiers;

public class ASTest2 extends Accessspecifiers

{

    public void accessprotected()
    {

        System.out.println(proc);
        System.out.println();
    }

    public static void main(String args[])
    {
        Accessspecifiers p11= new Accessspecifiers();
        System.out.println("Public"+p11.pub);
        System.out.println("Static");
        ASTest2 t2=new ASTest2();
        t2.accessprotected();

    }
}
