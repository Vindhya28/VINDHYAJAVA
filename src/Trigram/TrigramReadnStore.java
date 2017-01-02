package Trigram;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vindhya on 5/18/16.
 */
public class TrigramReadnStore  {

    public static void main(String args[]) throws IOException
    {

        for (String line: Files.readAllLines(Paths.get("/Users/vindhya/Documents/TrigramText.txt")))
       {
           System.out.println(line+" "+ " in main ");
           Actualimpl actual=new Actualimpl(line);


       }


    }

}
