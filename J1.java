// The "J1" class.
import java.awt.*;
import java.io.*;

public class J1
{

    public static void main (String[] args)
    {
	try
	{
	    BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	    String tokens = in.readLine ();
	    int k = Integer.parseInt (tokens);
	    int n = 1;
	    for (int i = k ; i > 0 ; i--)
	    {
		n *= 3;
	    }
	    System.out.println (n);
	}
	catch (IOException e)
	{
	} // Place your program here.  'c' is the output console
    } // main method
} // LCC class
