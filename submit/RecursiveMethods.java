package eecs2030.lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Winter 2020
 * EECS2030 Lab6 
 * Requirement:
 * You are required to implement all methods recursively.
 * You can make the given method as recursive, or, create recursive helper function.
 * 
 * In any case, you SHOULD NOT USE ANY LOOP IN THIS LAB!!!
 * 
 * You receive a zero if there is any occurrence of a loop (e.g., for, while). 
 *  
 * <p><strong> Do not use a loop. Use only recursion.
 *  Solutions using loop will not receive credit.</strong></p>
 * 
 */

public class RecursiveMethods {
	
	
	/**
	 * <p> Complete the function that returns a String 
	 * containing {@code n} occurrences of character {@code c} . </p>
	 * 
	 * <pre>
	 *  Example:
	 *  repeatCharNTimes(2, 'd')  return  "dd"
	 *  repeatCharNTimes(3, 'c')  return  "ccc"
	 *  repeatCharNTimes(5, 'a')  return  "aaaaa"
	 * </pre>
	 * 
	 * Note:
	 * You should do recursion on the given method, or create a recursive helper function.
	 * NO LOOP SHOULD BE USED!!  
	 * 
	 *  
	 * @param n : 
	 * 			Number of occurrence 
	 * @param c:
	 * 			Char to be repeated 
	 * 
	 * @return
	 * 		return String containing {@code n} occurrences of character {@code c}.
	 * 
	 * @pre. 
	 * 		{@code n >= 0}.
	 */
	public String repeatCharNTimes(int n, char c) {
		// COMPLETE THIS
		// make this method recursive, or, call a recursive helper function
		if(n == 0) {
			return "";
		}
		else {
			return ""+c+repeatCharNTimes(n-1, c);
		}
	}


	/**
	 * <p> Complete a function returns Yorknacci number y(n). </p>
	 * 
	 * <p> Recall the Fibonacci numbers: Fibonacci number an is defined as the sum of
	 * the 2 previous Fibonacci numbers: a(n) = a(n-1)+a(n-2), with a(0) =0,  a(1) = a(2) = 1..
	 * Based on Fibonacci numbers, we define the Yorknacci numbers as the list of numbers
	 * where Yorknacci number y(n)  is defined as <strong> the sum of the previous 3
	 * Yorknacci numbers if n is odd and the sum of the previous 2 Yorknacci numbers if n is even.</strong>
	 * The first three Yorknacci numbers y(0), y(1), and y(2) are 1. 
	 * {@code y(0)=y(1)=y(2)=1}
	 * 
	 *  <pre>
	 *  Example:
	 *  yorknacci(0)  return 1 
	 *  yorknacci(1)  return 1
	 *  yorknacci(2)  return 1
	 *  yorknacci(3)  return 3
	 *  yorknacci(4)  return 4    
	 *  yorknacci(5)  return 8 
	 * 
	 *  *  </pre>
	 *   * 
	 *   
	 * You should do recursion on the given method, or create a recursive helper function.
	 * NO LOOP SHOULD BE USED!!
	 * 
	 * @param n :
	 * 			integer value for Yorknacci,  {@code n>=0 }
	 * 
	 * @return
	 * 			Return Yorknacci number y(n).
	 * 
	 * @pre. {@code n>=0}
	 */
	public int yorknacci(int n) {
		// COMPLETE THIS
		// make this method recursive, or, call a recursive helper function
		if(n==0||n==1||n==2) {
			return 1;
		}else {
			if(n%2==1) {
				return yorknacci(n-1)+yorknacci(n-2)+yorknacci(n-3);
			}
			else {
				return yorknacci(n-1)+yorknacci(n-2);
			}
		}	
	}
	
	
	/**
	 * 
	 * <p> Complete the function numberOfFirstChar0, which 
	 * returns the number of times the first char of string {@code str}
	 * appears in string {@code str}.
	 * </p>
	 * 	 *   
	 * <p> Hint: You can use String functions such as charAt, length, and substring.</p>
	 *  
	 *  <pre>
	 *  Example:
	 *  numberOfFirstChar0("")  return 0 , empty string 
	 *  numberOfFirstChar0("bbbcfreb$b") return  5
	 *  numberOfFirstChar0("beqbecb$bbb") return  6
	 *  
	 *  </pre>
	 * 
	 * You should do recursion on the given method, or create a recursive helper function.
	 * NO LOOP SHOULD BE USED!!
	 *  
	 * @param str   is not null String 
	 * 
	 * @return
	 * 			the number of times
	 * 			the first char of string str appears in the string str.
	 * 			
	 * 
	 * @pre. 
	 * 		{@code str }   is not null String 
	 */
	public int numberOfFirstChar0(String str) {
		// COMPLETE THIS
		// make this method recursive, or, call a recursive helper function
		if(str.equals("")) {
			return 0;
		}else {
			if(str.charAt(0)==str.charAt(str.length()-1)) {
				return 1 + numberOfFirstChar0(str.substring(0, str.length()-1));
			}
			else {
				return 0 + numberOfFirstChar0(str.substring(0, str.length()-1));
			}
		}
	}
	
	  
	
	/*******************************************************************************
	 * 
	 * <p> Complete function numberOfFirstChar, which  
	 * returns the number of times the first char of string {@code str}
	 * appears AT THE BEGINING of the given string {@code str}.
	 * </p>
	 * 
	 *  
	 *   
	 * <p> Hint: You can use String functions such as charAt, length, and substring.</p>
	 *  
	 *  <pre>
	 *  Example:
	 *  numberOfFirstChar("")  return 0 , empty string 
	 *  numberOfFirstChar("bbbcfreb$b") return  3    (b appears 3 times at the BEGINING)
	 *  numberOfFirstChar("beqecb$bbb") return  1    (b appears once at the BEGINING)
	 *  
	 *  </pre>
	 * 
	 * You should do recursion on the given method, or create a recursive helper function.
	 * NO LOOP SHOULD BE USED!!
	 *  
	 * @param str   is not null String 
	 * 
	 * @return
	 * 			the number of times
	 * 			the first char of string str appears at the beginning of string str.
	 * 			
	 * 
	 * @pre. 
	 * 		{@code str }   is not null String 
	 */
	public int numberOfFirstChar(String str) {
		if(str.equals("")) {
			return 0;
		}if(str.charAt(0)!=str.charAt(1)) {
			return 1;
		}else {
			return 1 + numberOfFirstChar(str.substring(1));
		}
		// COMPLETE THIS
		// make this method recursive, or, call a recursive helper function
	}

		
	/*************************************************************
	 * <p> Complete the function that returns the 'largest' char in the argument string.
	 * A char is larger than the other if it appears later in the ASCII table than the other char.
	 * 
	 * Assume the string is non-empty
	 * 
	 * <pre>
	 *  Example:
	 * maxChar("x") returns 'x'
	 * maxChar("Hello") returns 'o' 
	 * maxChar("abc123c") returns 'c'
	 * 
	 * You should do recursion on the given method, or create a recursive helper function.
	 * NO LOOP SHOULD BE USED!!
	 *  
	 * @param s the string to examine 
	 * @return  the max char in s
	/**************************************************************/
	public char maxChar (String s) {
		// COMPLETE THIS
		// make this method recursive, or, call a recursive helper function
		if(s.length()==1) {
			return s.charAt(0);
		}
		
		else {
			if(s.charAt(0)>s.charAt(s.length()-1)) {
				char max = maxChar(s.substring(0, s.length()-1));
				return max;
			}
			else {
				char max = maxChar(s.substring(1));
				return max;
			}
		}
	}

	/*************************************************************
	 * 
	 * <p> Complete the function that calculates the power of base to the power of n.
	 * Assume a and n are all integers, but a and n can be positive and negative.
	 *  
	 * 
	 * <pre>
	 *  Example:
	 * power(2, 4) returns 16
	 * power(-2, 3) returns -8
	 * power(2, -2) returns 0.25 
	 *
	 * You should do recursion on the given method, or create a recursive helper function.
	 * NO LOOP SHOULD BE USED!!
	 *
	 *
	 * @param base the base
	 * @param n the power 
	 * @return  the power of base^b
	/**************************************************************/
	public double power (int base, int n) {
		if(n==0) {
			return 1;
		}
		if(n>0){
			return base * power(base, n-1);
		}
		else {
			return 1/power(base, Math.abs(n));
		}
		// COMPLETE THIS 
		// make this method recursive, or, call a recursive helper function
	}
	
	
	/*************************************************************
	 * Complete the function that calculates the sum of the integes in the given Integer List.
	 * If the list is empty, return 0
	 *  
	 * Hint: you may consider the subList() method defined in List interface, or, write a helper methods.
	 * 
	 * You should do recursion on the given method, or create a recursive helper function.
	 * NO LOOP SHOULD BE USED!!  
	 *   
	 * @param list the list of Integers
	 * @return sum of values in the list. Return 0 is the list is empty.
	/**************************************************************/
	public int sum (List <Integer> list) {
		// COMPLETE THIS
		// make this method recursive, or, call a recursive helper function
		if(list.isEmpty()) {
			return 0;
		}
		if(list.size()==1) {
			return list.get(0);
		}
		else {
			return list.get(0) + sum(list.subList(1, list.size()));
		}
		
	}
	
	
	
    /*************************************************************
	 * <p> Complete the function that determines if argument string s
	 * is a palindrome. A palindrome is string that reads the same backward as forward, e.g., "madam"
	 *
	 *You should do recursion on the given method, or create a recursive helper function.
	 * NO LOOP SHOULD BE USED!!
	 *
	 *@param s the string to examine
	 *@returns ture if the string is a palindrome, false otherwise
	 ***************************************************************/
	public boolean isPalindrome(String s)
	{
		// COMPLETE THIS
		// make this method recursive, or, call a recursive helper function
		if(s.isEmpty()) {
			return true;
		}if(s.length()==1) {
			return true;
		}if(s.charAt(0)==s.charAt(1)) {
			return true;
		}else {
			return (s.charAt(0)==s.charAt(s.length()-1))&&isPalindrome(s.substring(1, s.length()-1));
		}
	}
	
	/*************************************************************
	 * <p> Complete the function that determines the number of even digits in the argument integer,
	 * including 0.
	 * 
	 * Assume n is >= 0
	 * <pre>
	 * Example:
	 * evenDigits(0) returns 1, as there are one even digit.
	 * evenDigits(3) returns 0, as there are no even digits.
	 * evenDigits(2030) returns 3, as there are three even digits: 2 0 0
	 * evenDigits(1237) returns 1, as there are one even digits: 2
	 * evenDigits(765342) returns 3, as there are three even digits: 6 4 2
	 * 
	 * You should do recursion on the given method, or create a recursive helper function.
	 * NO LOOP SHOULD BE USED!!
	 *  
	 *  
	 * @param n non-negative integer to examine
	 * @return  number of even digits in n
	 ***************************************************************/
	public int evenDigits(int n)
	{
		// COMPLETE THIS
		// make this method recursive, or, call a recursive helper function
		if((n<10&&n%2==0)||n==0) {
			return 1;
		}
		if(n<10&&n%2!=0) {
			return 0;
		}
		else {
			if(n%2==0) {
				return 1 + evenDigits(n/10);
			}else {
				return 0 + evenDigits(n/10);
		    }
		}
	}
	
	
	/*************************************************************
	 * 
	 * <p> Complete the function that, given the scanner of a disk file,  
	 * prints the content of a file, line by line.
	 * Assume the file has n lines, where n is a even number, 
	 * Then this method prints the lines in the following order
	 * 
	 * line n-1
	 * line n
	 * line n-3
	 * line n-2
	 * ....
	 * line 3
	 * line 4
	 * line 1
	 * line 2
	 * 
	 * In the example file given, there are 8 lines. This method should print
	 * line 700
	 * line 800
	 * line 500
	 * line 600
	 * line 300
	 * line 400
	 * line 100
	 * line 200
	 * 
	 * 
	 * You should do recursion on the given method, or create a recursive helper function.
	 * NO LOOP SHOULD BE USED!!
	 *  
	 * @param scan Scanner of a disk file 
	 *  
	/**************************************************************/
	public void printLines(Scanner scan) {
		// COMPLETE THIS
		// make this method recursive, or, call a recursive helper function
		int n = 1;
		String preLine = "";
		System.out.println(printLinesHelper(n, scan.nextLine(), preLine, scan));
		
	}
	public String printLinesHelper(int n, String currentLine, String preLine, Scanner scan) {
		if(!scan.hasNextLine()) {
			return preLine + "\n" + currentLine;
		}
		if(n%2!=0) {
			return printLinesHelper(n+1, scan.nextLine(), currentLine, scan);
		}else {
			return printLinesHelper(n+1, scan.nextLine(), currentLine, scan)+"\n"+preLine+"\n"+currentLine;
		}
	}
	
	
	/************** two bonus methods ********************************************/
	
	/** 
	 * <p> Complete the function that converts any  decimal number {@code n > 0 }  and {@code n <= 65535} 
	 * into a binary number, return an array represents  the binary number </p>
	 * 
	 * <p>
	 * a binary (base-2) number. A binary number is made up 
	 * of one or more binary digits called bits. A bit has a value that is equal to
	 *  either 0 or 1.
	 * </p>
	 * 
	 * 
	 * <pre>
	 *  Example:
	 * IntegerToBinary (1)   return [1], where (1*1) = 4 
	 * IntegerToBinary (4)   return [1, 0, 0], where (0*1)+(0*2)+(1*4) = 4 
	 * IntegerToBinary (9)   return [1, 0, 0, 1], where (1*1)+(0*2)+(0*4)+(1*8) = 9
	 * IntegerToBinary (13)  return [1, 1, 0, 1], where (1*1) + (1*4)+(1*8) =13
	 * IntegerToBinary (31)  return [1, 1, 1, 1, 1], where (1*1)+(1*2)+(1*4)+(1*8)+(1*16) =31
	 * </pre>
	 * 
	 * Hint: number of bits needed to represent a number n can be calculated as log2^n +1
	 * The provided file "Number System.pdf" contains information on how to convert a decimal number to is 
	 * binary representation.
	 * 
	 * 
	 * You should do recursion on the given method, or create a recursive helper function.
	 * NO LOOP SHOULD BE USED!!
	 * 
	 * @param n
	 * 			positive integer 
	 * @return  array  represents  the binary number
	 *  
	 * @pre.
	 * 		{@code n > 0 }
	 */
	public int []  IntegerToBinary (int n) {
		// COMPLETE THIS
		// make this method recursive, or, call a recursive helper function 
		int numberofbits = (int) (Math.log(n)/Math.log(2))+1;
		int [] a = new int[numberofbits];
		IntegerToBinaryHelper(n, a, numberofbits);
		return a;
	}
	public void IntegerToBinaryHelper(int n, int[] result, int index) {
		if(index == 1) {
			result[0] = n%2;
		}
		else {
			//index--;
			result[index-1] = n%2;
			n = (int)n/2;
			index--;
			IntegerToBinaryHelper(n, result, index);
		}
	}
	
	 
	
	/*******************************************************************
	 * Complet the method that returns whether or not an array represents the first n numbers of an arithmetic sequence.
	 * An arithmetic sequence has a common difference between every two adjacent terms.   
	 * The array may or may not be empty.
	 * an empty array is considered true.
	 * an array of one element is also considered true.
	 * any array of two elements is also considered true.
	 * e.g., 
	 * isArithmeticArray({1, 3, 5}) returns true (because the common difference is 2)
	 * isArithmeticArray({1, 3, 8}) returns false
	 * isArithmeticArray({1, 3, 5, 8, 10}) returns false 
	 * isArithmeticArray({1, 3, 5, 7, 9}) returns true (because the common difference is 2).
	 * 
	 * You should do recursion on the given method, or create a recursive helper function.
	 * NO LOOP SHOULD BE USED!!
	 * 
	 * @param a an array
	 * @return true if input array a represents an arithmetic sequence; false otherwise.
	 * 
	 */
	 public boolean isArithmeticArray(int[] a) {
		// COMPLETE THIS
		// make this method recursive, or, call a recursive helper function
		 if(a.length==0||a.length==1||a.length==2) {
			 return true;
		 }else {
			 return isArithmeticArrayHelper(2, a[1]-a[0], a);
		 }
	}
	
	public boolean isArithmeticArrayHelper(int i, int diff, int[] a) {
		if(i<a.length) {
			return a[i]-a[i-1] == diff && isArithmeticArrayHelper(i+1, diff, a);
		}
		return true;
	}
	
	
}