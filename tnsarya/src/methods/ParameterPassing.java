package methods;

public class ParameterPassing {
	public static void main(String[] args) 
	{
		sayHello("Akhilesh");
		sayHello("TNS");
		add(4570,24);
		
		multiply(3,8);
	}
    public static void sayHello(String name)
    {
    	System.out.println("Hello "+ name);
    }
    public static void add(int a,int b)
    {
    	 System.out.println(a+b);
    }
    public static void multiply(int a,int b)
    {
    	System.out.println(a*b);
    	//return(a*b);
    }

}
