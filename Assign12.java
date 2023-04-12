
class  IntegerI{
 int i;
 void printNum(){
	 System.out.println(i);
 }
}
class subClassJ extends IntegerI{
	int j;
	void printNum(){
		
	super.printNum();
	System.out.println(j);
}
}
public class Assign12 {
  public static void main(String[] args) {	
	 subClassJ s=new subClassJ();
	  s.i=4;
	  s.j=1;
	  s.printNum();
	}
	}
