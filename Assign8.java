import java.util.Scanner;

public class Assign8 {
	int length,breadth,area;
	int side;
	Scanner sc= new Scanner(System.in);
	void Reactangle()
	{

		System.out.println("Enter length and breadth of reactangle :");
		length=sc.nextInt();
		breadth=sc.nextInt();	
	}
	 void Square()
	{
		 System.out.println("Enter side of Square :");
			side=sc.nextInt();
	}
	void area(){
		this.Reactangle();
		area=length*breadth;
		System.out.println("Area of Reactangle is: "+area);
		
		this.Square();
		area=4*side;
		System.out.println("Area of Square: "+area);
		
	}
	public static void main(String[] args) {
		Assign8 a = new Assign8();
		a.area();
		
		
		
	}

}
