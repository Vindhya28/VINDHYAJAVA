import java.util.Comparator;

/**
 * Created by vindhya on 5/9/16.
 */
public class Agecomparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        student s1=(student)o1;
        student s2=(student)o2;
        if(s1.age==s2.age){return 0;}
        else if (s1.age>s2.age)
            return -1;
        else return 1;

    }
}
