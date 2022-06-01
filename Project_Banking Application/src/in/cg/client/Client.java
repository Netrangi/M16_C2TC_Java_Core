package in.cg.client;

import in.cg.application.MMBankFactory;
import in.cg.application.MMCurrentAcc;
import in.cg.application.MMSavingAcc;
import in.cg.framework.BankFactory;
import in.cg.framework.CurrentAcc;
import in.cg.framework.SavingAcc;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BankFactory p=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(23456788,"Netrangi Joshi",500000,true);
		CurrentAcc c=new MMCurrentAcc(23456789,"Ranjana Joshi",400000,40000);
		System.out.println("Saving Account");
		s.withdraw(s.getAccBal());
		System.out.println("Current Account");
		c.withdraw(c.getAccBal());
		System.out.println(s);
		System.out.println(c);

	}

}