package com.tns.application;
import java.util.*;
import com.tns.framework.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	static int order() {
//		GSNormalAcc user = new GSNormalAcc(0, "default", 0, false);
		NormalAcc user = new GSNormalAcc(0, "default", 0, 0);

		String[] items = { "Mobile", "Laptop", "Watch", "Shirt", "T-shirt" };
		int charges[] = { 10000, 50000, 2000, 800, 400 };

		System.out.println("Enter product number(1-5):");
//		Product Number
		int productNo = sc.nextInt();
		switch (productNo) {
		case 1: {
			System.out.println(items[0] + " Rs." + charges[0]);
			//user.bookProduct(productNo);
			break;
		}
		case 2: {
			System.out.println(items[1] + " Rs." + charges[1]);
			//user.bookProduct(productNo);
			break;
		}
		case 3: {
			System.out.println(items[2] + " Rs." + charges[2]);
			//user.bookProduct(productNo);
			break;
		}
		case 4: {
			System.out.println(items[3] + " Rs." + charges[3]);
			//user.bookProduct(productNo);
			break;
		}
		case 5: {
			System.out.println(items[4] + " Rs." + charges[4]);
			//user.bookProduct(productNo);
			break;
		}
		}

		return charges[productNo - 1];
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fill your details");
	 	System.out.println("Enter your Account no:");
	    int accNo;
	    accNo = sc.nextInt();
		System.out.println("Enter your Name:");
		String accNm;
		sc.nextLine();
		accNm = sc.nextLine();
		float charges;
		boolean isPrime;
		float deliveryCharges = 50;
		float total = 0;
		GSNormalAcc nn = new GSNormalAcc(accNo, accNm, 0, deliveryCharges);
	    GSPrimeAcc pn = new GSPrimeAcc(accNo, accNm, 0, true);

		System.out.println("Welcome to GoShopping ");
		
			System.out.println("--------------login-----------------");
			System.out.println("press 1.prime account\n2.Normal account");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter your account number");
				choice = sc.nextInt();
				if (choice == pn.getAccNo()) {
					pn.items(0);
					total = order() + pn.getdeliverycharges();
					System.out.println("You have to pay" + total);
				}

				break;
			case 2:// Normal Account
				System.out.println("enter your account number");
				choice = sc.nextInt();
				if (choice == nn.getAccNo()) {
					nn.items(0);
					total = order() + deliveryCharges;
					System.out.println("You have to pay" + total);
				}
				break;

			default:
				System.out.println("Invalid input");
				break;

			}

	
}
	}