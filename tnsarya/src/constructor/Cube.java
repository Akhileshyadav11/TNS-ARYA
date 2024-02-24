package constructor;

public class Cube 
{

    int length;
	int breath;
	int height;
	
	public int getcubevolume()
	{
        return(length*breath*height);
	}
	
	 Cube()
	 {
        length=10;
        breath=20;
        height=30;
	 }
	 Cube(int l,int b,int h)
	 {
		 length=l;
         breath=b;
         height=h;
	 }
	 

}
