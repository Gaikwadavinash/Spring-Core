package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;
@Component("bireplacer")

public class BankLoanIntrestCalculatorReplacer implements MethodReplacer{

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("BankLoanIntrestCalucatorReplacer.reimplement(-,-,-)(Simple Intrest amount)");
		float pAmt=(float)args[0];
		float rate=(float)args[1];
		float time=(float)args[2];

		//intrest calcualation (simple intrest calculation)
		return (pAmt*rate*time)/100.0f;
		
	}
}
