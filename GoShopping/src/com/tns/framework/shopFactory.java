package com.tns.framework;

public interface shopFactory {
	
	public PrimeAcc getNewPrimeAccount(int AccNo,String accNm,float charges,boolean isPrime);
	
	public NormalAcc getNewNormalAcc(int AccNo,String accNm,float charges,float deliveryCharges);
	
}
