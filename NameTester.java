//erica martinez
//cs111b1

class NameTester
{
	public static void main (String[] args)
	{
		FullName name1 = new FullName();

		name1.setFirst("Miley");
		name1.setMiddle("Ray");
		name1.setLast("Cyrus");

		System.out.println(name1.toString());
		System.out.println(name1.monogram());
	}	


}