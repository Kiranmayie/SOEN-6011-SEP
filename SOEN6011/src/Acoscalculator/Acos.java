package Acoscalculator;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner; 

	
	/**
	 * @author Kiranmayie
	 * The Class Acos.
	 */
	class Acos 
		{ 
			
		/**
		 * Sum.
		 *
		 * @param x the x
		 * @return the double
		 */
		static double sum(double x) 
		{ 
			double total; 
				total = x + (x*x*x)/6 + (x*x*x*x*x)/40 ;
			if(total>0 && total<Math.PI)
			{	
				System.out.println( "The result is in the range of 0 to PI");
			}
			return total; 
		} 
		
		/**
		 * Acoscalculator.
		 *
		 * @param x the x
		 * @return the double
		 */
		public static double acoscalculator(double x) {
			double a=Math.PI/2;
			double total = 0;
			if(x<1 && x>-1)
			{
				total= a-sum(x) ; 
			}
			else if(x==1)
			{
				System.out.println("0 radians");
				
			}
			else if(x==-1)
			{
				System.out.println(Math.PI);
				
			}
			else
			{
				System.out.println("Give a valid input which is in the domain of arc cosine [-1<x<1]");
				 
			}
			
				
			return total;
		}
		
		/**
		 * The main method.
		 *
		 * @param args the arguments
		 * @throws IOException Signals that an I/O exception has occurred.
		 * @throws InputMismatchException the input mismatch exception
		 */
		public static void main(String[] args) throws IOException, InputMismatchException
		{ 
			Scanner sc=new Scanner(System.in);
			double x=sc.nextDouble();
			
			System.out.printf("%2f radians" , acoscalculator(x));
		}
		
		} 
