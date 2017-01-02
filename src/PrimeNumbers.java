/**
 * Created by vindhya on 5/5/16.
 */
public class PrimeNumbers {
    public static void main(String args[])
    {
        int i,j,count=0;

        for (i=1;i<=100;i++)
        {

            for(j=i;j>=1;j--)
            {
                if (i%j==0)
                    count=count+1;
            }

            if(count==2)
            {System.out.print(i); }
            count=0;

            }
        }

    }

