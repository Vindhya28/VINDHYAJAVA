import Trigram.MyStack;

/**
 * Created by ${USER} on ${DATE}.
 */
public class FibonacciSeries {

    public static void main(String args[]) {
       /* int i=0;

        for (i=1;i<=10;i++)
        {
            System.out.println(fib(i));
        }

    public static int fib(int n)
    {
        if (n==1||n==2)
            return 1;
        return fib(n-1)+fib(n-2);
    }*/

        MyStack ms= new MyStack();
        ms.insertatStart(10);
        ms.insertatStart(20);
        ms.insertatStart(30);

        ms.display();



    }
}
