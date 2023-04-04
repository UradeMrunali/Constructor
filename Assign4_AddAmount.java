
public class Assign4_AddAmount {
 int amount=50;
 
 Assign4_AddAmount()
 {
	 System.out.println("no amount will be added to the piggie bank");
	  amount=00;
 }
 
 Assign4_AddAmount(int amount)
 {
	 System.out.println("Final Amount");
	 this.amount=amount;
 }
  
 void finalamount()
 {
	System.out.println(amount); 
 }
 
 public static void main(String[] args) {
	 Assign4_AddAmount a= new  Assign4_AddAmount(8200000);
	 
	 a.finalamount();
}
 
}
