
 class Assign10 {
 void getDegree(){
	System.out.println("I got a degree"); 
 }
 }
 
 class Undergraduate extends Assign10{
	 void getDegree(){
		 super.getDegree();
		 System.out.println("I am an Undergraduate");
	 }
 }
 class Postgraduate extends Assign10{
	 void getDegree(){
		 super.getDegree();
		 System.out.println("I am an Postgraduate");
		 
	 }
 }

          class Assign10_Degree{
		 public static void main(String[] args) {
			 Undergraduate u= new Undergraduate();
			 Postgraduate p= new Postgraduate();
			 
			 u.getDegree();
			 p.getDegree();
		 }
	 }
 
 
 
 
 

