package com.tns.framework;

public abstract class NormalAcc extends ShopAcc {
		private final float deliveryCharges;
		
		public float getDeliveryCharges() {
			return deliveryCharges;
		}
		
		
		public void bookProduct(float a) {
			
		}

        
		@Override
		public String toString() {
			return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
		}


		public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
			super(accNo, accNm, charges);
			this.deliveryCharges = deliveryCharges;
		}
		
		
}
