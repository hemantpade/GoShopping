package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc {
		private boolean isPrime;
		private static final float deliveryCharges = 0;
		
		
		public boolean isPrime() {
			return isPrime;
		}
		@Override
		public void bookProduct(float a) {
			
		}

		@Override
		public String toString() {
			return "PrimeAcc [isPrime=" + isPrime + "]";
		}

		public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
			super(accNo, accNm, charges);
			this.isPrime = isPrime;
		}

		
		
		
}
