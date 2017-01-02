package Trigram;

/**
 * Created by vindhya on 11/16/16.
 */
public class Node {

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int value;
    public Node Next;

    public Node(int a,Node next)
    {
        this.value=a;
        this.Next=next;
    }

    public void setLink(Node n)
    {
        this.Next=n;
    }

    public Node getLink()
    {
        return this.Next;
    }

    public Node getNext()
    {
        return this.Next;
    }


    public String toString()
    {
        return String.valueOf(value);
    }
}
