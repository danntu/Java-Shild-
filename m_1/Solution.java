package m_1;

import java.io.*;
import java.util.*;
public class Solution {
    public void read () {
        File output = new File ("output.txt");
        File input = new File("E://Java//kr//src", "input.txt");
        List<String> strings = new ArrayList<String>();


        try
        {   String tmp;
            int qual=0;
            Scanner sc = new Scanner(input).useDelimiter("[\\S\\p{Punct}]+");
            while (sc.hasNextLine())
            {
                tmp=sc.nextLine();
                strings.add(tmp);
                qual=strings.size();
            }
            for (int i = 0 ; i < qual; i++)
            {
                System.out.println(strings);
            }

        }

        catch (FileNotFoundException e)
        {
            System.out.println("File not file");
        }
        catch (IOException ex)
        {
            ex.getMessage();
        }
        finally {

        }
    }
}
