package Trigram;

import java.security.PublicKey;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by vindhya on 11/16/16.
 */
public class MyStack {

    private Node Head;
    private Node end;

    public void insertatStart(int a)
    {
        Node newnode=new Node(a,null);
        if(Head==null)
        {
            Head=newnode;
            end=newnode;
        }
        else
        {
            newnode.setLink(Head);
            Head=newnode;
        }
    }

    public void insertatPosition(int a,int pos)
    {
        Node newnode=new Node(a,null);
        Node t=Head;
        for(int i=0;i<pos;i++)
        {
            if(i==pos-1)
            {
                newnode.setLink(t.getNext());
                t.Next=newnode;
            }
            t=t.getNext();
        }

    }

    public void display()
    {
        Node n= Head;
        while(n.getNext()!=null)
        {
            System.out.println(n.getValue());
            n=n.getNext();
        }

        System.out.println(end.getValue());
    }


}
