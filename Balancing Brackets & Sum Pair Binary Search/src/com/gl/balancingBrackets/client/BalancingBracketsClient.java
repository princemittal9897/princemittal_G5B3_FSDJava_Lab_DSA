package com.gl.balancingBrackets.client;

import com.gl.balancingBrackets.model.BracketsBalanceOrNot;

public class BalancingBracketsClient {

	public static void main(String[] args) {
		String inputString = "({[()]})";
		boolean flag;
		flag = BracketsBalanceOrNot.checkBalancedBrackets(inputString);
		if(flag)
			System.out.println("InputString is balanced.");
		else
			System.out.println("InputString is not balanced.");
	}
}
