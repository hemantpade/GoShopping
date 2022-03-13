package com.tns.application;
import com.tns.framework.*;

public class GSNormalAcc extends NormalAcc {
	

		public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		// TODO Auto-generated constructor stub
	}

		@Override
		public String toString() {
			return "GSNormalAcc []";
		}

		@Override
		public float getDeliveryCharges() {
			// TODO Auto-generated method stub
			return super.getDeliveryCharges();
		}

		@Override
		public void bookProduct(float a) {
			// TODO Auto-generated method stub
			super.bookProduct(a);
		}

		@Override
		public void items(float x) {
			// TODO Auto-generated method stub
			
		}
		
}
