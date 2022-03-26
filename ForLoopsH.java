/*
 Name: Yujin Bae
 Teacher: Mr. Guglielmi
 Date: October 2nd, 2020
 Assgnment: ICS 3U -  For Loops Assignment
 This program will create a chart of exponents of 5, and the ending power will be chosen by the user.
 */

// The "ForLoopsH" class.
import java.awt.*;
import hsa.Console;

public class ForLoopsH
{
    static Console c;           // The output console

    //an integer that is the value of endig power that will be chosen by the user.
    int endPower;

    //this is the constructor
    public ForLoopsH ()
    {
	c = new Console ("Exponents of 5");
    }


    //this method will diplay the title.
    private void title ()
    {
	c.print (' ', 27);
	c.println ("Exponents of 5 Calculator");
	c.println ();

    }


    //this method will display an introduction about what the program does
    public void intro ()
    {
	c.println ("This progrqam will diplay a chart of 12 exponents of 5. ");
	c.println ("It is your choice to select the value for the ending power. ");
	c.println ();
    }


    //this method will take an integer from the user for endPower.
    public void askData ()
    {
	c.println ("Please enter a positive integer for the ending power.");
	endPower = c.readInt (); //reads the user input and put that value in the endPower.
	c.println ();
    }


    //this method will display the calculations and the results of the exponents of 5s.
    public void display ()
    {

	//the chart title and the column titles.
	c.print (' ', 23);
	c.println ("Calculation Chart for Powers of 5");
	c.println ();
	c.print (' ', 9);
	c.print ("Exponents", 20);
	c.print ("Calculation", 25);
	c.println ("Result");

	//the loop for displaying the calculations and the result
	for (int x = 12 ; x > 0 ; x--)
	{
	    int exponent = endPower - x + 1;        //the variable for the exponent
	    long result = 1;            //the varibale for the result of the calculation.

	    c.print (' ', 9);
	    c.print (exponent);
	    c.setCursor (24 - x, 30);
	    c.print ("5 ^ " + exponent);
	    c.setCursor (24 - x, 55);
	    //a loop wihch calculates the result, which is power of 5 for the current exponent.
	    for (int i = exponent ; i > 0 ; i--)
	    {
		result = result * 5;
	    }
	    c.println (result);
	}
    }


    //the main method of the program.
    public static void main (String[] args)
    {
	ForLoopsH d = new ForLoopsH ();
	d.title ();
	d.intro ();
	d.askData ();
	d.display ();
    } // main method
} // ForLoopsH class
