/**
 * Created by vindhya on 4/29/16.
 */
class abc
{
    final void disp()
    {System.out.println("Final Class cannot be extended");}
}
public class FinalClass extends abc {


    public static void main(String args[])
    {System.out.println("Try thi");
        abc a1=new abc();
        a1.disp();
    }
}
