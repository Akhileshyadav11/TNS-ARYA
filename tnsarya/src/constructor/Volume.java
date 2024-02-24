package constructor;

import lession15.Cube;

public class Volume 
{
	public static void main(String[] args) 
	{
       Cube cube1=new Cube();
       System.out.println(cube1.getcubevolume());
       
       Cube cube2=new Cube(2,50,40);
       System.out.println(cube2.getcubevolume());
       
       Cube cube3=new Cube(200,50,40);
       System.out.println(cube3.getcubevolume());
	}

}

