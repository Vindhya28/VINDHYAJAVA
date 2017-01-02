package Trigram;

import java.util.*;

/**
 * Created by vindhya on 5/18/16.
 */
public class Actualimpl
{
    String Story;
    int edit;

    //Splitting Text
    public Actualimpl(String line)
    {
        //logic to derive the trigrams from a given text
        String spiltspecial=line.replaceAll("[.,',',';','/']","");//Removing Special Characters
        String[] spilttext=spiltspecial.split("\\s+");//Splitting the text and finding words within spaces
        int i=0,j=0,k=0,index;
        ArrayList<String> tri=new ArrayList<String>();
        ArrayList<String> keyw=new ArrayList<String>(new LinkedHashSet<String>());
        String triadd,keyadd,comp1,comp2;
        j=i+1;k=i+2;
        String key1;
        Random keyr=new Random();
        for(i=0;i<spilttext.length;i++)
        {

            j=i+1;k=i+2;
            triadd=spilttext[i]+" "+spilttext[j]+" "+spilttext[k];
            tri.add(triadd);//adding 3 words at a time to the array list(FINDING TRIGRAMS)
            keyadd=spilttext[i]+" "+spilttext[j];
            if (!keyw.contains(keyadd))
            {
                keyw.add(keyadd);
            }
            //LIST of only the keys
            if(i==spilttext.length-3){ break;}
        }
        int ind=keyr.nextInt(keyw.size());
        key1=keyw.get(ind);

        System.out.println("Random Key to Start the Story : "+key1);
           Story=key1;
          String returnkey="";
          returnkey=Storywithkeys(key1,tri);

        while (returnkey!=null )
            returnkey=Storywithkeys(returnkey,tri);


        System.out.println("Story: "+ Story);
    }

    public String Storywithkeys(String key1, ArrayList<String> tri)
    {
       int index=0;
        Iterator e=tri.iterator();
        String s = "",key2="",key11="";
        String[] trisplit={};
        ArrayList<String> kval=new ArrayList<String>();
        Random R=new Random();
       while (e.hasNext())
       {
           Object o=e.next();
           s=o.toString();
           trisplit=s.split("\\s+");
           key2=trisplit[0]+" "+trisplit[1];
           //System.out.println("Key1:"+key1+"key2:"+key2);
           if (key1.contentEquals(key2))
           {
               kval.add(trisplit[2]);
               System.out.println("Kval" +kval);
               key11=trisplit[1];
           }
       }
        key1=key11;

        if(!kval.isEmpty())
        {
            index=R.nextInt(kval.size());
        //System.out.println("Random 3rd value" + index);
        String ran=kval.get(index);
        Story=Story+" "+ran;
        key1=key1+" "+ran;
        System.out.println("RANDOM KEYVAL"+ran);
            return key1;
        //Storywithkeys(key1,tri);
          // System.out.println("Storysdkfjskdlfjskld"+Story);

        }
        else return null;

    }



}
