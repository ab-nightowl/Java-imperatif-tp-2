package fr.operateurs.console;

import java.util.Scanner;

public class OperateursApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("***** Application Opérateurs ***** \n Veuillez saisir le premier nombre...");
		
		Scanner questionUser = new Scanner(System.in);
		int a = questionUser.nextInt() ; //question 1

		System.out.println("Veuillez saisir le second nombre...");
		
		Scanner questionUser2 = new Scanner(System.in);
		int b = questionUser2.nextInt() ; //question 2
		
		int res1 = a + b;
		System.out.println(a + " + " + b + " = " + res1);
		
		int res2 = a - b;
		System.out.println(a + " - " + b + " = " + res2);
		
		int res3 = a * b;
		System.out.println(a + " * " + b + " = " + res3);
		
		float res4 = (float)a / (float)b;
		System.out.println(a + " / " + b + " = " + res4);
		
		int res5 = a % b;
		System.out.println(a + " % " + b + " = " + res5);
	}

}
