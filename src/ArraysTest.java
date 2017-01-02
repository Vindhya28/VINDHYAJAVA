import java.io.IOException;
import java.net.SocketException;
import java.util.Stack;

/**
 * Created by vindhya on 5/5/16.
 */
public class ArraysTest extends Arrayreverse
{
    public static void main(String args[])
    {
        /*Arrayreverse a = new Arrayreverse();
        int[] result1 = a.reverse(new int[]{1, 2, 3, 4, 5,});
        int j;

        int[] k=new int[]{1,2,3,4};

        for (j = 0; j < result1.length; j++)
            System.out.println(result1[j]);

        int[] d = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //d=new int[10];

        int i = 0;
        //Display items in an array

        for (i = 0; i < 10; i++)
            System.out.println("d[" + i + "]:" + d[i]);

         //finding the largest no
        int max = d[0];

        for (i = 0; i < 10; i++) {
            if (d[i] > max) max = d[i];
        }
        System.out.println("Maximum no:" + d.length);*/



        Stack s= new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.search(10));
        s.push(40);
        System.out.println(s.search(40));


    }
}
