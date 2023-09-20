package assignment;

import java.util.Scanner;

public class payrollComputation {
	
	public static final double tax = 0.02;

	public static void main(String[] args) {
		
		Scanner empNo = new Scanner(System.in);
		Scanner empName = new Scanner(System.in);
		Scanner empDesg = new Scanner(System.in);
		Scanner daysWorked = new Scanner(System.in);
		Scanner payRate = new Scanner(System.in);
		Scanner genDate = new Scanner(System.in);
		
		System.out.print("ENTER THE EMPLOYEE NUMBER TO GENERATE PAYSLIP:  ");
		int no = empNo.nextInt();
		System.out.print("ENTER THE EMPLOYEE NAME: ");
		String name = empName.nextLine();
		System.out.print("ENTER THE EMPLOYEE DESIGNATION: ");
		String desg = empDesg.next();
		System.out.print("ENTER THE DAYS WORKED: ");
		int days = daysWorked.nextInt();
		System.out.print("ENTER THE PAY RATE: ");
		int rate = payRate.nextInt();
		System.out.print("ENTER THE GENERATION DATE: ");
		String date = genDate.nextLine();
		int basicPay = days * rate;
		int pf = (int) basicPay/10;
		double profTax = (double)basicPay * tax ;
		int totalDeduct =  pf +  (int)profTax;
		int netPay = basicPay - totalDeduct;
		
		
		System.out.println("\n\t\tSHREE KRISHNA CHEMIST AND DRUGGIST");
		System.out.println("\t\t\tSALARY MONTH 9 2013");
		System.out.println("EMP. NO.: " +no+ "\t\t EMP NAME: " +name+ "\t\t DESIGNATION: " +desg );
		System.out.println("DAYS WORKED: " +days+ "\t\t PAY RATE: " +rate+ "\t\t GEN. DATE: " +date);
		
		System.out.println("____________________________________________________________________________");
		System.out.println("EARNINGS \t\t AMOUNT(RS. ) \t\t DEDUCTION \t AMOUNT(RS. )");
		System.out.println("____________________________________________________________________________");
		System.out.println("BASIC PAY \t\t " +basicPay+ "\t\t\t P.F \t\t\t" +pf );
		System.out.println("\t\t\t\t\t\t PROF. TAX \t\t" +profTax );
		System.out.println("____________________________________________________________________________");
		System.out.println("\nGROSS EARN \t\t" +basicPay+ "\t\t\tTOTAL DEDUCT. \t\t" +totalDeduct );
		System.out.println("\t\t\t\t\t\t NET PAY \t\t" +netPay);
		System.out.println("____________________________________________________________________________");
		
		
		
		
		
		
		
		
		

	}

}
