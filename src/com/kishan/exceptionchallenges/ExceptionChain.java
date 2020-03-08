package com.kishan.exceptionchallenges;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Kishankumar Feb 23, 2020
 */
public class ExceptionChain {

	/*
	 * Java 7 introduced chaining of exceptions using '|'(pipe) symbol, while
	 * chaining there cannot be parent child exceptions mentioned and it should
	 * not have any relationship
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			int numerator = sc.nextInt();
			int denominator = sc.nextInt();
			int result = 0;
			result = numerator / denominator;
			System.out.println("Result of " + numerator + "/" + denominator + " is::" + result);
		} catch (ArithmeticException | InputMismatchException e) {
			// catch (ArithmeticException | InputMismatchException e) { --> not allowed as Exception is root/parent of other exceptions
			System.out.println("Exception::" + e.getMessage());
			e.printStackTrace();
		} finally { // We can have only try - finally as well
			System.out.println("Finally executed!");
			sc.close();
		}
	}

}
