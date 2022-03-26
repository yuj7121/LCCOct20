// The "J3" class.
import java.awt.*;
import java.io.*;

public class J3
{

    public static void main (String[] args)
    {
	try
	{
	    BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	    String str = in.readLine ();
	    String[] tokens = in.readLine ().split (" ");
	    int leng = tokens.length;
	    long output = 0;
	    long tall = Long.parseLong (tokens [0]);

	    for (int i = 0 ; i < leng ; i++)
	    {
		if (tall < Long.parseLong (tokens [i]))
		{
		    tall = Long.parseLong (tokens [i]);
		}
	    }
	    output = tall - Long.parseLong (tokens [0]);
	    System.out.print (output);
	}
	catch (IOException e)
	{
	}
    } // main method
} // J3 class
