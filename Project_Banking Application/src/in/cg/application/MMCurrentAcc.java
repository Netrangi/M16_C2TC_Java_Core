package in.cg.application;

import in.cg.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc
{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}

	@Override
	public String toString()
	{
		return String.format("MMCurrentAcc [toString()=%s]", super.toString());
	}
	
}
