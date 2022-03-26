// The "J2" class.
import java.awt.*;
import java.io.*;

public class J2
{
    public static void main (String[] args)
    {
	try
	{
	    BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	    String[] input = in.readLine ().split (" ");
	    int length = input.length;
	    boolean low = true;
	    String[] output = new String [length];

	    for (int i = 0 ; i < length ; i++)
	    {
		output [i] = "";
		for (int c = 0 ; c < input [i].length () ; c++)
		{
		    if (Character.isLetter (input [i].charAt (c)))
		    {
			if (low == true)
			{
			    output [i] = output [i] + (input [i].substring (c, c + 1)).toLowerCase ();
			    low = false;
			}
			else
			{
			    output [i] = output [i] + (input [i].substring (c, c + 1)).toUpperCase ();
			    low = true;
			}
		    }
		    else
		    {
			output [i] = output [i] + input [i].substring (c, c + 1);
		    }
		}
		System.out.print (output [i]);
		if (i != length - 1)
		{
		    System.out.print (" ");
		}
	    } //for end
	} //try block end
	catch (IOException e)
	{
	}
    } // main method
} // J2 class
