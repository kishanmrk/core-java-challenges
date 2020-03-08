/**
 * 
 */
package com.kishan.exceptionchallenges;

import java.util.Scanner;

/**
 * @author Kishankumar Feb 23, 2020
 */
public class CustomException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String val = sc.nextLine();
			if (val == null || val.length() == 0) {
				throw new NoInputReceivedException();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

}

class NoInputReceivedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	NoInputReceivedException() {
		super();
	}

	NoInputReceivedException(String message) {
		super(message);
	}
}