
public class Assign5_Programming {
  String name;
  
  Assign5_Programming()
  {
	  System.out.println("I love Programming Languages");
	  name=null;
  }
  
  Assign5_Programming(String name)
  {
	  System.out.print("I Love ");
	  this.name=name;
	  this.getData();
  }
  
  void getData(){
	  System.out.println(name);
  }
  
  public static void main(String[] args) {
	Assign5_Programming p = new Assign5_Programming("Asterisc");
	
}
}
