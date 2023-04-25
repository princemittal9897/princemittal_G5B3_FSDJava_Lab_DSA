
package com.gl.balancingBrackets.model;

import java.util.Stack;

public class BracketsBalanceOrNot {

	public static boolean checkBalancedBrackets(String inputString) {
		Stack<Character> stack = new Stack<Character>();
		char[] charArr = inputString.toCharArray();
		for (char i : charArr) {
			if (i == '(' || i == '[' || i == '{')
				stack.push(i);
			else {
				char top = stack.peek();
				if (i == ')' && top == '(' || i == '}' && top == '{' || i == ']' && top == '[')
					stack.pop();
				else
					return false;
			}
//			System.out.println(stack);

		}
		if (stack.empty())
			return true;
		else
			return false;
	}
}