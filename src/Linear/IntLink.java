package Linear;

/**
 * Created by vindhya on 5/17/16.
 */
//Testing Changes
public class IntLink {

    public int num;
    public IntLink next;
    public IntLink xyz;
    public String TestChanges="Tested Successfully";
    public String TestChanges1="Tested1 Successfully1";


    public IntLink(int num,IntLink next)
    {
        this.num=num;
        this.next=next;
    }

    public String toString()
    {
        return num + " ";}
}
