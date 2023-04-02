import java.util.Scanner;

public class Assign1_Student {
	
    String name1,name2,name3; 
	Assign1_Student()
	{
		 name1="unknown";
		 name2="unknown";
		 name3="unknown";
	}
	
    Assign1_Student(String n1,String n2,String n3)
	{
		System.out.println("Students name is");
		name1=n1;
		name2=n2;
		name3=n3;
	}
			
	void result()
	{
		System.out.println(name1+" "+name2+" "+name3);
	}
	
	
	public static void main(String[] args) {    
	 Assign1_Student s= new Assign1_Student("Mrunali","Kajal","Rahul");
	 s.result();	
	
	}
//	public static void main(String[] args) { 
//		String name1,name2,name3; 
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter students name");
//		name1=sc.nextLine();
//		name2=sc.nextLine();
//		name3=sc.nextLine();
//		
//		Assign1_Student s= new Assign1_Student(name1,name2,name3);
//		s.result();
	}
	
	

