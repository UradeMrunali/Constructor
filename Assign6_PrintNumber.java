
public class Assign6_PrintNumber {
	
	 String name;
     int a;
     float b;
     double c;
     
	Assign6_PrintNumber(String name,int a,float b,double c)
	{
		this.name=name;
		this.a=a;
		this.b=b;
		this.c=c;
		this.printn(name);
		this.printn(a);
		this.printn(b);
		this.printn(c);
	}

 String printn(String name)
 {
	 System.out.println("This is String Type: "+name);
	 return name;
 }
 
 int printn(int a)
 {
	 System.out.println("This is Integer Type: "+a);
	 return a;
 }
  
 float printn(float b)
 {
	 System.out.println("This is Float Type: "+b);
	 return b;
 }
 
 double printn(double c)
 {
	 System.out.println("This is Double Type: "+c);
	 return c;
	 
 }
 
  public static void main(String[] args) {
	Assign6_PrintNumber n=new Assign6_PrintNumber("Mrunali",45,5,00.2578);
	
}
}
