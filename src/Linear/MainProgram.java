package Linear;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by vindhya on 5/17/16.
 */
public class MainProgram {

    public static void main(String args[])
    {
        LinkedList L=new LinkedList();

        L.add(100);
        L.add(200);
        L.add(300);
        L.add(400);
        L.add(500);
        /*for (Object v:L)
            System.out.println(v);
        System.out.println(L.get(4));
        L.addFirst("First");
        L.addLast("Last");*/
        Object[] AL=L.toArray();

        /*System.out.println("Array Start");
        for(int i=0;i<AL.length;i++)
            System.out.println(AL[i]);*/

        studentcollection stu=new studentcollection(1,"Vindhya",33);
        List<studentcollection> sl=new LinkedList<studentcollection>();
        sl.add(stu);
        L.add(4,sl);
        //System.out.println(L.get(4));


         for(Object v:L)
        {
            if(v instanceof List) {
                studentcollection st1 = (studentcollection) ((List) v).get(0);
                System.out.println( "Age " + st1.Age);
            }
        }
    }

}
