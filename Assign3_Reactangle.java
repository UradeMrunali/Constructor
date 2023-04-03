import java.util.Scanner;

public class Assign3_Reactangle {
   int area;
   int length;
   int breadth;
  
	Assign3_Reactangle()
	{
	length=0;
	breadth=0;
	}
	
	Assign3_Reactangle(int l,int b)
	{
		System.out.println("The length and Breadth");
		length=l;
		breadth=b;
		this.result();
	}
	Assign3_Reactangle(int a)
	{
		System.out.println("The area of Reactangle is: ");
		
			area=a;
			
			
	}
	
	void result()
	{
		System.out.println(length+" "+breadth);
		area=length*breadth;
		System.out.println(area);
	}
	
	

	public static void main(String[] args) {
		  
		  Assign3_Reactangle r = new Assign3_Reactangle(4,4);
		//Assign3_Reactangle r1 = new Assign3_Reactangle(16);
		  
		//  r.result();
		 
		
		  
	}
}
