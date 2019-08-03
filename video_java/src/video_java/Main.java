package video_java ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		System.out.println("Hello world !");
		System.out.println("Hello world2 !");
		*/
		/*
		int a = 32 ;
		int another = 20 ;
	
		double b = 3.14 ;
		float c = 3.14f ;
		char d = 'd' ;
		String name = "Onur ";
		System.out.println(a);
		System.out.println("Hello World " + name);
		System.out.println("Hello World " + "Onur");
		System.out.println(a/(double)another);
		Scanner scanner = new Scanner(System.in) ;
		a= scanner.nextInt() ;
		another = scanner.nextInt() ;
		System.out.println(a+another);
		*/
		/*
		int age ;
		Scanner scanner = new Scanner(System.in)  ;
		age = scanner.nextInt() ;
		if (age > 18 ) {
			System.out.println("You can vote!");
		}
		else {
			System.out.println("You cannot vote");
		}
		int process ;
		while (true) {
			process = scanner.nextInt() ;
			if (process == -1) {
				System.out.println("Exiting program...");
				break;
			}
			else {
				System.out.println("Continue to take number...");
			}
		}
	*/
		Scanner scanner = new Scanner(System.in) ;
		int op ;
		op = scanner.nextInt() ;
		switch(op) {
			case 1:
				System.out.println("case 1 ");
				break ;
			case 2 :
				System.out.println("case 2");
				break ;
			default :
				System.out.println("case 1 yada 2 degil...");
			
		}
		
	}
	
	

}
