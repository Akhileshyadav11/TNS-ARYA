package array_string;

public class Strings {

	public static void main(String[] args) 
	{
		String mystring="Hello Bhai";
		System.out.println(mystring);
		
		int mystringlength=	mystring.length();
		System.out.println(mystringlength);
		
		String mystringincase=mystring.toLowerCase();
		String mystringincase1=mystring.toUpperCase();
		
		System.out.println(mystringincase);
		System.out.println(mystringincase1);
		
		System.out.println(mystring.replace('H', 'M'));
		System.out.println(mystring.indexOf('B'));


	}

}
