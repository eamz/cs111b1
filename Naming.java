import java.util.*;

class Naming
{
	FullName f = new FullName();

	f.setFirst("Hellen");
	f.setLast("Keller");
	f.setMiddle('A');

	System.out.println(f.toString());
	System.out.println(f.monogram());
}