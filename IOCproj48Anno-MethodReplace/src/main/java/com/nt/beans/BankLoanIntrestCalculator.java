//mainClass
package com.nt.beans;
import java.lang.Math;
public class BankLoanIntrestCalculator {

	public float calculateIntrestAmmount(float pAmt, float rate, float time) {
		System.out.println("BankLoanIntrestCalculator.calculateIntrestAmmount()---Compound Intrest");

		return (float) (pAmt * Math.pow((1 + (rate / 100)), time)) - pAmt;
	}
}
