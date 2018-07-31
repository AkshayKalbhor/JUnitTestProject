package me.kalbhor.akshay.JUnitTestProject;

public class Calculator {

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public int adder(int a, int b) {
		return a+b;
	}
	
	/**
	 * @author kalbhor
	 * @param a
	 * @param b
	 * @return 
	 */
	public int multiplier(int a,int b) {
		return a*b;
	}
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public int subtractor(int a, int b) {
		int result = a-b;
		if(result < 0) {
			return 0;
		} else {
			return result;	
		}
	}
}
