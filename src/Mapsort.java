import java.util.*;

/**
 * Created by vindhya on 11/14/16.
 */
public class Mapsort
{

    public static void main(String args[])
    {
        HashMap<Integer,String> h=new HashMap<>();
        h.put(90,"Vindhya");
        h.put(10,"Camel");
        h.put(20,"train");
        h.put(100,"Drum");

        Set result=sortMap(h).entrySet();

        Iterator itr=result.iterator();

        while (itr.hasNext())
        {
            Map.Entry ent=(Map.Entry)itr.next();

            System.out.println(ent.getKey()+" "+ent.getValue());

        }


    }

    public static Map sortMap(Map map1)
    {
        List<Map.Entry> lmap=new LinkedList<>(map1.entrySet());

        Collections.sort(lmap, new Comparator<Map.Entry>() {
            @Override
            public int compare(Map.Entry o1, Map.Entry o2) {

                int i=(Integer)o1.getKey();
                int j=(Integer)o2.getKey();
                if(i>j) return 1;
                else if(i<j) return -1;
                else return 0;


            }
        });

        Map result=new LinkedHashMap<>();
        for(Map.Entry entry:lmap)
        {
            result.put(entry.getKey(),entry.getValue());
        }

        return result;
    }


}
