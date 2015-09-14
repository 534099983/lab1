package lab1;

import java.util.Scanner;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class lab1 {

	public static void main(String[] args) {
	
		double r;
		double n;
		double y;
		double p;
		double f;
		boolean t;

		double PV;
		//Enter the annual return for PV
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter the annual return for PV:");
		double number1 = input1.nextDouble();
		//identify annual return
		while (number1 < 0 || number1 > 0.2) {
			System.out.println("Annual return should be between 0% to 20% ");
			Scanner input8 = new Scanner(System.in);
			System.out.println("Enter the annual return for PV:");
			double number12 = input8.nextDouble();
			number1 = number12;
		}
			//Enter the years to retired for PV
			Scanner input2 = new Scanner(System.in);
			System.out.println("Enter the years to retired for PV:");
			double number2 = input2.nextDouble();

			//Enter the required income
			Scanner input3 = new Scanner(System.in);
			System.out.println("Enter the required income :");
			double number3 = input3.nextDouble();

			//Enter the monthly SSI
			Scanner input4 = new Scanner(System.in);
			System.out.println("Enter the monthly SSI :");
			double number4 = input4.nextDouble();

			//Enter the annual return for PMT
			Scanner input5 = new Scanner(System.in);
			System.out.println("Enter the annual return for PMT:");
			double number5 = input5.nextDouble();
			//identify annual return
			while (number5 < 0 || number5 > 0.03) {
				System.out.println("Annual return should be between 0% to 3% ");
				Scanner input9 = new Scanner(System.in);
				System.out.println("Enter the annual return for PV:");
				double number10 = input9.nextDouble();
				number5 = number10;
			}

			//Enter the years to retired for PMT
			Scanner input6 = new Scanner(System.in);
			System.out.println("Enter the years to retired for PMT :");
			double number6 = input6.nextDouble();

			r = (number1 / 12);
			n = (number2 * 12);
			y = (number3 - number4);
			f = 0;
			t = false;

			//calculate PV
			PV = FinanceLib.pv(r, n, y, f, t);
			System.out.println(PV);

			double PMT;
			r = (number5 / 12);
			n = (number6 * 12);
			p = 0;
			f = PV;
			t = false;

			//calculate PMT
			PMT = FinanceLib.pmt(r, n, p, f, t);
			System.out.println(PMT);
		}
	}

