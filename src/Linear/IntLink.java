package Linear;

/**
 * Created by vindhya on 5/17/16.
 */
public class IntLink {

    public int num;
    public IntLink next;

    public IntLink(int num,IntLink next)
    {
        this.num=num;
        this.next=next;
    }

    public String toString()
    {
        return num + " ";}
}
