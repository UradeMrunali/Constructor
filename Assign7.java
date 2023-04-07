
public class Assign7 {
 void data(int n,char c)
 {
	 System.out.println("integer is: "+n);
	 System.out.println("char is: "+c);
 }
 
 void data(char c, int n)
 {
	System.out.println("char is: "+c);
	System.out.println("integer is: "+n);
 }
 public static void main(String[] args) {
	Assign7 a = new Assign7();
	a.data(54,'b');
	a.data('v', 66);
}
}
