/**
 * Created by vindhya on 5/5/16.
 */
public class Arrayreverse
{
    public static int[] reverse(int[] input)
    {
        int[] result=new int[input.length];

        int i=0,j=0;

        for(i=0,j=input.length-1;i<input.length;i++,j--)
            result[i]=input[j];
return result;
    }

    public static void main(String args[])
    {
        int[]r2=Arrayreverse.reverse(new int[]{1,2,3,4,5});

        int j=0;
        for(j=0;j<r2.length;j++)
            System.out.println("Reverse"+r2[j]);
    }
}
