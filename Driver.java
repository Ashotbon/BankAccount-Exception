package Main;


public class Driver {

	public static void main(String[] args) throws BankAccountException {
		// TODO Auto-generated method stub
     BankAccount bankAccount1= new BankAccount("Ashot Harutyunyan", 200);
     BankAccount bankAccount2= new BankAccount("Meri Harutyunyan", 0);
     System.out.println(bankAccount1.getName()+" has $"+bankAccount1.getbalance()+" in his balance.");
     System.out.println(bankAccount2.getName()+" has $"+bankAccount2.getbalance()+ " in her balance.");
     bankAccount1.deposit(300);
     System.out.println(bankAccount1.getName()+"'s final balance is " +bankAccount1.getbalance());
     bankAccount2.deposit(600);
     
     System.out.println(bankAccount2.getName()+"'s final balance is " +bankAccount2.getbalance());
	}

}
