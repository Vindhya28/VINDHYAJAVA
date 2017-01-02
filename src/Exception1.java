import com.sun.tools.classfile.Exceptions_attribute;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;

/**
 * Created by vindhya on 11/15/16.
 */
public class Exception1
{

    public void m1() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("In M1 IO Exception");
    }
    public void m2() throws IOException
    {
        System.out.println("In M2 SocketException");
    }
}
