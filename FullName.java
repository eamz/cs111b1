//erica martinez
//cs111b1 spring 2015
import java.util.*;

class FullName
{
	String first;
	String last;
	char middle;
	
	public void setFirst(String name)
	{
		first = name;
	}

	public void setLast(String name)
	{

		last = name;
	}

	public void setMiddle(String name)
	{
		middle = name.charAt(0);
	}

	public String toString()
	{
		String fullName = "Full Name: " + first + " " + middle + " " + last;

		return fullName;
	}

	public String monogram()
	{
		String mono = "Monogram: " + first.charAt(0) + "." + middle + "." + last.charAt(0) + ".";

		return mono;
	}
}
