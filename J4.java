// The "J4" class.
import java.awt.*;
import java.io.*;

public class J4
{

    public static void main (String[] args)
    {

	try
	{
	    BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	    String strN = in.readLine ();
	    int n = Integer.parseInt (strN);
	    String strM = in.readLine ();
	    //int[] m = new int [strM.length ()];

	    String[][] m = new String [strM.length ()] [5];
	    for (int i = 0 ; i < strM.length () ; i++)
	    {
	    }
	    String strK = in.readLine ();
	    int k = Integer.parseInt (strK);

	    System.out.println ();
	}
	catch (IOException e)
	{
	}
    } // main method
} // J4 class
