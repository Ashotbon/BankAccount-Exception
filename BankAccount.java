package Main;

class BankAccount {

	private String name; // your name
	private double balance; // current amount of money you save in the bank account
	private final static double depositLimit = 500;
	private final static double withdrawLimit = 500;

	/** constructor */
	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	/** constructor */
	public BankAccount(String name) {
		this(name, 0);
	}

	/** return balance */
	public double getbalance() {
		return balance;
	}

	/** return name */
	public String getName() {
		return name;
	}

	public String toString() {
		return "Name: " + name + "\n" + "balance: " + balance;
	}

	/** deposit money into the account */

	public void deposit(double depositAmount) throws BankAccountException {

//		if (depositAmount <= 0) {
//			throw new InvalidAmountException("Amounmt is non positive.");
//		}
//
//		if (depositAmount > depositLimit) {
//			throw new DepositLimitException("The amount is greater than the deposit limit.");
//		}
//		
//		balance += depositAmount;
		try {
		    if (depositAmount > depositLimit) {
		        throw new DepositLimitException("The amount is greater than the deposit limit.");
		    } else if (depositAmount <= 0) {
		        throw new InvalidAmountException("Amount is non positive.");
		    } else {
		        balance += depositAmount;
		    }
		} catch (DepositLimitException e) {

		    System.out.println("Deposit Limit Exception: " + e.getMessage());
		
		} catch (InvalidAmountException e) {
		  
		    System.out.println("Invalid Amount Exception: " + e.getMessage());
	
		} catch (Exception e) {
	
		    System.out.println("An unexpected exception occurred: " + e.getMessage());
		    
		}

	}

	/** withdraw money from the account */
	public void withdraw(double withdrawAmount) throws BankAccountException {
// TODO
//		if (withdrawAmount<= 0) {
//			throw new InvalidAmountException("Amounmt is non positive.");
//		}
//
//		if (withdrawAmount > withdrawLimit) {
//			throw new WithdrawLimitException("he amount is greater than the withdraw limit.");
//		}
//		
//		if (withdrawAmount > balance) {
//			throw new NotEnoughBalanceException("The amount is greater than the current balance. ");
//		}
//		balance-=withdrawAmount;
		try {
		    if (withdrawAmount > withdrawLimit) {
		        throw new WithdrawLimitException("The amount is greater than the withdraw limit.");
		    } else if (withdrawAmount<= 0) {
		        throw new InvalidAmountException("Amount is non positive.");
		    } else if (withdrawAmount > balance){
		    	throw new NotEnoughBalanceException("The amount is greater than the current balance. ");
		    } else {
		    	balance-=withdrawAmount;
		    }
		} catch (WithdrawLimitException e) {

		    System.out.println("Withdraw Limit Exception: " + e.getMessage());
		
		} catch (InvalidAmountException e) {
		  
		    System.out.println("Invalid Amount Exception: " + e.getMessage());
		
		} catch (NotEnoughBalanceException e) {
			  
		    System.out.println("Not Enought Balance Exception: " + e.getMessage());
		    
		} catch (Exception e) {
	
		    System.out.println("An unexpected exception occurred: " + e.getMessage());
	}

}
}
